package All_animation;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import p4_group_8_repo.Actor;

public class Menu_page extends Actor{
	
	String image_link = "/graphic_animation/version_1.png";

	public Menu_page() {
		//setImage(new Image(image_link, 600, 910, true, true));
	}
	
	public ImageView menu_page() {
		Image image = new Image(image_link);
		ImageView start_image = new ImageView(image);
		return start_image;
	}
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}

}
