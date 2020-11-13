package Game_functions;

import All_animation.Digit;
import Files_IO.Edit_topScore;
import p4_group_8_repo.MyStage;

/**
 * Class to Update High Score in game scene
 * @author Jun Yuan
 *
 */
public class Update_HighScore {
	
	int size_digit = 30;
	int points;
	Edit_topScore top_score;
	MyStage background;
	
	/**
	 * Construct an instance of Update_HighScore
	 * @param points is the NEW high score
	 * @param top_score is for the update of High Score Files
	 * @param background is the container for the scene
	 */
	public Update_HighScore(int points, Edit_topScore top_score, MyStage background) {
		this.points = points;
		this.top_score = top_score;
		this.background = background;
		int shift = 0;

		if (points == 0) {							//condition if reset high score
			background.add(new Digit(0, size_digit, 450, 35));
		}
		
		while (points > 0) {
			
			int temp = points / 10;
			int display = points - (temp * 10);			
			points = temp;
			int x_coordinate = 450 - shift;
			background.add(new Digit(display, size_digit, x_coordinate, 35));
			shift += 30;
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
	      		  	background.add(new Digit(display, size_digit, x_coordinate, 35));
	      		  	shift += 30;
	    		}

	    	}
	    }

}