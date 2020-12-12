package p4_group_8_repo.Game_functions;

import p4_group_8_repo.Game_actor.Frog_player;
import p4_group_8_repo.Game_scene.MyStage;

public class Create_frogger {

	Frog_player animal;
	
	public Create_frogger(MyStage background) {
		String main_frog = "/graphic_animation/froggerUp.png";
		animal = new Frog_player(main_frog);
		background.add(animal);
	}
	
	public Frog_player get_player() {
		return animal;
	}
}
