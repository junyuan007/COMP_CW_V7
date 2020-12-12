package p4_group_8_repo.Game_levels;


import javafx.collections.ObservableList;
import p4_group_8_repo.Game_actor.Vehicle;
import p4_group_8_repo.Game_scene.MyStage;

/**
 * Class of Level 10
 * @author Jun Yuan
 *
 */
public class Level_10 {
	
	/**
	 * Make all vehicle move in opposite direction 
	 * @param background is the container for the scene
	 */
	public Level_10(MyStage background) {
		// Truck
		String truck_short_right= "/graphic_animation/truck1"+"Right.png";
		String truck_long_right = "/graphic_animation/truck2"+"Right.png";
		int short_truck_size = 120;
		int long_truck_size = 200;
		//double truck_speed = 1.1;
		double truck_speed = 2.2;
		// Car
		//String car_right = "/graphic_animation/car1"+"Right.png";
		String car_left = "/graphic_animation/car1"+"Left.png";
		int car_size = 50;
		double top_car_speed = -8.0;
		double mid_car_speed = -4.8;
		double bot_car_speed = -5.5;
		ObservableList animation_list = background.getChildren();
		
		// Long Truck
		animation_list.set(20, new Vehicle(truck_long_right, 0, 540, truck_speed, long_truck_size, long_truck_size));
		animation_list.set(21, new Vehicle(truck_long_right, 300, 540, truck_speed, long_truck_size, long_truck_size));
		// Short Truck
		animation_list.set(22, new Vehicle(truck_short_right, 0, 649, truck_speed, short_truck_size, short_truck_size));
		animation_list.set(23, new Vehicle(truck_short_right, 260, 649, truck_speed, short_truck_size, short_truck_size));
		animation_list.set(24, new Vehicle(truck_short_right, 460, 649, truck_speed, short_truck_size, short_truck_size));
		// Top car
		animation_list.set(25, new Vehicle(car_left, 500, 490, top_car_speed, car_size, car_size));
		// Mid car
		animation_list.set(26, new Vehicle(car_left, 100, 597, mid_car_speed, car_size, car_size));
		animation_list.set(27, new Vehicle(car_left, 250, 597, mid_car_speed, car_size, car_size));
		animation_list.set(28, new Vehicle(car_left, 400, 597, mid_car_speed, car_size, car_size));
		animation_list.set(29, new Vehicle(car_left, 550, 597, mid_car_speed, car_size, car_size));
		// Bottom car
		animation_list.set(30, new Vehicle(car_left, 175, 700, bot_car_speed, car_size, car_size));
		animation_list.set(31, new Vehicle(car_left, 475, 700, bot_car_speed, car_size, car_size));
		
		System.out.println("Final Level\n");
	}

}
