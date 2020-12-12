package p4_group_8_repo.Game_levels;


import javafx.collections.ObservableList;
import p4_group_8_repo.Game_actor.Crocodile;
import p4_group_8_repo.Game_actor.Short_log;
import p4_group_8_repo.Game_scene.MyStage;

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
		
		animation_list.set(1, new Short_log(150, 220, 166, 0.75));
		animation_list.set(2, new Crocodile(0, 166, 0.75, 155, 135));
		animation_list.set(3, new Short_log(150, 440, 166, 0.75));
		
		System.out.println("1 short log changed to crocodile\n");
	}

}
