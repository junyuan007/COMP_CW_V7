package p4_group_8_repo.Info_page;


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
public class Back_butt{
	
	private String image_link = "/graphic_animation/back_butt.png";
	private Button button;
	private int button_size;
	private int x_position;
	private int y_position;
	
	/**
	 * Construct an instance of Back_menu_butt
	 * @param primaryStage is a type of stage is where all the visual parts of the JavaFX application are displayed
	 * @param scene to be set when button is pressed
	 * @param button_size of the back button
	 * @param x_position of the back button
	 * @param y_position of the back button
	 */
	public Back_butt(Stage primaryStage, Scene scene, int button_size, int x_position, int y_position) {
		 button = new Button();
		 this.button_size = button_size;
		 this.x_position = x_position;
		 this.y_position = y_position;
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
		Image image = new Image(image_link, button_size, button_size, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		button.setStyle("-fx-background-color: transparent;");
		button.setTranslateY(y_position);
		button.setTranslateX(x_position);
		
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
