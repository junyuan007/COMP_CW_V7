package game_animation;

import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import p4_group_8_repo.Actor;

/**
 * Class of Score Title in game screen (animation)
 * @author Jun Yuan
 *
 */
public class Score_title extends Actor{

	Image image_1;
	String image_link = "/graphic_animation/score.png";
	int x_position = 520;
	int y_position = 12;

	/**
	 * Empty Class
	 */
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Construct an instance of score title
	 * @param size of the score title displayed
	 * @param x_position is the X-coordinate of the score board
	 * @param y_position is the Y-coordinate of the score board
	 */
	public Score_title(int score_size) {
		image_1 = new Image(image_link, score_size, score_size, true, true);
		setImage(image_1);
		setX(x_position);
		setY(y_position);
		
	}


	
}
