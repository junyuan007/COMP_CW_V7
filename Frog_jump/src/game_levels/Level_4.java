package game_levels;

import game_animation.Turtle;
import game_animation.WetTurtle;
import game_scene.MyStage;
import javafx.collections.ObservableList;

/**
 * Class of Level 4
 * @author Jun Yuan
 *
 */
public class Level_4 {

	/**
	 * Replace Turtles with WetTurtles
	 * @param background is the container for the scene
	 */
	public Level_4(MyStage background) {

		ObservableList animation_list = background.getChildren();
		
		animation_list.set(12, new Turtle(500, 376, -1.0, 130, 130));
		animation_list.set(13, new Turtle(300, 376, -1.0, 130, 130));
		animation_list.set(14, new WetTurtle(700, 376, -1.0, 130, 130));
		
		System.out.println("1 Turtle changed to Wet Turtles\n");
	}
}
