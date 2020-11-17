package game_levels;

import game_animation.Turtle;
import game_animation.WetTurtle;
import game_functions.Create_animations;
import javafx.collections.ObservableList;
import p4_group_8_repo.MyStage;

public class Level_4 {

	public Level_4(MyStage background) {

		ObservableList animation_list = background.getChildren();
		
		animation_list.set(13, new Turtle(500, 376, -1, 130, 130));
		animation_list.set(14, new Turtle(300, 376, -1, 130, 130));
		animation_list.set(15, new WetTurtle(700, 376, -1, 130, 130));
		
		System.out.println("One Turtle changed to Wet Turtles");

	}
}
