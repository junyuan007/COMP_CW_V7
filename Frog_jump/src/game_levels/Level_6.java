package game_levels;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import game_animation.End;
import game_animation.Vehicle;
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
		
		try {
		TimeUnit.SECONDS.sleep(2);					//time delay of 2 seconds 
		animation_list.set(16, new End(11,95));
		animation_list.set(17, new End(139,95));
		animation_list.set(18, new End(267,95));
		animation_list.set(19, new End(394,95));
		animation_list.set(20, new End(523,95));
		System.out.println("End Goal is RESET");
		
		//maybe add alert to say proceed
		}
		catch(InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }

	}

}
