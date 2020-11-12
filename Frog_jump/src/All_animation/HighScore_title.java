package All_animation;

import javafx.scene.image.Image;
import p4_group_8_repo.Actor;

public class HighScore_title extends Actor{

	Image image_1;
	String image_link = "/graphic_animation/high_score.png";

	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
	
	public HighScore_title(int size, int x_position, int y_position) {
		image_1 = new Image(image_link, size,size, true, true);
		setImage(image_1);
		setX(x_position);
		setY(y_position);
	}
	
}
