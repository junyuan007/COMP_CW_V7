package game_levels;

import game_animation.Vehicle;
import game_scene.MyStage;
import javafx.collections.ObservableList;

/**
 * Class of Level 3
 * @author Jun Yuan
 *
 */
public class Level_3 {

	/**
	 * Add short and long trucks
	 * @param background is the container for the scene
	 */
	public Level_3(MyStage background) {
		
		String truck_short_right = "/graphic_animation/truck1"+"Right.png";
		String truck_long_right = "/graphic_animation/truck2"+"Right.png";
		int short_truck_size = 120;
		int long_truck_size = 200;
		
		ObservableList animation_list = background.getChildren();
		
		animation_list.set(20, new Vehicle(truck_long_right, 0, 540, 1, long_truck_size, long_truck_size));
		animation_list.set(21, new Vehicle(truck_long_right, 500, 540, 1, long_truck_size, long_truck_size));
		
		animation_list.set(22, new Vehicle(truck_short_right, 0, 649, 1, short_truck_size, short_truck_size));
		animation_list.set(23, new Vehicle(truck_short_right, 300, 649, 1, short_truck_size, short_truck_size));
		animation_list.set(24, new Vehicle(truck_short_right, 600, 649, 1, short_truck_size, short_truck_size));

		
		System.out.println("1 short 1 long trucks added\n");
	}
}
