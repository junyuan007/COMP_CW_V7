package game_levels;

import game_animation.End;
import game_animation.Vehicle;
import javafx.collections.ObservableList;
import p4_group_8_repo.MyStage;
import p4_group_8_repo.Snake;

public class Level_7 {
	
	public Level_7(MyStage background) {
		
		ObservableList animation_list = background.getChildren();
		
		int size = 80;
		
		animation_list.set(33, new Snake(20, 429));
		//animation_list.set(33, new Snake(20, 430, -5.5, size, size));
		//animation_list.set(33, new Crocodile(20, 425, 1, 135, 135));
	}

}
