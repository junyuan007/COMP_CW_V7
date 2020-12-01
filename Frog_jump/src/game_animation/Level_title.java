package game_animation;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * Class of Level Title (animation)
 * @author Jun Yuan
 *
 */
public class Level_title{
	
	private String image_link = "/graphic_animation/level_button.png";
	private Button button;
	private int x_coordinate;
	private int y_coordinate;
	private int button_size;
	
	/**
	 * Construct an instance of level title
	 * @param x_coordinate is the X-coordinate of the score board
	 * @param y_coordinate is the Y-coordinate of the score board
	 * @param button_size of the level title
	 */
	public Level_title(int x_coordinate, int y_coordinate, int button_size) {
		this.button_size = button_size;
		this.x_coordinate = x_coordinate;
		this.y_coordinate = y_coordinate;
		button = new Button();
		design_button();
	}
	
	/**
	 * Design and settings of button
	 */
	public void design_button() {
		
		Image image = new Image(image_link, button_size, button_size, true, true);
		ImageView start_image = new ImageView(image);
		button.setGraphic(start_image);
		button.setStyle("-fx-background-color: transparent;");
		button.setTranslateY(y_coordinate);
		button.setTranslateX(x_coordinate);
		
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


}
