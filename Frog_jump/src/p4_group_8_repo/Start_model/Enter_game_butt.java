package p4_group_8_repo.Start_model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import p4_group_8_repo.Game_actor.Actor;

/**
 * Class of Button (Menu Page to Game Page)
 * @author Jun Yuan
 *
 */
public class Enter_game_butt{
	
	private String image_link = "/graphic_animation/start_button.png";
	private Button button;

	/**
	 * Construct an instance of Enter_game_butt
	 * @param primaryStage is a type of stage is where all the visual parts of the JavaFX application are displayed
	 * @param scene to be set when button is pressed
	 */
	public Enter_game_butt(Stage primaryStage, Scene scene) {
		button = new Button();
		design_button();
		 
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
			@Override
			public void handle(ActionEvent e) {
				System.out.println("\nEnter Game button is pressed\n");
				primaryStage.setScene(scene);
			}
			};
		button.setOnAction(event); 
	}
	
	/**
	 * Design and settings of button
	 */
	public void design_button() {
		Image image = new Image(image_link, 175, 175, true, true);
		ImageView start_image = new ImageView(image);
		button.setStyle("-fx-background-color: transparent;");
		button.setGraphic(start_image);
		//button.setTranslateY(150);
		button.setTranslateY(490);
		button.setTranslateX(215);
		
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
	 * @return button (Menu Page to game Page) 
	 */
	public Button getButton() {
		return button;
	}

}
