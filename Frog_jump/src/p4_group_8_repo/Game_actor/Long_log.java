package p4_group_8_repo.Game_actor;

import javafx.scene.image.Image;

/**
 * Class of Long_log (animation)
 * @author Jun Yuan
 *
 */
public class Long_log extends Actor {
	
	private double speed;
	private String image_link = "/graphic_animation/long_log.png";
	
	/**
	 * Method act to make Log animation move
	 * @param now is the current run time
	 */
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX() > 600 && speed > 0)
			setX(-180);
		if (getX() < -300 && speed < 0)
			setX(700);
	}
	
	/**
	 * Construct an instance of Long Log
	 * @param size is the size of image
	 * @param x_position is the X-coordinate of log
	 * @param y_position is the Y-coordinate of log
	 * @param speed_movement is the speed of log 
	 * 
	 */
	public Long_log(int x_position, int y_position, double speed_movement, int size) {
		setImage(new Image(image_link, size, size, true, true));
		setX(x_position);
		setY(y_position);
		speed = speed_movement;
		
	}
	
	/**
	 * Method to check if animation moving direction of left
	 * @return if speed smaller than zero
	 */
	public boolean getLeft() {
		return speed < 0;
	}
}
