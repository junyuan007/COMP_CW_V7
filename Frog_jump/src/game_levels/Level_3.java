package game_levels;

import game_animation.Turtle;
import game_animation.Vehicle;
import javafx.collections.ObservableList;
import p4_group_8_repo.MyStage;

public class Level_3 {
	
	String truck_short_right = "/graphic_animation/truck1"+"Right.png";
	String truck_long_right = "/graphic_animation/truck2"+"Right.png";
	int short_truck_size = 120;
	int long_truck_size = 200;

	public Level_3(MyStage background) {
		
		ObservableList animation_list = background.getChildren();
		
		animation_list.set(21, new Vehicle(truck_long_right, 0, 540, 1, long_truck_size, long_truck_size));
		animation_list.set(22, new Vehicle(truck_long_right, 500, 540, 1, long_truck_size, long_truck_size));
		
		animation_list.set(23, new Vehicle(truck_short_right, 0, 649, 1, short_truck_size, short_truck_size));
		animation_list.set(24, new Vehicle(truck_short_right, 300, 649, 1, short_truck_size, short_truck_size));
		animation_list.set(25, new Vehicle(truck_short_right, 600, 649, 1, short_truck_size, short_truck_size));
		
		//background.add(new Vehicle(truck_short_right, 600, 649, 1, short_truck_size, short_truck_size));
		//animation_list.remove(34, 36);
		//animation_list.remove(35);
		
		System.out.println("New Trucks added");
	}
}