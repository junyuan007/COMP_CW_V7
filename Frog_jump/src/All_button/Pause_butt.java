package All_button;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import p4_group_8_repo.Actor;
import p4_group_8_repo.MyStage;

/**
 * Class of Button (STOP animation timer)
 * @author Jun Yuan
 *
 */
public class Pause_butt extends Actor{

	String image_link = "/graphic_animation/pause.png";
	Button button;
	
	/**
	 * Construct an instance of Pause_butt
	 * @param background is the container for the scene
	 */
	public Pause_butt(MyStage background) {
		
		 button = new Button();
		 design_button();
		 button.setStyle("-fx-background-color: transparent;");
		 button.setOnAction(e -> background.stop()); 
		 //button.setOnAction(e -> System.out.println("Game Pause")); 
	}
	
	/**
	 * Design and settings of button
	 */
	public void design_button() {
		Image image = new Image(image_link, 60, 60, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		button.setTranslateY(18);
	}
	
	/**
	 * Method to get Button
	 * @return button (Pause the animation timer)
	 */
	public Button getButton() {
		return button;
	}
	
	/**
	 * Empty body
	 */
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
	
	

}