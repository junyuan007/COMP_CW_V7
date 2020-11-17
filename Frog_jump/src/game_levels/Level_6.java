package game_levels;

import game_animation.Vehicle;
import game_animation.WetTurtle;
import javafx.collections.ObservableList;
import p4_group_8_repo.MyStage;

public class Level_6 {
	
	String car_left = "/graphic_animation/car1"+"Left.png";
	int car_size = 50;
	
	public Level_6(MyStage background) {

		ObservableList animation_list = background.getChildren();
		
		// TOP car
		animation_list.set(26, new Vehicle(car_left, 500, 490, -5.0, car_size, car_size));
		
		
		// Bottom car
		animation_list.set(31, new Vehicle(car_left, 175, 694, -3.5, car_size, car_size));
		animation_list.set(32, new Vehicle(car_left, 475, 694, -3.5, car_size, car_size));

	}

}
