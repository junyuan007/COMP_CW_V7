package All_button;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import p4_group_8_repo.Actor;

/**
 * Class of Button (Menu Page -> Game Page)
 * @author Jun Yuan
 *
 */
public class Enter_game_butt extends Actor{
	
	String image_link = "/graphic_animation/startButton.png";
	Button button;
	
	/**
	 * Construct an instance of Enter_game_butt
	 * @param primaryStage is a type of stage is where all the visual parts of the JavaFX application are displayed
	 * @param scene to be set when button is pressed
	 */
	public Enter_game_butt(Stage primaryStage, Scene scene) {
		 button = new Button();
		 design_button();
		 
		 button.setOnAction(e -> primaryStage.setScene(scene)); 
		 //System.out.println("Start Button Activated");
	}
	
	/**
	 * Design and settings of button
	 */
	public void design_button() {
		Image image = new Image(image_link, 130, 130, true, true);
		ImageView start_image = new ImageView(image);
		button.setStyle("-fx-background-color: transparent;");
		button.setGraphic(start_image);
		button.setTranslateY(150);
	}
	
	/**
	 * Method to get Button
	 * @return button (Menu Page -> game Page) 
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