package game_levels;


import game_animation.Crocodile;
import game_animation.Short_log;
import javafx.collections.ObservableList;
import p4_group_8_repo.MyStage;

/**
 * Class of Level 9
 * @author Jun Yuan
 * 
 */
public class Level_9 {
	
	/**
	 * Replace more short logs with Crocodile
	 * @param background is the container for the scene
	 */
	public Level_9(MyStage background) {
		
		ObservableList animation_list = background.getChildren();
		String short_log = "/graphic_animation/log3.png";
		int croc_height = 135;
		int croc_width = 155;
		double speed = 0.75;

		animation_list.set(7, new Crocodile(30, 329, speed, croc_width, croc_height));
		animation_list.set(8, new Short_log(150, 270, 329, speed));
		animation_list.set(9, new Crocodile(510, 329, speed, croc_width, croc_height));
		
		//System.out.println("2 short log changed to crocodile");
		
	}

}
