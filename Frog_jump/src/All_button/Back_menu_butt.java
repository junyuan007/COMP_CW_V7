package All_button;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import p4_group_8_repo.Actor;

public class Back_menu_butt extends Actor{
	String image_link = "/graphic_animation/backButton.png";
	Button button;
	
	public Back_menu_butt(Stage primaryStage, Scene scene) {
		 button = new Button();
		 design_button();
		 
		 button.setOnAction(e -> primaryStage.setScene(scene)); 
		 //System.out.println("Back Start Button Activated");
	}
	
	public void design_button() {
		Image image = new Image(image_link, 50, 50, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		button.setTranslateY(-360);
		button.setTranslateX(-260);
	}
	
	public Button getButton() {
		return button;
	}

	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
}
