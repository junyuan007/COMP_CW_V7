package p4_group_8_repo;

import javafx.scene.image.Image;

public class Score extends Actor{

	Image image_1;
	String image_link = "/graphic_animation/score.png";

	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
	
	public Score(int size, int x_position, int y_position) {
		image_1 = new Image(image_link, size,size, true, true);
		setImage(image_1);
		setX(x_position);
		setY(y_position);
	}
	
}
