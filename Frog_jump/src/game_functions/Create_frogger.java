package game_functions;

import game_animation.Frog_player;
import game_scene.MyStage;

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
