package All_animation;

import javafx.scene.image.Image;
import p4_group_8_repo.Actor;

/**
 * Class of Vehicle (animation)
 * @author tigus
 *
 */
public class Vehicle extends Actor {
	private double speed;
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX() > 600 && speed > 0)
			setX(-200);
		if (getX() < -50 && speed < 0)
			setX(600);
	}
	
	
	/**
	 * Construct an instance of vehicle
	 * @param imageLink is the source path of image
	 * @param x_position is the X-coordinate of vehicle
	 * @param y_position is the Y-coordinate of vehicle
	 * @param speed_movement is the speed of vehicle
	 * @param width of vehicle
	 * @param height of vehicle
	 */
	public Vehicle(String imageLink, int x_position, int y_position, double speed_movement, int width, int height) {
		setImage(new Image(imageLink, width, height, true, true));
		setX(x_position);
		setY(y_position);
		speed = speed_movement;
	}

}
