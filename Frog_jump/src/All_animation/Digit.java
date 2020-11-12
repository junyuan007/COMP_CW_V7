package All_animation;

import javafx.scene.image.Image;
import p4_group_8_repo.Actor;

/**
 * Class of Digit (animation)
 * @author Jun Yuan
 *
 */
public class Digit extends Actor{

	Image image_1;
	
	/**
	 * Empty body
	 */
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
	}
	
	/**
	 * Constructor to create an instance of score board
	 * @param current_score is the score displayed
	 * @param size of the score board
	 * @param x_position is the X-coordinate of the score board
	 * @param y_position is the Y-coordinate of the score board
	 */
	public Digit(int current_score, int size, int x_position, int y_position) {
		image_1 = new Image("/graphic_animation/"+ current_score +".png", size, size, true, true);
		setImage(image_1);
		setX(x_position);
		setY(y_position);
	}
	
}
