package start_page;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import p4_group_8_repo.Actor;

/**
 * Class of Background of Menu Page (start page)
 * @author Jun Yuan
 *
 */
public class Start_background extends Actor{
	
	String image_link;

	/**
	 * Empty Class
	 */
	public Start_background() {
		this.image_link = "/graphic_animation/version_1.png";
	}
	
	public Start_background(String path) {
		this.image_link = path;
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
