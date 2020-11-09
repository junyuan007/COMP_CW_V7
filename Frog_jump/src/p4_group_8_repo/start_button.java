package p4_group_8_repo;


import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class start_button extends Actor{
	
	String image_link = "/graphic_animation/startButton.png";
	Button button;
	
	public start_button() {
		 button = new Button();
		 design_button();
	}
	
	public void design_button() {
		Image image = new Image(image_link, 130, 130, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		button.setTranslateY(150);
	}
	
	public Button getButton() {
		return button;
	}

	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}

}
