package start_page;

import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * Class of Instruction Button
 * @author Jun Yuan
 *
 */
public class WASD_butt{

	String image_link = "/graphic_animation/WASD.png";
	Button button;
	Alert alert = new Alert(AlertType.INFORMATION);

	
	/**
	 * Construct an instance of instruction button
	 */
	public WASD_butt() {
		 button = new Button();
		 alert_design();
		 button.setStyle("-fx-background-color: transparent;");
		 button.setOnAction(e -> alert.show()); 
		 design_button();
		 System.out.println("Here");

	}
	
	/**
	 * Design for alert message
	 */
	public void alert_design() {
		alert.setTitle("Instructions");
		alert.setHeaderText("WASD keys to control Frogger character");
		alert.setContentText("W - to move up\n"
							+"S - to move down\n"
							+"A - to move left\n"
							+"D - to move down");

	}
	
	/**
	 * Design and settings of button
	 */
	public void design_button() {
		
		Image image = new Image(image_link, 155, 155, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		//button.setTranslateY(-80);
		//button.setTranslateX(-162);
		button.setTranslateY(266);
		button.setTranslateX(45);
		
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
	 * @return button (Display instruction button)
	 */
	public Button getButton() {
		return button;
	}	

}
