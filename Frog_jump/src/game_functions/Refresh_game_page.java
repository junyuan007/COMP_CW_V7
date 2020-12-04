package game_functions;

import game_animation.Digit;
import game_scene.MyStage;
import javafx.animation.AnimationTimer;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import p4_group_8_repo.Main;


/**
 * Class to update Game Page data
 * @author Jun Yuan
 *
 */
public class Refresh_game_page {
	
	/**
	 * Empty Constructor
	 */
	public Refresh_game_page () {
		
	}
	
	/**
	 * Method to Update Current Score Board
	 * @param background is the container for the scene
	 * @param current_points of the game
	 */
	public void set_number(MyStage background, int current_points) {
    	int shift = 0;
    	int y_coordinate = 48;

    	while (current_points > 0) {
    		  int temp = current_points / 10;
    		  int display = current_points - (temp * 10);
    		  current_points = temp;
    		  int x_coordinate = 565 - shift;
    		  background.add(new Digit(display, x_coordinate, y_coordinate, 23));		//overlap initial digit
    		  shift += 23;
    		}
    }
	
	/**
	 * Method to Update Level Title
	 * @param background is the container for the scene
	 * @param curr_level is the current level of the game
	 */
	public void update_level(MyStage background, int curr_level) {
		
		int y_coordinate = 52;
		int x_coordinate = 295;
		int size = 25;
		if(curr_level < 10) {
			background.add(new Digit(curr_level, x_coordinate, y_coordinate, size));
		}
		else if(curr_level == 10) {
			background.add(new Digit(1, x_coordinate, y_coordinate, size));
			background.add(new Digit(0, x_coordinate + 24, y_coordinate, size));
		}
		else {
			System.out.println("Error in Refresh.java in update_level");
		}
	}

	/**
	 * Method to create animation timer
	 * @param main TODO
	 */
	public void createTimer(final Main main) {
		
	    main.timer = new AnimationTimer() {
	        @Override
	        public void handle(long now) {
	        	if (main.frogger.get_player().changeScore()) {
	        		
	        		// Update High Score Board
	        		if(main.frogger.get_player().getPoints() > main.player_highscore.getScore()) {
	        			main.player_highscore.setScore(main.frogger.get_player().getPoints());
	        			main.update_highscore_board.update_highest(main.frogger.get_player().getPoints());
	        		}
	        		main.animation.set_curr_high(main.player_highscore.getScore());
	        		set_number(main.background, main.frogger.get_player().getPoints());
	        		//set_number(frogger.get_player().getPoints());
	        		
	        	}
	        	
	        	// Change Level
	        	if (main.frogger.get_player().change_level()) {
	        		main.level_control.set_level((main.frogger.get_player().getGoal() + 1));
	        		update_level(main.background, main.frogger.get_player().getGoal() + 1);
	        	}
	        	
	        	// Finish Game
	        	if (main.frogger.get_player().getStop()) {										
	        		System.out.println("*** STOP ***");
	        		main.background.stopMusic();
	        		main.stop();
	        		main.background.stop();
	        		Alert alert = new Alert(AlertType.INFORMATION);
	        		alert.setTitle("*-*-* YOU WIN *-*-*");
	        		alert.setHeaderText("Your High Score: "+main.frogger.get_player().getPoints()+"!");
	        		alert.setContentText("Highest Possible Score: 1700");
	        		alert.show();
	        	}
	        }
	    };
	}

}
