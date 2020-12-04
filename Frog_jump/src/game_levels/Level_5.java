package game_levels;

import game_animation.WetTurtle;
import game_scene.MyStage;
import javafx.collections.ObservableList;

/**
 * Class of Level 5
 * @author Jun Yuan
 *
 */
public class Level_5 {
	
	/**
	 * Replace more Turtles with WetTurtles
	 * @param background is the container for the scene
	 */
	public Level_5(MyStage background) {

		ObservableList animation_list = background.getChildren();

		animation_list.set(10, new WetTurtle(600, 217, -1.0, 130, 130));
		animation_list.set(11, new WetTurtle(400, 217, -1.0, 130, 130));
		animation_list.set(12, new WetTurtle(200, 217, -1.0, 130, 130));

		System.out.println("3 Turtles changes to Wet Turtles\n");
	}

}
