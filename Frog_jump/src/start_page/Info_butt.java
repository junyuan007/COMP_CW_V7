package start_page;


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
 * Class of Button (Menu Page -> Info Page)
 * @author Jun Yuan
 *
 */
public class Info_butt{
	
	private String image_link = "/graphic_animation/info_pixel.png";
	private Button button;
	
	/**
	 * Construct an instance of Info_butt
	 * @param primaryStage is a type of stage is where all the visual parts of the JavaFX application are displayed
	 * @param scene to be set when button is pressed
	 */
	public Info_butt(Stage primaryStage, Scene scene) {
		 button = new Button();
		 design_button();
		 
		 EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
				@Override
				public void handle(ActionEvent e) {
					System.out.println("\nInfo button is pressed\n");
					primaryStage.setScene(scene);
				}
				};
		button.setOnAction(event); 
	}
	
	/**
	 * Design and settings of button
	 */
	public void design_button() {
		Image image = new Image(image_link, 80, 80, true, true);
		ImageView start_image = new ImageView(image);
		button.setStyle("-fx-background-color: transparent;");
		button.setGraphic(start_image);
		//button.setTranslateY(150);
		//button.setTranslateX(105);
		button.setTranslateY(-5);
		button.setTranslateX(520);
		
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
	 * @return button (Menu Page -> Info Page) 
	 */
	public Button getButton() {
		return button;
	}

}
