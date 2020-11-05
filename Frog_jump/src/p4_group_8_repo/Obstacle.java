package p4_group_8_repo;

import javafx.scene.image.Image;

/**
 * Class of obstacle / vehicle (animation)
 * @author tigus
 *
 */
public class Obstacle extends Actor {
	private int speed;
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX() > 600 && speed > 0)
			setX(-200);
		if (getX() < -50 && speed < 0)
			setX(600);
	}
	
	
	/**
	 * Construct an instance of obstacle
	 * @param imageLink is the source path of image
	 * @param x_position is the X-coordinate of obstacle
	 * @param y_position is the Y-coordinate of obstacle
	 * @param speed_movement is the speed of obstacle
	 * @param width of obstacle
	 * @param height of obstacle
	 */
	public Obstacle(String imageLink, int x_position, int y_position, int speed_movement, int width, int height) {
		setImage(new Image(imageLink, width, height, true, true));
		setX(x_position);
		setY(y_position);
		speed = speed_movement;
	}

}
