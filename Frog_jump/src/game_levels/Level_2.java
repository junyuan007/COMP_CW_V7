package game_levels;

import game_animation.Vehicle;
import javafx.collections.ObservableList;
import p4_group_8_repo.MyStage;

public class Level_2 {
	
	String car_left = "/graphic_animation/car1"+"Left.png";
	int car_size = 50;
	
	public Level_2(MyStage background) {
		//bottom (new)
		//background.add(new Vehicle(car_left, 175, 694, -0.60, car_size, car_size));
		//background.add(new Vehicle(car_left, 475, 694, -0.60, car_size, car_size));
		
		ObservableList animation_list = background.getChildren();
		animation_list.set(31, new Vehicle(car_left, 175, 694, -0.60, car_size, car_size));
		animation_list.set(32, new Vehicle(car_left, 475, 694, -0.60, car_size, car_size));
		System.out.println("New rows of cars added");
	}

}
