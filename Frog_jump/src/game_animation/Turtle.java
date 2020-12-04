package game_animation;

import game_scene.Actor;
import javafx.scene.image.Image;

/**
 * Class of Turtle (animation)
 * @author Jun Yuan 
 *
 */
public class Turtle extends Actor{
	
	private Image turtle_1;
	private Image turtle_2;
	private Image turtle_3;
	private double speed;
	
	/**
	 * Method act to make Turtle animation move
	 * @param now is the current run time
	 */
	@Override
	public void act(long now) {

		int divide = 999999999;
				if (now / divide % 3 == 0) {
					setImage(turtle_2);
					
				}
				else if (now / divide % 3 == 1) {
					setImage(turtle_1);
					
				}
				else if (now / divide % 3 == 2) {
					setImage(turtle_3);
					
				}
			
		move(speed , 0);
		if (getX() > 600 && speed > 0)
			setX(-200);					//if reach end of screen then reset to other side
		if (getX() < -75 && speed < 0)
			setX(600);
	}
	
	/**
	 * Construct an instance of Turtle
	 * @param x_position is the X-coordinate of turtle
	 * @param y_position is the Y-coordinate of turtle
	 * @param speed_movement is the speed of turtle
	 * @param width of image
	 * @param height of image
	 * 
	 */
	public Turtle(int x_position, int y_position, double speed_movement, int width, int height) {
		turtle_1 = new Image("/graphic_animation/TurtleAnimation1.png", width, height, true, true);
		turtle_2 = new Image("/graphic_animation/TurtleAnimation2.png", width, height, true, true);
		turtle_3 = new Image("/graphic_animation/TurtleAnimation3.png", width, height, true, true);
		setX(x_position);
		setY(y_position);
		speed = speed_movement;
		setImage(turtle_2);
	}
}



