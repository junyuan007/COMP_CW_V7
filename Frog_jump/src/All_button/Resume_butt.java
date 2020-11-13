package All_button;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import p4_group_8_repo.Actor;
import p4_group_8_repo.MyStage;

/**
 * Class of Button (START animation timer)
 * @author Jun Yuan
 *
 */
public class Resume_butt extends Actor{

	String image_link = "/graphic_animation/play.png";
	Button button;
	
	/**
	 * Construct an instance of Resume_butt
	 * @param background is the container for the scene
	 */
	public Resume_butt(MyStage background) {
		
		 button = new Button();
		 design_button();
		 button.setStyle("-fx-background-color: transparent;");
		 button.setOnAction(e -> background.start()); 
		 //button.setOnAction(e -> System.out.println("Game Resume")); 

	}
	
	/**
	 * Design and settings of button
	 */
	public void design_button() {
		
		Image image = new Image(image_link, 50, 50, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		button.setTranslateY(43);

	}
	
	/**
	 * Method to get Button
	 * @return button (Start the animation timer)
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
