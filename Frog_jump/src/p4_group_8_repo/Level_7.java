package p4_group_8_repo;

import game_animation.End;
import game_animation.Vehicle;
import javafx.collections.ObservableList;

public class Level_7 {
	
	public Level_7(MyStage background) {
		
		ObservableList animation_list = background.getChildren();
		/*
		animation_list.set(16, new End(11,95));
		animation_list.set(17, new End(139,95));
		animation_list.set(18, new End(267,95));
		animation_list.set(19, new End(394,95));
		animation_list.set(20, new End(523,95));
		System.out.println("End Goal is RESET");
		*/
		int snake_size = 150;
		animation_list.set(33, new Snake(20, 430, -6.6, snake_size, snake_size));
			
	}

}
