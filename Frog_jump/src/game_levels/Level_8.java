package game_levels;


import game_animation.Log;
import javafx.collections.ObservableList;
import p4_group_8_repo.Crocodile;
import p4_group_8_repo.MyStage;


public class Level_8 {
	
	public Level_8(MyStage background) {
		
		ObservableList animation_list = background.getChildren();
		String short_log = "/graphic_animation/log3.png";
		int croc_height = 135;
		int croc_width = 155;

		animation_list.set(2, new Log(short_log, 150, 220, 166, 0.75));
		animation_list.set(3, new Crocodile(0, 166, 0.75, croc_width, croc_height));
		animation_list.set(4, new Log(short_log, 150, 440, 166, 0.75));
	}

}
