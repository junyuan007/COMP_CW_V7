package p4_group_8_repo;

import javafx.scene.image.Image;


public class Crocodile extends Actor{
	
	private double speed;
	Image croc_rest;
	Image croc_hungry;
	boolean sunk = false;
	
	//String image_open =  "/graphic_animation/croc_right_open1.png";
	//String image_close =  "/graphic_animation/croc_right_close.png";
	
	String image_open =  "/graphic_animation/crocodile3_open_right.png";
	String image_close =  "/graphic_animation/crocodile4_close_right.png";

	@Override
	public void act(long now) {
	
		int divide = 999999999;
				if (now / divide % 4 == 0) {
					setImage(croc_rest);
					sunk = false;
				}
				else if (now / divide % 4 == 1) {
					setImage(croc_rest);
					sunk = false;
				}
				else if (now / divide % 4 == 2) {
					setImage(croc_rest);
					sunk = false;
				}
				else if (now / divide % 4 == 3) {
					setImage(croc_hungry);
					sunk = true;
				}
				
		move(speed , 0);
		if (getX() > 600 && speed > 0)
			setX(-200);
		if (getX() < -50 && speed < 0)
			setX(600);
	}
	
	public Crocodile(int x_position, int y_position, double speed_movement, int width, int height) {
		croc_rest = new Image(image_close, width, height, true, true);
		croc_hungry = new Image(image_open, width, height, true, true);
		
		setX(x_position);
		setY(y_position);
		speed = speed_movement;
		setImage(croc_rest);
		System.out.println("Crocodile created");
	}
	
	public Crocodile() {
		
	}
	
	public boolean isSunk() {
		return sunk;
	}


}
