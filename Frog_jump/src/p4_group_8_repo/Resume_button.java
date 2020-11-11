package p4_group_8_repo;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Resume_button extends Actor{

	String image_link = "/graphic_animation/play.png";
	Button button;
	
	public Resume_button(MyStage background) {
		
		 button = new Button();
		 design_button();
		 button.setStyle("-fx-background-color: transparent;");
		 button.setOnAction(e -> background.start()); 
		 //button.setOnAction(e -> System.out.println("Game Resume")); 

	}
	
	public void design_button() {
		
		Image image = new Image(image_link, 50, 50, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		button.setTranslateY(43);

	}
	
	public Button getButton() {
		return button;
	}
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
	
	

}
