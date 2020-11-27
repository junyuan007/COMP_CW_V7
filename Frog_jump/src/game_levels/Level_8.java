package game_levels;


import game_animation.Crocodile;
import game_animation.Short_log;
import javafx.collections.ObservableList;
import p4_group_8_repo.MyStage;

/**
 * Class of Level 8
 * @author Jun Yuan
 *
 */
public class Level_8 {
	
	/**
	 * Replace short logs with Crocodile
	 * @param background is the container for the scene
	 */
	public Level_8(MyStage background) {
		
		ObservableList animation_list = background.getChildren();
		String short_log = "/graphic_animation/log3.png";
		
		animation_list.set(2, new Short_log(150, 220, 166, 0.75));
		animation_list.set(3, new Crocodile(0, 166, 0.75, 155, 135));
		animation_list.set(4, new Short_log(150, 440, 166, 0.75));
		
		System.out.println("1 short log changed to crocodile\n");
	}

}
