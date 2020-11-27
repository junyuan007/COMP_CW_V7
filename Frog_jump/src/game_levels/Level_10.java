package game_levels;


import game_animation.Vehicle;
import javafx.collections.ObservableList;
import p4_group_8_repo.MyStage;

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
		
		String truck_short_left= "/graphic_animation/truck1"+"Left.png";
		String truck_long_left = "/graphic_animation/truck2"+"Left.png";
		int short_truck_size = 120;
		int long_truck_size = 200;
		double truck_speed = -1.1;
		
		String car_right = "/graphic_animation/car1"+"Right.png";
		int car_size = 50;
		double top_car_speed = 5.0;
		double mid_car_speed = 1.1;
		double bot_car_speed = 3.5;
		ObservableList animation_list = background.getChildren();
		
		
		// NOT DONE 
		
		
		/*
		// Long Truck
		animation_list.set(21, new Vehicle(truck_long_left, 0, 540, truck_speed, long_truck_size, long_truck_size));
		animation_list.set(22, new Vehicle(truck_long_left, 300, 540, truck_speed, long_truck_size, long_truck_size));
		// Short Truck
		animation_list.set(23, new Vehicle(truck_short_left, 0, 649, truck_speed, short_truck_size, short_truck_size));
		animation_list.set(24, new Vehicle(truck_short_left, 260, 649, truck_speed, short_truck_size, short_truck_size));
		animation_list.set(25, new Vehicle(truck_short_left, 460, 649, truck_speed, short_truck_size, short_truck_size));
		// Top car
		animation_list.set(26, new Vehicle(car_right, 500, 490, top_car_speed, car_size, car_size));
		// Mid car
		animation_list.set(27, new Vehicle(car_right, 100, 597, mid_car_speed, car_size, car_size));
		animation_list.set(28, new Vehicle(car_right, 250, 597, mid_car_speed, car_size, car_size));
		animation_list.set(29, new Vehicle(car_right, 400, 597, mid_car_speed, car_size, car_size));
		animation_list.set(30, new Vehicle(car_right, 550, 597, mid_car_speed, car_size, car_size));
		// Bottom car
		animation_list.set(31, new Vehicle(car_right, 175, 700, bot_car_speed, car_size, car_size));
		animation_list.set(32, new Vehicle(car_right, 475, 700, bot_car_speed, car_size, car_size));
		*/
		
		
		System.out.println("Final Level\n");
	}

}
