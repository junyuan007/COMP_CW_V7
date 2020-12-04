package game_animation;

import game_scene.Actor;
import javafx.scene.image.Image;

/**
 * Class of BackgroundImage
 * @author Jun Yuan
 *
 */
public class Background_Image extends Actor{
	
	private String image_link = "/graphic_animation/game_background.png";

	/**
	 * Empty class because BackgroundImage is not moving
	 */
	@Override
	public void act(long now) {
		
	}

	/**
	 * Construct an instance of BackgroundImage
	 * @param width of the background image
	 * @param height of the background image
	 */
	public Background_Image(int width, int height) {
		setImage(new Image(image_link, width, height, true, true));
		
	}

}
