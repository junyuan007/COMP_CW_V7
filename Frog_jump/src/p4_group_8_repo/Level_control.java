package p4_group_8_repo;

import game_levels.Level_2;
import game_levels.Level_3;
import game_levels.Level_4;
import game_levels.Level_5;
import game_levels.Level_6;

public class Level_control {
	
	int level;
	MyStage background;
	
	public Level_control(MyStage background) {
		this.background = background;
	}
	
	public void set_level(int level) {
		this.level = level;
		System.out.println("Now is level: "+ level);
		change_level();
	}
	
	public void change_level() {
		/*if(level == 2) {
			Level_2 level_2 = new Level_2(background);
		}
		if(level == 3) {
			Level_3 level_3 = new Level_3(background);
		}
		if(level == 4) {
			Level_4 level_4 = new Level_4(background);
		}
		if(level == 5) {
			Level_5 level_5 = new Level_5(background);
		}
		if(level == 6) {
			Level_6 level_6 = new Level_6(background);
		}*/
		if(level == 2) {
			Level_7 level_7 = new Level_7(background);
		}			// snake logic work 
		
	}

}
