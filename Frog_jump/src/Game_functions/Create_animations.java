package Game_functions;

import All_animation.BackgroundImage;
import All_animation.Digit;
import All_animation.End;
import All_animation.HighScore_title;
import All_animation.Log;
import All_animation.Score_title;
import All_animation.Turtle;
import All_animation.WetTurtle;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import p4_group_8_repo.MyStage;

public class Create_animations {

	public Create_animations(MyStage background) {
		
		//Animal animal;
		int size_digit = 30;
		
		//Background
	    //Shifted image link to BackgroundImage constructor
	    BackgroundImage frogger_wallpaper = new BackgroundImage();
	    background.add(frogger_wallpaper);
	    
	    //LOG
		//top
		String short_log = "/graphic_animation/log3.png";
		String long_log = "/graphic_animation/logs.png";
		background.add(new Log(short_log, 150, 0, 166, 0.75));	
		background.add(new Log(short_log, 150, 220, 166, 0.75));	
		background.add(new Log(short_log, 150, 440, 166, 0.75));	
		//mid
		background.add(new Log(long_log, 300, 0, 276, -2));		
		background.add(new Log(long_log, 300, 400, 276, -2));	
		//bottom
		background.add(new Log(short_log, 150, 50, 329, 0.75));	
		background.add(new Log(short_log, 150, 270, 329, 0.75));	
		background.add(new Log(short_log, 150, 490, 329, 0.75));	
		
		//TURTLE
		//top
		background.add(new WetTurtle(600, 217, -1, 130, 130));
		background.add(new WetTurtle(400, 217, -1, 130, 130));
		background.add(new WetTurtle(200, 217, -1, 130, 130));	
		//bottom
		background.add(new Turtle(500, 376, -1, 130, 130));
		background.add(new Turtle(300, 376, -1, 130, 130));
		background.add(new WetTurtle(700, 376, -1, 130, 130));
		
		//END goals
		background.add(new End(11,95));
		background.add(new End(139,95));
		background.add(new End(267, 95));	//removed addition operator
		background.add(new End(394, 95));
		background.add(new End(523, 95));
		/*
		//Vehicle
		//truck
		String truck_short_right = "/graphic_animation/truck1"+"Right.png";
		String truck_long_right = "/graphic_animation/truck2"+"Right.png";
		int short_truck_size = 120;
		int long_truck_size = 200;
		//top
		background.add(new Vehicle(truck_long_right, 0, 540, 1, long_truck_size, long_truck_size));
		background.add(new Vehicle(truck_long_right, 500, 540, 1, long_truck_size, long_truck_size));
		//bottom
		background.add(new Vehicle(truck_short_right, 0, 649, 1, short_truck_size, short_truck_size));
		background.add(new Vehicle(truck_short_right, 300, 649, 1, short_truck_size, short_truck_size));
		background.add(new Vehicle(truck_short_right, 600, 649, 1, short_truck_size, short_truck_size));
		
		//CAR
		String car_left = "/graphic_animation/car1"+"Left.png";
		int car_size = 50;
		//top
		background.add(new Vehicle(car_left, 500, 490, -5, car_size, car_size));
		//mid
		background.add(new Vehicle(car_left, 100, 597, -1.1, car_size, car_size));
		background.add(new Vehicle(car_left, 250, 597, -1.1, car_size, car_size));
		background.add(new Vehicle(car_left, 400, 597, -1.1, car_size, car_size));
		background.add(new Vehicle(car_left, 550, 597, -1.1, car_size, car_size));
		//bottom (new)
		background.add(new Vehicle(car_left, 175, 694, -0.60, car_size, car_size));
		background.add(new Vehicle(car_left, 475, 694, -0.60, car_size, car_size));
		*/
		
		background.add(new HighScore_title(60, 400, 12));			//high score button
		//background.add(new Digit(high_score, size_digit, 450, 35));		//initial score_board

		background.add(new Score_title(60, 520, 9));					//score button
		background.add(new Digit(0, size_digit, 565, 35));		//initial score_board
		
		//back_menu back_2 = new back_menu(background, scene_start);
	    //background.add(back_2);
		
		//System.out.println("ALL animations created");
	}
}
