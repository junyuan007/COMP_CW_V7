package p4_group_8_repo;

import javafx.scene.image.Image;


public class Snake extends Actor{
	
	private double speed;
	
	Image snake1;
	Image snake2;
	Image snake3;
	Image snake4;
	//String imageLink =  "/graphic_animation/snake1_transparent.png";
	int snake_size = 80;
	double speed_movement = -3.3;

	@Override
	public void act(long now) {
		
		int divide = 999999999;
		if (now / divide % 3 == 0) {
			setImage(snake1);
		}
		else if (now / divide % 3 == 1) {
			setImage(snake2);
		}
		else if (now / divide % 3 == 2) {
			setImage(snake3);
		} 
		/*
		else if (now / divide % 4 == 3) {
			setImage(snake4);
		}*/
		move(speed , 0);
		if (getX() > 600 && speed > 0)
			setX(-200);
		if (getX() < -50 && speed < 0)
			setX(600);
	}
	
	public Snake(int x_position, int y_position) {
		//Image xxx = new Image(snake1, width, height, true, true);
		snake1 = new Image("/graphic_animation/pop1.png", snake_size, snake_size, true, true);
		snake2 = new Image("/graphic_animation/pop2.png", snake_size, snake_size, true, true);
		snake3 = new Image("/graphic_animation/pop3.png", snake_size, snake_size, true, true);
		snake4 = new Image("/graphic_animation/pop4.png", snake_size, snake_size, true, true);
		setX(x_position);
		setY(y_position);
		setImage(snake1);
		speed = speed_movement;
		System.out.println("Snake created");
	}
	
	public Snake() {
		
	}


}
