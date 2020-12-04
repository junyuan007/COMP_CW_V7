package game_functions;

import game_animation.Digit;
import game_highscore.Top_HighScore;
import game_scene.MyStage;

/**
 * Class to Update High Score in game scene
 * @author Jun Yuan
 *
 */
public class Update_HighScore_animation {
	
	private int points;
	private int size_digit = 23;
	private int y_coordinate = 48;
	
	Top_HighScore top_score;
	MyStage background;
	
	/**
	 * Construct an instance of Update_HighScore
	 * @param points is the NEW high score
	 * @param top_score is for the update of High Score Files
	 * @param background is the container for the scene
	 */
	public Update_HighScore_animation(int points, Top_HighScore top_score, MyStage background) {
		this.points = points;
		this.top_score = top_score;
		this.background = background;
		int shift = 0;

		if (points == 0) {							//condition if reset high score
			background.add(new Digit(0, 404, y_coordinate, size_digit));
			background.add(new Digit(0, 427, y_coordinate, size_digit));
			background.add(new Digit(0, 450, y_coordinate, size_digit));
		}
		
		while (points > 0) {
			int temp = points / 10;
			int display = points - (temp * 10);			
			points = temp;
			int x_coordinate = 450 - shift;
			background.add(new Digit(display, x_coordinate, y_coordinate, size_digit));
			shift += size_digit;
		}
		
	}
	
	
	/**
	 * Method to update High Score while game running
	 * @param current_points is the current point of player
	 */
	 public void update_highest(int current_points) {
	    	int shift = 0;
	    	if(current_points >= top_score.getScore()) {
	    		while (current_points > 0) {
	    			int temp = current_points / 10;
	    			int display = current_points - (temp * 10);			
	      		  	current_points = temp;
	      		  	int x_coordinate = 450 - shift;

	      		  	background.add(new Digit(display, x_coordinate, y_coordinate, size_digit));
	      		  	shift += size_digit;

	    		}

	    	}
	    }

}
