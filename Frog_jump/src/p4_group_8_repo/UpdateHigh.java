package p4_group_8_repo;

public class UpdateHigh {
	
	int size_digit = 30;
	int points;
	TopScore top_score;
	MyStage background;
	
	public UpdateHigh(int points, TopScore top_score, MyStage background) {
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
	
	
	
	 public void update_highest(int current_points) {
	    	int shift = 0;
	    	//System.out.println("UPDATE " + current_points);
	    	//System.out.println("TOP " + top_score.getScore());
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
