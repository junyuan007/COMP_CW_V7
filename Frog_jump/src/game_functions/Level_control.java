package game_functions;

import game_levels.Level_10;
import game_levels.Level_2;
import game_levels.Level_3;
import game_levels.Level_4;
import game_levels.Level_5;
import game_levels.Level_6;
import game_levels.Level_7;
import game_levels.Level_8;
import game_levels.Level_9;
import javafx.stage.Stage;
import p4_group_8_repo.MyStage;

public class Level_control {
	
	private int level;
	MyStage background;
	Stage primaryStage;
	
	public Level_control(MyStage background) {
		this.background = background;
	}
	
	public void set_level(int level) {
		this.level = level;
		System.out.println("Now is level: "+ level);
		change_level();
	}
	
	public void change_level() {
		/*
		if(level == 2) {
			Level_2 level_2 = new Level_2(background);
		}
		else if(level == 3) {
			Level_3 level_3 = new Level_3(background);
		}
		else if(level == 4) {
			Level_4 level_4 = new Level_4(background);
		}
		else if(level == 5) {
			Level_5 level_5 = new Level_5(background);
		}
		else if(level == 6) {
			Level_6 level_6 = new Level_6(background);
		}
		else if(level == 7) {
			Level_7 level_7 = new Level_7(background);
		}
		else if(level == 8) {
			Level_8 level_8 = new Level_8(background);
		}
		else if(level == 9) {
			Level_9 level_9 = new Level_9(background);
		}
		else if(level == 10) {
			Level_10 level_10 = new Level_10(background);
		}*/
		
		
		if(level == 2) {
			Level_2 level_2 = new Level_2(background);
		}
		if(level == 2) {
			Level_3 level_3 = new Level_3(background);
		}
		if(level == 2) {
			Level_4 level_4 = new Level_4(background);
		}
		if(level == 2) {
			Level_5 level_5 = new Level_5(background);
		}
		if(level == 6) {
			Level_6 level_6 = new Level_6(background);
		}
		if(level == 2) {
			Level_7 level_7 = new Level_7(background);
		}
		if(level == 2) {
			Level_8 level_8 = new Level_8(background);
		}
		if(level == 2) {
			Level_9 level_9 = new Level_9(background);
		}
		if(level == 2) {
			Level_10 level_10 = new Level_10(background);
		}
		
		
	}
	
	/**
	 * Method to get the current level
	 * @return the value of level
	 */
	public int getLevel() {
		return level;
	}

}
