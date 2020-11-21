package Test_frog;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game_animation.Digit;
import game_functions.Create_animations;
import game_functions.Update_HighScore_animation;
import game_highscore.Top_HighScore;
import game_highscore.HighScore_list;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import p4_group_8_repo.Frog_player;
import p4_group_8_repo.Menu_info_page;
import p4_group_8_repo.MyStage;
import random.HelloWorld;

class test_2 {
	
	AnimationTimer timer;
	MyStage background;
	Frog_player animal; 							//main_frog
	int size_digit = 30;
	
	Scene scene_start;
	Scene scene_game;
	Scene scene_info;
	Top_HighScore top_score;
	Update_HighScore_animation popo;

	public class Main extends Application{
		//public class Main extends Application implements EventHandler<ActionEvent>{
			
			public void main(String[] args) {
				try {
				launch(args);
				System.out.println("Launch ");
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				finally {
					System.exit(0);
				}
			}
			
			/**
			 * Start method is to initiate the JavaFx runtime
			 * @param primaryStage is a type of stage is where all the visual parts of the JavaFX application are displayed
			 * @throws IllegalStateException if cause is nonexistent or unknown
			 */
			@Override
			public void start(Stage primaryStage) throws IllegalStateException{
				primaryStage.setTitle("Frogger by Jun Yuan");
				
				top_score = new Top_HighScore();
				//top_score.setScore(999);
				
				//Game Scene
			    background = new MyStage();
			    scene_game  = new Scene(background, 600, 800);  
			    create_frogger();										// main_frog created
			    Create_animations animation = new Create_animations(background);		// all animations created
			    
			    popo = new Update_HighScore_animation(top_score.getScore(), top_score, background);
			    create_frogger();
			    background.start();	
			    start(); 												//create timer

			    Menu_info_page well = new Menu_info_page(primaryStage, scene_info, scene_start, scene_game);

			    primaryStage.setScene(well.get_start_scene());
				primaryStage.show();
				System.out.println("Game Start");
				
				HelloWorld qiqi = new HelloWorld();
		}
			public void create_frogger() {
				
			    String main_frog = "/graphic_animation/froggerUp.png";
				animal = new Frog_player(main_frog);
				background.add(animal);
		}
			public void start() {
				background.playMusic();
		    	createTimer();
		        timer.start();
		    }
			public void createTimer() {
				HighScore_list bobo = new HighScore_list();
				bobo.setScore(1, 999);
				bobo.setScore(2, 888);
				bobo.setScore(3, 777);
				//bobo.setScore(1, 0);
				//bobo.setScore(2, 0);
				//bobo.setScore(3, 0);
		        timer = new AnimationTimer() {
		            @Override
		            public void handle(long now) {
		            	if (animal.changeScore()) {
		            		set_number(animal.getPoints());
		            		if(animal.getPoints() > top_score.getScore()) {
		            			top_score.setScore(animal.getPoints());
		            			popo.update_highest(animal.getPoints());
		            		}
		            		if(animal.getPoints() > bobo.getScore(3)) {
		            			if(animal.getPoints() > bobo.getScore(2)) {
		            				if(animal.getPoints() > bobo.getScore(1)) {
		            					bobo.setScore(1, animal.getPoints());
		            				}		//end 1
		            				bobo.setScore(2, animal.getPoints());
		            			}			// end 2
		            			bobo.setScore(3, animal.getPoints());
		            		}				//end 3

		            	}
		            	
		            	if (animal.getStop()) {											//Complete GAME
		            		System.out.println("*** STOP ***");
		            		background.stopMusic();
		            		stop();
		            		background.stop();
		            		Alert alert = new Alert(AlertType.INFORMATION);
		            		alert.setTitle("***** YOU WIN *****");
		            		alert.setHeaderText("Your High Score: "+animal.getPoints()+"!");
		            		alert.setContentText("Highest Possible Score: 800");
		            		alert.show();
		            	}
		            }
		        };
		    }
			
			public void set_number(int current_points) {
		    	int shift = 0;

		    	while (current_points > 0) {
		    		  int temp = current_points / 10;
		    		  int display = current_points - (temp * 10);			// k is number setter
		    		  current_points = temp;
		    		  int x_coordinate = 565 - shift;
		    		  background.add(new Digit(display, x_coordinate, 35));		//overlap initial digit
		    		  shift += 30;
		    		}
		    }

	
	}		//END application 

	
	@Test
	public void test_1() {
		assertEquals(10, 10);
	}
	
	@Test
	public void test_2() {
		assertNull(background);
	}
	
	@Test
	public void test_3() {
		assertNull(scene_start);
	}
	
	@Test
	public void test_4() {
		assertNull(scene_info);
	}
	
	@Test
	public void test_5() {
		assertNull(scene_game);
	}
	
	@Test
	public void test_6() {
		assertNull(timer);
	}
	

	
}
	
	
