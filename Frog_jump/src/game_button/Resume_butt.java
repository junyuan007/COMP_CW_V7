package game_button;


import game_scene.MyStage;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * Class of Button (START animation timer)
 * @author Jun Yuan
 *
 */
public class Resume_butt{

	private String image_link = "/graphic_animation/play_button.png";
	private Button button;
	private int button_size;
	
	/**
	 * Construct an instance of Resume_butt
	 * @param background is the container for the scene
	 * @param button_size of the resume button
	 */
	public Resume_butt(MyStage background, int button_size) {
		 this.button_size = button_size;
		 button = new Button();
		 design_button();
		 button.setStyle("-fx-background-color: transparent;");
		 ObservableList animation_list = background.getChildren();
		 
		 EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
				@Override
				public void handle(ActionEvent e) {
					background.resume_timer();
					//animation_list.set(36, new Pause_butt(background, 100));
				}};
		 button.setOnAction(event); 

	}
	
	
	
	/**
	 * Design and settings of button
	 */
	public void design_button() {
		
		Image image = new Image(image_link, button_size, button_size - 20, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		button.setTranslateX(30);
		button.setTranslateY(7);
		
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
	 * @return button (Start the animation timer)
	 */
	public Button getButton() {
		return button;
	}
	
	
}
