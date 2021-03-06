package p4_group_8_repo.Game_levels;

import javafx.collections.ObservableList;
import p4_group_8_repo.Game_actor.WetTurtle;
import p4_group_8_repo.Game_scene.MyStage;

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
		
		animation_list.set(9, new WetTurtle(600, 217, -1.0, 130, 130));
		animation_list.set(10, new WetTurtle(400, 217, -1.0, 130, 130));
		animation_list.set(11, new WetTurtle(200, 217, -1.0, 130, 130));

		System.out.println("3 Turtles changes to Wet Turtles\n");
	}

}
