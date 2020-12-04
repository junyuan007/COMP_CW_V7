package game_animation;

import game_scene.Actor;
import javafx.scene.image.Image;

/**
 * Class of End (animation)
 * @author Jun Yuan
 *
 */
public class End extends Actor{
	
	private boolean activated = false;
	
	/**
	 * Empty body
	 */
	@Override
	public void act(long now) {
		// TODO Auto-generated method st
	}
	
	/**
	 * Construct an instance of End goal
	 * @param x_position is the X-coordinate of END goal
	 * @param y_position is the Y-coordinate of END goal
	 * @param size of the END goal
	 */
	public End(int x_position, int y_position, int size) {
		setX(x_position);
		setY(y_position);
		setImage(new Image("/graphic_animation/End.png", size, size, true, true));
		//this.activated = false;
	}
	
	/**
	 * Method where main_frog reach END goal
	 */
	public void setEnd() {
		setImage(new Image("/graphic_animation/FrogEnd.png", 68, 63, true, true));
		activated = true;
	}
	
	
	/**
	 * Method if the End is occupied
	 * @return activated if occupied
	 */
	public boolean isActivated() {
		return activated;
	}
	

}
