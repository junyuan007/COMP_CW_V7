package game_animation;

import javafx.scene.image.Image;
import p4_group_8_repo.Actor;

/**
 * Class of WetTurtle (animation)
 * @author Jun Yuan
 *
 */
public class WetTurtle extends Actor{
	Image turtle_1;
	Image turtle_2;
	Image turtle_3;
	Image turtle_4;
	private int speed;
	boolean sunk = false;
	
	/**
	 * Method act to make WetTurtle animation move
	 * @param now is the current run time
	 */
	@Override
	public void act(long now) {
		
		int divide = 999999999;
				if (now / divide % 4 == 0) {
					setImage(turtle_1);
					sunk = false;
				}
				else if (now / divide % 4 == 1) {
					setImage(turtle_2);
					sunk = false;
				}
				else if (now / divide % 4 == 2) {
					setImage(turtle_3);
					sunk = false;
				} else if (now / divide % 4 == 3) {
					setImage(turtle_4);
					sunk = true;			//main_frogger die
				}
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}		//END act method
	
	/**
	 * Construct an instance of WetTurtle
	 * @param x_position is the X-coordinate of WetTurtle
	 * @param y_position is the Y-coordinate of WetTurtle
	 * @param speed_movement is the speed of WetTurtle
	 * @param width of WetTurtle
	 * @param height of WetTurtle
	 */
	public WetTurtle(int x_position, int y_position, int speed_movement, int width, int height) {
		//turtle_1 = new Image("file:src/p4_group_8_repo/TurtleAnimation1.png", width, height, true, true);
		//turtle_2 = new Image("file:src/p4_group_8_repo/TurtleAnimation2Wet.png", width, height, true, true);
		//turtle_3 = new Image("file:src/p4_group_8_repo/TurtleAnimation3Wet.png", width, height, true, true);
		//turtle_4 = new Image("file:src/p4_group_8_repo/TurtleAnimation4Wet.png", width, height, true, true);
		turtle_1 = new Image("/graphic_animation/TurtleAnimation1.png", width, height, true, true);
		turtle_2 = new Image("/graphic_animation/TurtleAnimation2Wet.png", width, height, true, true);
		turtle_3 = new Image("/graphic_animation/TurtleAnimation3Wet.png", width, height, true, true);
		turtle_4 = new Image("/graphic_animation/TurtleAnimation4Wet.png", width, height, true, true);
		setX(x_position);
		setY(y_position);
		speed = speed_movement;
		setImage(turtle_2);
	}
	
	public WetTurtle() {
		
	}
	
	/**
	 * Method to check if turtle is sunk
	 * @return if sunk
	 */
	public boolean isSunk() {
		return sunk;
	}
}
