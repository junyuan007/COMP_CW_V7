package game_animation;

import javafx.scene.image.Image;
import p4_group_8_repo.Actor;

/**
 * Class of End (animation)
 * @author Jun Yuan
 *
 */
public class End extends Actor{
	boolean activated;
	
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
	 */
	public End(int x_position, int y_position) {
		setX(x_position);
		setY(y_position);
		setImage(new Image("/graphic_animation/End.png", 60, 60, true, true));
		this.activated = false;
	}
	
	/**
	 * Method where main_frog reach END goal
	 */
	public void setEnd() {
		setImage(new Image("/graphic_animation/FrogEnd.png", 68, 63, true, true));
		activated = true;
		System.out.println("Here");
	}
	
	
	/**
	 * Method to activate
	 * @return activated as in true
	 */
	public boolean isActivated() {
		return activated;
	}
	

}
