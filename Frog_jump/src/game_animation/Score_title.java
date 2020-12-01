package game_animation;


import javafx.scene.image.Image;
import p4_group_8_repo.Actor;

/**
 * Class of Score Title in game screen (animation)
 * @author Jun Yuan
 *
 */
public class Score_title extends Actor{

	private Image image_1;
	private String image_link = "/graphic_animation/score_button.png";

	/**
	 * Empty Class
	 */
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Construct an instance of score title
	 * @param x_position is the X-coordinate of the score board
	 * @param y_position is the Y-coordinate of the score board
	 * @param score_size of the score title displayed
	 */
	public Score_title(int x_position, int y_position, int score_size) {
		image_1 = new Image(image_link, score_size, score_size, true, true);
		setImage(image_1);
		setX(x_position);
		setY(y_position);
		
	}


	
}
