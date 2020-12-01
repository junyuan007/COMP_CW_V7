package info_page;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


/**
 * Class of Button (Info Page to Menu Page)
 * @author Jun Yuan
 *
 */
public class Back_menu_butt{
	
	private String image_link = "/graphic_animation/back_button.png";
	private Button button;
	
	/**
	 * Construct an instance of Back_menu_butt
	 * @param primaryStage is a type of stage is where all the visual parts of the JavaFX application are displayed
	 * @param scene to be set when button is pressed
	 */
	public Back_menu_butt(Stage primaryStage, Scene scene) {
		 button = new Button();
		 design_button();
		 EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
				@Override
				public void handle(ActionEvent e) {
					System.out.println("\nBack Menu Page button is pressed\n");
					primaryStage.setScene(scene);
				}
				};
		 button.setOnAction(event); 

	}
	
	/**
	 * Design and settings of button
	 */
	public void design_button() {
		Image image = new Image(image_link, 50, 50, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		button.setStyle("-fx-background-color: transparent;");
		button.setTranslateY(-360);
		button.setTranslateX(-260);
		
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
	 * @return button (Info Page to Menu Page) 
	 */
	public Button getButton() {
		return button;
	}

}
