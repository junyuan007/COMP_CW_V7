package game_levels;


import game_animation.Log;
import javafx.collections.ObservableList;
import p4_group_8_repo.Crocodile;
import p4_group_8_repo.MyStage;


public class Level_9 {
	
	public Level_9(MyStage background) {
		
		ObservableList animation_list = background.getChildren();
		String short_log = "/graphic_animation/log3.png";
		//int croc_height = 135;
		//int croc_width = 155;
		int croc_height = 150;
		int croc_width = 150;
		double speed = 0.9;

		//animation_list.set(2, new Log(short_log, 150, 220, 166, 0.75));
		//animation_list.set(4, new Log(short_log, 150, 440, 166, 0.75));
		animation_list.set(7, new Crocodile(50, 329, speed, croc_width, croc_height));
		animation_list.set(8, new Log(short_log, 150, 270, 329, speed));
		animation_list.set(9, new Crocodile(490, 329, speed, croc_width, croc_height));
		
	}

}
