package p4_group_8_repo.Info_page;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import p4_group_8_repo.Game_actor.Actor;


/**
 * Class of Background of Menu Page (start page)
 * @author Jun Yuan
 *
 */
public class Info_background extends Actor{
	
	private String image_link ="/graphic_animation/info_wallpaper.jpg";

	/**
	 * Empty Class
	 */
	public Info_background() {
	}
	
	/**
	 * Create Menu Page
	 * @return Image_view which is the background of menu page
	 */
	public ImageView menu_page() {
		Image image = new Image(image_link);
		ImageView start_image = new ImageView(image);
		return start_image;
	}

	/**
	 * Empty Class
	 */
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}

}
