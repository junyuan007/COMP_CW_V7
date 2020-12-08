package game_levels;

import game_animation.Vehicle;
import game_scene.MyStage;
import javafx.collections.ObservableList;

/**
 * Class of Level 2
 * @author Jun Yuan
 *
 */
public class Level_2 {
	
	/**
	 * Add new rows of car 
	 * @param background is the container for the scene
	 */
	public Level_2(MyStage background) {
		
		String car_left = "/graphic_animation/car1"+"Left.png";
		int car_size = 50;
		
		ObservableList animation_list = background.getChildren();
		
		animation_list.set(30, new Vehicle(car_left, 175, 700, -0.60, car_size, car_size));
		animation_list.set(31, new Vehicle(car_left, 475, 700, -0.60, car_size, car_size));
		
		System.out.println("2 cars added\n");
	}

}
