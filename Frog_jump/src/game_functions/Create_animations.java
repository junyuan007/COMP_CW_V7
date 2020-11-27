package game_functions;

import game_animation.BackgroundImage;
import game_animation.Digit;
import game_animation.End;
import game_animation.Long_log;
import game_animation.Score_title;
import game_animation.Turtle;
import game_animation.Vehicle;
import game_animation.Short_log;
import game_animation.Snake;
import game_button.Pause_butt;
import game_button.Resume_butt;
import game_button.Save_high_butt;
import game_highscore.HighScore_list_butt;
import javafx.collections.ObservableList;
import p4_group_8_repo.MyStage;


/**
 * Class to create animations in game scene
 * @author Jun Yuan
 * 
 */
public class Create_animations {
	
	private int current_high;
	Save_high_butt save_butt;

	/**
	 * Construct an instance of Create_animations
	 * @param background is the container for the scene
	 */
	public Create_animations(MyStage background) {
		
		//Background
	    BackgroundImage frogger_wallpaper = new BackgroundImage(600, 910);
	    background.add(frogger_wallpaper);	// 1
	    
	    //LOG
		//top
		background.add(new Short_log(150, 0, 166, 0.75));	// 2
		background.add(new Short_log(150, 220, 166, 0.75));	// 3
		background.add(new Short_log(150, 440, 166, 0.75));	// 4	
		//mid
		background.add(new Long_log(0, 276, -2, 300));			// 5	
		background.add(new Long_log(400, 276, -2, 300));		// 6	
		//bottom
		background.add(new Short_log(150, 30, 329, 0.75));		// 7
		background.add(new Short_log(150, 270, 329, 0.75));		// 8	
		background.add(new Short_log(150, 510, 329, 0.75));		// 9
		
		//TURTLE
		//top
		background.add(new Turtle(600, 217, -1.0, 130, 130)); // 10
		background.add(new Turtle(400, 217, -1.0, 130, 130)); // 11
		background.add(new Turtle(200, 217, -1.0, 130, 130));	// 12
		//bottom
		background.add(new Turtle(500, 376, -1.0, 130, 130)); // 13
		background.add(new Turtle(300, 376, -1.0, 130, 130)); // 14
		background.add(new Turtle(700, 376, -1.0, 130, 130)); // 15
		//background.add(new WetTurtle(700, 376, -1, 130, 130));

		//END goals
		background.add(new End(11, 95, 60));	// 16
		background.add(new End(139, 95, 60));  	// 17
		background.add(new End(267, 95, 60));	// 18			removed addition operator
		background.add(new End(394, 95, 60));	// 19
		background.add(new End(523, 95, 60));	// 20
		
		//Vehicle
		//truck
		String truck_short_right = "/graphic_animation/truck1"+"Right.png";
		String truck_long_right = "/graphic_animation/truck2"+"Right.png";
		int short_truck_size = 120;
		int long_truck_size = 200;
		//top
		background.add(new Vehicle(truck_long_right, 0, 540, 1, long_truck_size, long_truck_size));	// 21
		background.add(new Vehicle());		// 22
		//background.add(new Vehicle(truck_long_right, 500, 540, 1, long_truck_size, long_truck_size));
		
		//bottom
		background.add(new Vehicle(truck_short_right, 0, 649, 1, short_truck_size, short_truck_size));		// 23
		background.add(new Vehicle(truck_short_right, 300, 649, 1, short_truck_size, short_truck_size));	// 24
		background.add(new Vehicle()); 	// 25
		//background.add(new Vehicle(truck_short_right, 600, 649, 1, short_truck_size, short_truck_size));
		
	
		//CAR
		String car_left = "/graphic_animation/car1"+"Left.png";
		int car_size = 50;
		//top
		background.add(new Vehicle(car_left, 500, 490, -3, car_size, car_size)); // 26
		//background.add(new Vehicle(car_left, 500, 490, -3, car_size, car_size)); 
		//background.add(new Vehicle());
		
		//mid
		background.add(new Vehicle(car_left, 100, 597, -1.1, car_size, car_size)); // 27
		background.add(new Vehicle(car_left, 250, 597, -1.1, car_size, car_size)); // 28
		background.add(new Vehicle(car_left, 400, 597, -1.1, car_size, car_size)); // 29
		background.add(new Vehicle(car_left, 550, 597, -1.1, car_size, car_size)); // 30
		//bottom
		background.add(new Vehicle());		//31
		background.add(new Vehicle());		//32
		
		//Snake
		background.add(new Snake());		//33

		//Score
		background.add(new Score_title(522, 18, 60));				// 34 score button
		background.add(new Digit(0, 565, 48, 23));			// 35 initial score_board


		//Button
		Resume_butt resume_butt = new Resume_butt(background, 50);
	    Pause_butt pause_butt = new Pause_butt(background, 60);
	    HighScore_list_butt highscore_butt = new HighScore_list_butt(background, 65);
	    save_butt = new Save_high_butt(background, 25);
	    ObservableList game_list = background.getChildren();
	    game_list.addAll(pause_butt.getButton(), resume_butt.getButton(), highscore_butt.getButton(), save_butt.getButton());
	    
		//System.out.println("ALL animations created");
	}
	
	public void set_curr_high(int number) {
		this.current_high = number;
		save_butt.setScore(this.current_high);
	}
	
	
}
