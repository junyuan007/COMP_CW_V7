package p4_group_8_repo;

import javafx.scene.image.Image;


public class Snake extends Actor{
	
	private double speed;
	String imageLink =  "/graphic_animation/yyy.png";
	//String imageLink =  "/graphic_animation/ppp.png";

	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX() > 600 && speed > 0)
			setX(-200);
		if (getX() < -50 && speed < 0)
			setX(600);
	}
	
	public Snake(int x_position, int y_position, double speed_movement, int width, int height) {
		Image xxx = new Image(imageLink, width, height, true, true);
		setImage(xxx);
		setX(x_position);
		setY(y_position);
		speed = speed_movement;
		System.out.println("Snake created");
	}
	
	public Snake() {
		
	}


}
