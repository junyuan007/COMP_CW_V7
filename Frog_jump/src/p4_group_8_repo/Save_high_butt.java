package p4_group_8_repo;

import game_highscore.HighScore_list;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import p4_group_8_repo.Actor;
import p4_group_8_repo.MyStage;

/**
 * Class of Button (START animation timer)
 * @author Jun Yuan
 *
 */
public class Save_high_butt extends Actor{

	//String image_link = "/graphic_animation/save_butt.png";
	String image_link = "/graphic_animation/save_me.png";
	Button button;
	Alert alert = new Alert(AlertType.INFORMATION);
	
	int current_high = 888;
	HighScore_list bobo = new HighScore_list();
	
	/**
	 * Construct an instance of Resume_butt
	 * @param background is the container for the scene
	 */
	public Save_high_butt(MyStage background) {
		 button = new Button();
		 design_button();
		 button.setStyle("-fx-background-color: transparent;");
		 button.setOnAction(event); 
		 design_button();

	}
	
	public void setScore (int num) {
		this.current_high = num;
	}
	

		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
		@Override
		public void handle(ActionEvent e) {
		alert.setTitle("Save High Score");
		
		if(current_high > bobo.getScore(1)) {
			bobo.setScore(3, bobo.getScore(2));			// 2 -> 3
			bobo.setScore(2, bobo.getScore(1));			// 1 -> 2
			bobo.setScore(1, current_high);				// current score -> 1
			alert.setHeaderText("Your current rank is 1st");
		}
		else if (current_high > bobo.getScore(2)) {
			bobo.setScore(3, bobo.getScore(2));
			bobo.setScore(2, current_high);	
			alert.setHeaderText("Your current rank is 2nd");
		}
		else if (current_high > bobo.getScore(3)) {
			bobo.setScore(3, current_high);	
			alert.setHeaderText("Your current rank is 3rd");
		}
		else {
			alert.setHeaderText("You are currently out of rank :( TRY HARDER !!!");
		}
		
		alert.setContentText("Your current high score is " + current_high + "\n"
							+"Press the high score button to see the updated rankings");
		alert.show();
		}
		};

	/**
	 * Design and settings of button
	 */
	public void design_button() {
		
		int image_size = 25;
		Image image = new Image(image_link, image_size, image_size, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		button.setTranslateY(8);
		button.setTranslateX(468);
		
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
	 * @return button to save high score in highscore list
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
