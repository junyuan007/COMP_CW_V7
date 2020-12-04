package game_levels;

import game_animation.Snake;
import game_scene.MyStage;
import javafx.collections.ObservableList;

/**
 * Class of Level 7
 * @author Jun Yuan
 *
 */
public class Level_7 {
	
	/**
	 * Add new Snake
	 * @param background is the container for the scene
	 */
	public Level_7(MyStage background) {
		
		int size = 80;
		ObservableList animation_list = background.getChildren();
		
		animation_list.set(33, new Snake(20, 429, 80, -3.3));
		
		System.out.println("1 Snake added\n");
	}

}
