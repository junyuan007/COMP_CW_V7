package start_page;

import javafx.scene.image.Image;
import p4_group_8_repo.Actor;

/**
 * Class of Frog Left to Right (animation)
 * @author Jun Yuan
 *
 */
public class LR_frog extends Actor{
	
	String image_link = "/graphic_animation/frog1.png";
	Image frog1;
	Image frog2;
	Image frog3;
	Image frog4;
	private double speed;
	
	
	/**
	 * Construct instance of Left to Right Frog
	 * @param size of the Frog
	 * @param x_position is the X-coordinate of frog
	 * @param y_position is the Y-coordinate of frog
	 * @param speed_movement of the Frog
	 */
	public LR_frog(int size, int x_position, int y_position, double speed_movement) {
		
		frog1 = new Image("/graphic_animation/frog8.png", size,size, true, true);
		frog2 = new Image("/graphic_animation/frog7.png", size,size, true, true);
		frog3 = new Image("/graphic_animation/frog6.png", size,size, true, true);
		frog4 = new Image("/graphic_animation/frog5.png", size,size, true, true);
		setX(x_position);
		setY(y_position);
		speed = speed_movement;
		setImage(frog4);
		
	}

	/**
	 * Method act to make Frog animation move
	 * @param now is the current run time
	 */
	@Override
	public void act(long now) {
		
		int divide = 222222222;
		int transition = 6;
		if (now / divide % transition == 0) {
			setImage(frog4);

		}
		else if (now / divide % transition == 1) {
			setImage(frog3);

		}
		else if (now / divide % transition == 2) {
			setImage(frog2);

		} 
		else if (now / divide % transition == 3) {
			setImage(frog1);

		}
		else if (now / divide % transition == 4) {
			setImage(frog2);

		}
		else if (now / divide % transition == 5) {
			setImage(frog3);

		} 
		move(speed , 0);
		if (getX() > 600 && speed > 0)
			setX(-200);
		if (getX() < -50 && speed < 0)
			setX(600);
		
	}

}
