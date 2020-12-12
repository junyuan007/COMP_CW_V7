package p4_group_8_repo.Game_button;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import p4_group_8_repo.Game_scene.MyStage;

/**
 * Class of Button (STOP animation timer)
 * @author Jun Yuan
 *
 */
public class Pause_butt{

	private String image_link = "/graphic_animation/stop_button.png";
	private Button button;
	private int button_size;
	private int x_position;
	private int y_position;
	
	/**
	 * Construct an instance of Pause_butt
	 * @param background is the container for the scene
	 * @param button_size of the pause button
	 * @param x_position of the button
	 * @param y_position of the button
	 */
	public Pause_butt(MyStage background, int button_size, int x_position, int y_position) {
		 this.button_size = button_size;
		 this.x_position = x_position;
		 this.y_position = y_position;
		 button = new Button();
		 design_button();
		 button.setStyle("-fx-background-color: transparent;");
		 ObservableList animation_list = background.getChildren();
		
		 EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
				@Override
				public void handle(ActionEvent e) {
					background.stop();
				}};
				
		 button.setOnAction(event); 
	}
	
	/**
	 * Design and settings of button
	 */
	public void design_button() {
		Image image = new Image(image_link, button_size, button_size, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		button.setTranslateX(x_position);
		button.setTranslateY(y_position);
		
		//Button Shadow Effect 
		DropShadow shadow = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		button.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	button.setEffect(shadow);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		button.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	button.setEffect(null);
		        }
		});
		
	}
	
	/**
	 * Method to get Button
	 * @return button (Pause the animation timer)
	 */
	public Button getButton() {
		return button;
	}

}
