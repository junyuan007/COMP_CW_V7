package game_highscore;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import p4_group_8_repo.Actor;
import p4_group_8_repo.MyStage;

/**
 * Class of Button (START animation timer)
 * @author Jun Yuan
 *
 */
public class HighScore_list_butt extends Actor{

	String image_link = "/graphic_animation/high_score.png";
	Button button;
	Alert alert = new Alert(AlertType.INFORMATION);
	HighScore_list top = new HighScore_list();

	
	/**
	 * Construct an instance of Resume_butt
	 * @param background is the container for the scene
	 */
	public HighScore_list_butt(MyStage background) {
		 button = new Button();
		 //design_button();
		 alert_design();
		 button.setStyle("-fx-background-color: transparent;");
		 button.setOnAction(e -> alert.show()); 
		 design_button();

	}
	
	public void alert_design() {
		alert.setTitle("Previous High Score List");
		alert.setHeaderText("\n1st   --- " +top.getScore(1)+ 
							"\n2nd --- " +top.getScore(2)+ 
							"\n3rd --- " +top.getScore(3));
		//alert.setContentText("Select okay or cancel \n this alert.");

	}
	
	/**
	 * Design and settings of button
	 */
	public void design_button() {
		
		Image image = new Image(image_link, 65, 65, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		button.setTranslateY(8);
		button.setTranslateX(395);
		
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
	
	/**
	 * Empty body
	 */
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		System.out.println("Hiii there");
	}
	
	

}
