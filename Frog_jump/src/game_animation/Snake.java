package game_animation;

import game_scene.Actor;
import javafx.scene.image.Image;

/**
 * Class of Snake (animation)
 * @author Jun Yuan
 *
 */
public class Snake extends Actor{
	
	private double speed;
	private Image snake1;
	private Image snake2;
	private Image snake3;

	/**
	 * Method act to make Snake animation move
	 * @param now is the current run time
	 */
	@Override
	public void act(long now) {
		
		int divide = 999999999;
		if (now / divide % 3 == 0) {
			setImage(snake1);
		}
		else if (now / divide % 3 == 1) {
			setImage(snake2);
		}
		else if (now / divide % 3 == 2) {
			setImage(snake3);
		} 
		move(speed , 0);
		if (getX() > 600 && speed > 0)
			setX(-200);
		if (getX() < -50 && speed < 0)
			setX(600);
	}
	
	/**
	 * Construct an instance of Snake with coordinates
	 * @param x_position is the X-coordinate of Snake
	 * @param y_position is the Y-coordinate of Snake
	 * @param size of the snake
	 * @param speed_movement of the snake
	 */
	public Snake(int x_position, int y_position, int size, double speed_movement) {

		snake1 = new Image("/graphic_animation/snake_1.png", size, size, true, true);
		snake2 = new Image("/graphic_animation/snake_2.png", size, size, true, true);
		snake3 = new Image("/graphic_animation/snake_3.png", size, size, true, true);
		setX(x_position);
		setY(y_position);
		setImage(snake1);
		speed = speed_movement;
		System.out.println("Snake created");
	}
	
	/**
	 * Construct an instance of empty Snake
	 */
	public Snake() {
		
	}


}
