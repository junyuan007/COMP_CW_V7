package p4_group_8_repo;

import javafx.scene.image.Image;

/**
 * Class of BackgroundImage
 * @author Jun Yuan
 *
 */
public class BackgroundImage extends Actor{
	

	/**
	 * Empty class because BackgroundImage is not moving
	 */
	@Override
	public void act(long now) {
		
	}

	/**
	 * Construct an instance of BackgroundImage
	 */
	public BackgroundImage() {
		setImage(new Image("file:src/p4_group_8_repo/iKogsKW.png", 600, 910, true, true));
		
	}

}
