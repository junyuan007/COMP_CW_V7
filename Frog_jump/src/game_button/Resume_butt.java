package game_button;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import p4_group_8_repo.MyStage;

/**
 * Class of Button (START animation timer)
 * @author Jun Yuan
 *
 */
public class Resume_butt{

	private String image_link = "/graphic_animation/play.png";
	private Button button;
	private int button_size;
	
	/**
	 * Construct an instance of Resume_butt
	 * @param background is the container for the scene
	 */
	public Resume_butt(MyStage background, int button_size) {
		 this.button_size = button_size;
		 button = new Button();
		 design_button();
		 button.setStyle("-fx-background-color: transparent;");
		 button.setOnAction(e -> background.resume_timer()); 
		 //button.setOnAction(e -> System.out.println("Game Resume")); 

	}
	
	/**
	 * Design and settings of button
	 */
	public void design_button() {
		
		Image image = new Image(image_link, button_size, button_size, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		button.setTranslateY(43);
		
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
