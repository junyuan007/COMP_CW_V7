package p4_group_8_repo;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Pause_button extends Actor{

	String image_link = "/graphic_animation/pause.png";
	Button button;
	
	public Pause_button(MyStage background) {
		
		 button = new Button();
		 design_button();
		 button.setStyle("-fx-background-color: transparent;");
		 button.setOnAction(e -> background.stop()); 
		 //button.setOnAction(e -> System.out.println("Game Pause")); 

	}
	
	public void design_button() {
		
		Image image = new Image(image_link, 60, 60, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		button.setTranslateY(18);

	}
	
	public Button getButton() {
		return button;
	}
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
	
	

}
