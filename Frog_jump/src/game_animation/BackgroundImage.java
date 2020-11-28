package game_animation;

import javafx.scene.image.Image;
import p4_group_8_repo.Actor;

/**
 * Class of BackgroundImage
 * @author Jun Yuan
 *
 */
public class BackgroundImage extends Actor{
	
	//private String image_link = "/graphic_animation/game_background.png";
	private String image_link = "/graphic_animation/game_back_3.png";

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
	public BackgroundImage(int width, int height) {
		setImage(new Image(image_link, width, height, true, true));
		
	}

}
