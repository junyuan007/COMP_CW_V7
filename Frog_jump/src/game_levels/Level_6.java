package game_levels;

import java.util.concurrent.TimeUnit;
import game_animation.End;
import game_animation.Vehicle;
import javafx.collections.ObservableList;
import p4_group_8_repo.MyStage;

/**
 * Class of Level 6
 * @author Jun Yuan
 * 
 */
public class Level_6 {
	
	
	
	/**
	 * Set cars faster
	 * @param background is the container for the scene
	 */
	public Level_6(MyStage background) {
		
		String car_left = "/graphic_animation/car1"+"Left.png";
		int car_size = 50;
		ObservableList animation_list = background.getChildren();
		
		// TOP car
		animation_list.set(26, new Vehicle(car_left, 500, 490, -5.0, car_size, car_size));
		
		
		// Bottom car
		animation_list.set(31, new Vehicle(car_left, 175, 700, -3.5, car_size, car_size));
		animation_list.set(32, new Vehicle(car_left, 475, 700, -3.5, car_size, car_size));
		System.out.println("Top & Bottom cars are Faster");
		
		try {
		TimeUnit.SECONDS.sleep(2);					//Timer is STOP for 2 seconds 
		animation_list.set(16, new End(11, 95, 60));
		animation_list.set(17, new End(139, 95, 60));
		animation_list.set(18, new End(267,95, 60));
		animation_list.set(19, new End(394,95, 60));
		animation_list.set(20, new End(523,95, 60));
		System.out.println("End Goal is RESET\n");
		
		}
		catch(InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }

	}

}
