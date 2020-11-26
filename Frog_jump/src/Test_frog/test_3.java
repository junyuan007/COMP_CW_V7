package Test_frog;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import game_animation.BackgroundImage;
import game_animation.Crocodile;
import game_animation.Digit;
import game_animation.End;
import game_animation.HighScore_title;
import game_animation.Long_log;
import game_animation.Score_title;
import game_animation.Turtle;
import game_animation.Vehicle;
import game_animation.WetTurtle;
import javafx.scene.image.Image;
import game_animation.Short_log;
import game_animation.Snake;

class test_3 {

	@Test
	public void game_background_test () {
		String image_close =  "/graphic_animation/crocodile4_close_right.png";
		Crocodile crocodile = new Crocodile(0, 166, 0.75, 155, 135);
		Image croc_rest = new Image(image_close, 155, 135, true, true);
		Image code = crocodile.get_Image();
		assertSame(croc_rest, code);
	}

}
