package p4_group_8_repo.Game_actor;

import java.util.ArrayList;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * Class of Frog Character (animation)
 * @author Jun Yuan
 *
 */
public class Frog_player extends Actor {
	//direction
	Image W_direction;
	Image A_direction;
	Image S_direction;
	Image D_direction;
	//move
	Image W_move;
	Image A_move;
	Image S_move;
	Image D_move;
	
	int player_points = 0;
	//int end = 0;
	private boolean second = false;
	boolean not_moving = false;
	double movement = 26.66;
	double movementX = 21.33;
	int image_Size = 40;
	boolean car_die = false;
	boolean water_die = false;
	boolean stop = false;
	boolean changeScore = false;
	int carD = 0;
	double scene_width = 800;
	ArrayList<End> inter = new ArrayList<End>();			// array list of END goals
	
	int divide = 99;
	double x_start = 300;
	double y_start = 725;
	
	int goal = 0;
	int flag = 0;
	boolean croc_die = false;
	boolean end_die = false;
	int temp = 0;
	
	/**
	 * Constructor for main_frog character
	 * @param imageLink is the source of the image
	 * 
	 */
	public Frog_player(String imageLink) {
		setImage(new Image(imageLink, image_Size, image_Size, true, true));
		
		setX(x_start);
		setY(y_start + movement);
		W_direction = new Image("/graphic_animation/froggerUp.png", image_Size, image_Size, true, true);
		A_direction = new Image("/graphic_animation/froggerLeft.png", image_Size, image_Size, true, true);
		S_direction = new Image("/graphic_animation/froggerDown.png", image_Size, image_Size, true, true);
		D_direction = new Image("/graphic_animation/froggerRight.png", image_Size, image_Size, true, true);
		
		W_move = new Image("/graphic_animation/froggerUpJump.png", image_Size, image_Size, true, true);
		A_move = new Image("/graphic_animation/froggerLeftJump.png", image_Size, image_Size, true, true);
		S_move = new Image("/graphic_animation/froggerDownJump.png", image_Size, image_Size, true, true);
		D_move = new Image("/graphic_animation/froggerRightJump.png", image_Size, image_Size, true, true);
		
		//event: press WASD
		setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event){
				if (not_moving) {	
				}
				//if second is true, set direction
				else {
				if (second) {
					if (event.getCode() == KeyCode.W) {	  
		                move(0, -movement);
		                changeScore = false;
		                setImage(W_direction);
		                second = false;
		            }
		            else if (event.getCode() == KeyCode.A) {	            	
		            	 move(-movementX, 0);
		            	 setImage(A_direction);
		            	 second = false;
		            }
		            else if (event.getCode() == KeyCode.S) {	            	
		            	 move(0, movement);
		            	 setImage(S_direction);
		            	 second = false;
		            }
		            else if (event.getCode() == KeyCode.D) {	            	
		            	 move(movementX, 0);
		            	 setImage(D_direction);
		            	 second = false;
		            }
				}
				//if second is false, set movement
				else if (event.getCode() == KeyCode.W) {	            	
	                move(0, -movement);
	                setImage(W_move);
	                second = true;
	            }
	            else if (event.getCode() == KeyCode.A) {	            	
	            	 move(-movementX, 0);
	            	 setImage(A_move);
	            	 second = true;
	            }
	            else if (event.getCode() == KeyCode.S) {	            	
	            	 move(0, movement);
	            	 setImage(S_move);
	            	 second = true;
	            }
	            else if (event.getCode() == KeyCode.D) {	            	
	            	 move(movementX, 0);
	            	 setImage(D_move);
	            	 second = true;
	            }
	        }	//end else 
			}	//end handle
		});		//end EventHandler
		
		setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
				if (not_moving) {
				}
				
				else {
				if (event.getCode() == KeyCode.W) {	  
					if (getY() < scene_width) {
						changeScore = true;
						scene_width = getY();
						player_points += 10;  //gain points
					}
	                move(0, -movement);
	                setImage(W_direction);
	                second = false;
	            }
	            else if (event.getCode() == KeyCode.A) {	            	
	            	 move(-movementX, 0);
	            	 setImage(A_direction);
	            	 second = false;
	            }
	            else if (event.getCode() == KeyCode.S) {	            	
	            	 move(0, movement);
	            	 setImage(S_direction);
	            	 second = false;
	            }
	            else if (event.getCode() == KeyCode.D) {	            	
	            	 move(movementX, 0);
	            	 setImage(D_direction);
	            	 second = false;
	            }
	        }
			}
			
		});
	}			//END animal constructor
	
	@Override
	/**
	 * Method for frog character to interact (check condition)
	 * @param now
	 */
	public void act(long now) {

		if (getY() < 0 || getY() > 800) {
			setX(x_start);
			setY(y_start + movement);
		}
		if (getX()<0) {
			move(movement * 2, 0);
		}
		//  Car die
		if (car_die) {
			not_moving = true;
			if ((now) % 11 == 0) {
				carD++;
			}
			if (carD == 1) {
				setImage(new Image("/graphic_animation/cardeath1.png", image_Size, image_Size, true, true));
			}
			if (carD == 2) {
				setImage(new Image("/graphic_animation/cardeath2.png", image_Size, image_Size, true, true));
			}
			if (carD == 3) {
				setImage(new Image("/graphic_animation/cardeath3.png", image_Size, image_Size, true, true));
			}
			if (carD == 4) {
				setX(x_start);
				setY(y_start + movement);
				car_die = false;
				carD = 0;
				setImage(new Image("/graphic_animation/froggerUp.png", image_Size, image_Size, true, true));
				not_moving = false;
				if (player_points > 50) {
					player_points -= 50;			// if points more than 50 and car accident then minus points
					changeScore = true;	
				}
			}
			
		}
		//  Water die
		if (water_die) {
			not_moving = true;
			if ((now) % 11 == 0) {
				carD++;
			}
			if (carD == 1) {
				setImage(new Image("/graphic_animation/waterdeath1.png", image_Size,image_Size , true, true));
			}
			if (carD == 2) {
				setImage(new Image("/graphic_animation/waterdeath2.png", image_Size,image_Size , true, true));
			}
			if (carD == 3) {
				setImage(new Image("/graphic_animation/waterdeath3.png", image_Size,image_Size , true, true));
			}
			if (carD == 4) {
				setImage(new Image("/graphic_animation/waterdeath4.png", image_Size,image_Size , true, true));
			}
			if (carD == 5) {
				setX(x_start);
				setY(y_start + movement);
				water_die = false;
				carD = 0;
				setImage(new Image("/graphic_animation/froggerUp.png", image_Size, image_Size, true, true));
				not_moving = false;
				if (player_points > 50) {
					player_points -= 50;
					changeScore = true;
					System.out.println("Water Die");
				}
			}
			
		}

		// Crocodile die 
		if (croc_die) {
			not_moving = true;
			if ((now) % 11 == 0) {
				carD++;
			}
			if (carD == 1) {
				setImage(new Image("/graphic_animation/waterdeath1.png", image_Size,image_Size , true, true));
			}
			if (carD == 2) {
				setImage(new Image("/graphic_animation/waterdeath2.png", image_Size,image_Size , true, true));
			}
			if (carD == 3) {
				setImage(new Image("/graphic_animation/waterdeath3.png", image_Size,image_Size , true, true));
			}
			if (carD == 4) {
				setImage(new Image("/graphic_animation/waterdeath4.png", image_Size,image_Size , true, true));
			}
			if (carD == 5) {
				setX(x_start);
				setY(y_start + movement);
				croc_die = false;
				carD = 0;
				setImage(new Image("/graphic_animation/froggerUp.png", image_Size, image_Size, true, true));
				not_moving = false;
				if (player_points > 50) {
					player_points -= 50;
					changeScore = true;
				}
			}
			
		}
		
		
		if (getX() > 600) {
			move(-movement * 2, 0);
		}
		if (getIntersectingObjects(Vehicle.class).size() >= 1 || getIntersectingObjects(Snake.class).size() >= 1) {
			car_die = true;															// car die or snake die
		}

		if (getX() == 240 && getY() == 82) {
			stop = true;
		}
		if (getIntersectingObjects(Short_log.class).size() >= 1 && !not_moving) {
			if(getIntersectingObjects(Short_log.class).get(0).getLeft())			//intersect with short log frog moves
				move(-2, 0);
			else
				move (0.75, 0);
		}
		else if (getIntersectingObjects(Long_log.class).size() >= 1 && !not_moving) {
			if(getIntersectingObjects(Long_log.class).get(0).getLeft())				//intersect with long log frog moves
				move(-2, 0);
			else
				move (0.75, 0);
		}
		else if (getIntersectingObjects(Turtle.class).size() >= 1 && !not_moving) {
			move(-1, 0);															//intersect with normal turtle frog moves
		}
		else if (getIntersectingObjects(WetTurtle.class).size() >= 1) {
			if (getIntersectingObjects(WetTurtle.class).get(0).isSunk()) {
				water_die = true;													// SUNKEN turtle die
			} 
			else {
				move(-1, 0);														
			}
		}
		
		else if (getIntersectingObjects(Crocodile.class).size() >= 1) {
			if (getIntersectingObjects(Crocodile.class).get(0).isSunk()) {
				croc_die = true;													// Crocodile die
			} 
			else {
				move(0.75, 0);
			}
		}
		else if (getIntersectingObjects(End.class).size() >= 1) {
			inter = (ArrayList<End>) getIntersectingObjects(End.class);
			if (getIntersectingObjects(End.class).get(0).isActivated()) {
				goal--;
				player_points -= 50;	
			}

			getIntersectingObjects(End.class).get(0).setEnd();
			player_points += 50;
			goal ++;
			scene_width = 800;
			changeScore = true;
			setX(x_start);
			setY(y_start + movement);
		}
		
		
		else if (getY() < 413){
			water_die = true;
		}
			
	}		//END act method
	
	/**
	 * Method to check if all 10 goals are scored 
	 * @return the boolean value of if game has ended
	 */
	public boolean getStop() {
		if(goal == 10) {
			return true;
		}
		else return false;
	}
	
	/**
	 * Check if level is changed
	 * @return the boolean value of if level is changed
	 */
	public boolean change_level() {
		if(goal > flag) {
			flag = goal;
			return true;
		}
		else if(goal == flag) {
			return false;
		}
		else
			System.out.println("Error in Frog_player.change_level method ");
			return false;
	}
	
	/**
	 * Method to get the goal value
	 * @return the value of goal
	 */
	public int getGoal() {
		return goal;
	}
	
	/**
	 * Access to get points
	 * @return the player's point's value
	 */
	public int getPoints() {
		return player_points;
	}
	
	/**
	 * Method to change the score
	 * @return whether score is changed score or not
	 */
	public boolean changeScore() {
		if (changeScore) {
			changeScore = false;
			return true;
		}
		return false;
	}

}
