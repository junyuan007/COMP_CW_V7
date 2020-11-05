package p4_group_8_repo;

import java.util.ArrayList;

import javafx.event.EventHandler;

import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * Class of Animal (animation)
 * @author Jun Yuan
 *
 */
public class Animal extends Actor {
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
	int end = 0;
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
	double w = 800;
	ArrayList<End> inter = new ArrayList<End>();			// array list of END goals
	
	int divide = 99;
	
	// Troll code
	//double movement = 13.3333333*2;
	//double movementX = 10.666666*2;
	
	/**
	 * Constructor for main_frog
	 * @param imageLink is the source of the image
	 * 
	 */
	public Animal(String imageLink) {
		setImage(new Image(imageLink, image_Size, image_Size, true, true));
		
		setX(300);
		setY(679.8+movement);
		W_direction = new Image("file:src/p4_group_8_repo/froggerUp.png", image_Size, image_Size, true, true);
		A_direction = new Image("file:src/p4_group_8_repo/froggerLeft.png", image_Size, image_Size, true, true);
		S_direction = new Image("file:src/p4_group_8_repo/froggerDown.png", image_Size, image_Size, true, true);
		D_direction = new Image("file:src/p4_group_8_repo/froggerRight.png", image_Size, image_Size, true, true);
		
		W_move = new Image("file:src/p4_group_8_repo/froggerUpJump.png", image_Size, image_Size, true, true);
		A_move = new Image("file:src/p4_group_8_repo/froggerLeftJump.png", image_Size, image_Size, true, true);
		S_move = new Image("file:src/p4_group_8_repo/froggerDownJump.png", image_Size, image_Size, true, true);
		D_move = new Image("file:src/p4_group_8_repo/froggerRightJump.png", image_Size, image_Size, true, true);
		
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
					if (getY() < w) {
						changeScore = true;
						w = getY();
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
	}			//END animal constructor (can factorize movement out )
	
	@Override
	/**
	 * Method for frogger animations to interact
	 * @param now
	 */
	public void act(long now) {
		//int bounds = 0;
		if (getY() < 0 || getY() > 734) {
			setX(300);
			setY(679.8+movement);
		}
		if (getX()<0) {
			move(movement * 2, 0);
		}
		if (car_die) {
			not_moving = true;
			if ((now) % 11 == 0) {
				carD++;
			}
			if (carD == 1) {
				setImage(new Image("file:src/p4_group_8_repo/cardeath1.png", image_Size, image_Size, true, true));
			}
			if (carD == 2) {
				setImage(new Image("file:src/p4_group_8_repo/cardeath2.png", image_Size, image_Size, true, true));
			}
			if (carD == 3) {
				setImage(new Image("file:src/p4_group_8_repo/cardeath3.png", image_Size, image_Size, true, true));
			}
			if (carD == 4) {
				setX(300);
				setY(679.8+movement);
				car_die = false;
				carD = 0;
				setImage(new Image("file:src/p4_group_8_repo/froggerUp.png", image_Size, image_Size, true, true));
				not_moving = false;
				if (player_points > 50) {
					player_points -= 50;			// if points more than 50 and car accident then minus points
					changeScore = true;		
				}
			}
			
		}
		if (water_die) {
			not_moving = true;
			if ((now) % 11 == 0) {
			//if ((now / divide) % 11 == 0) {
				carD++;
			}
			if (carD==1) {
				setImage(new Image("file:src/p4_group_8_repo/waterdeath1.png", image_Size,image_Size , true, true));
			}
			if (carD==2) {
				setImage(new Image("file:src/p4_group_8_repo/waterdeath2.png", image_Size,image_Size , true, true));
			}
			if (carD==3) {
				setImage(new Image("file:src/p4_group_8_repo/waterdeath3.png", image_Size,image_Size , true, true));
			}
			if (carD == 4) {
				setImage(new Image("file:src/p4_group_8_repo/waterdeath4.png", image_Size,image_Size , true, true));
			}
			if (carD == 5) {
				setX(300);
				setY(679.8+movement);
				water_die = false;
				carD = 0;
				setImage(new Image("file:src/p4_group_8_repo/froggerUp.png", image_Size, image_Size, true, true));
				not_moving = false;
				if (player_points>50) {
					player_points-=50;
					changeScore = true;
				}
			}
			
		}
		
		if (getX()>600) {
			move(-movement * 2, 0);
		}
		if (getIntersectingObjects(Obstacle.class).size() >= 1) {
			car_die = true;											// car accident
		}
		if (getX() == 240 && getY() == 82) {
			stop = true;
		}
		if (getIntersectingObjects(Log.class).size() >= 1 && !not_moving) {
			if(getIntersectingObjects(Log.class).get(0).getLeft())					//intersect with log no problem!
				move(-2, 0);
			else
				move (0.75, 0);
		}
		else if (getIntersectingObjects(Turtle.class).size() >= 1 && !not_moving) {
			move(-1, 0);															//intersect with turtle no problem!
		}
		else if (getIntersectingObjects(WetTurtle.class).size() >= 1) {
			if (getIntersectingObjects(WetTurtle.class).get(0).isSunk()) {
				water_die = true;													//if step on SUNK turtle then die
			} 
			else {
				move(-1, 0);														
			}
		}
		else if (getIntersectingObjects(End.class).size() >= 1) {
			inter = (ArrayList<End>) getIntersectingObjects(End.class);
			if (getIntersectingObjects(End.class).get(0).isActivated()) {
				end-- ;														
				player_points -= 50;
			}
			player_points += 50;											//victory...main_frog landed on End goal 		
			changeScore = true;
			w=800;
			getIntersectingObjects(End.class).get(0).setEnd();
			end++;
			
			setX(300);
			setY(679.8 + movement);
		}
		else if (getY() < 413){
			water_die = true;
			//setX(300);
			//setY(679.8+movement);
		}
	}		//END act method
	
	/**
	 * Method to get Stop
	 * @return the value of stop 
	 */
	public boolean getStop() {
		return end == 5;
	}
	
	/**
	 * Access to get points
	 * @return the point's value
	 */
	public int getPoints() {
		return player_points;
	}
	
	/**
	 * Method to change the score
	 * @return whether change score or not
	 */
	public boolean changeScore() {
		if (changeScore) {
			changeScore = false;
			return true;
		}
		return false;
	}
	
	

}
