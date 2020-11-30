package p4_group_8_repo;

//import game_animation.Digit;
import game_functions.Create_animations;
import game_functions.Level_control;
import game_functions.Refresh_game_page;
import game_functions.Update_HighScore_animation;
import game_highscore.Top_HighScore;
import game_highscore.HighScore_list;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import random.HelloWorld;



/**
 * Class of main (launch)
 * @author CHIN JUN YUAN
 */
public class Main extends Application{

	AnimationTimer timer;
	MyStage background;
	Frog_player animal; 							//main_frog
	int size_digit = 30;
	
	Scene scene_start;
	Scene scene_game;
	Scene scene_info;
	Top_HighScore player_highscore;
	Update_HighScore_animation update_highscore_board;
	Level_control level_control;
	Refresh_game_page refactor_game = new Refresh_game_page();
	
	HighScore_list bobo;
	int flag = 0;
	
	Create_animations animation;

	public static void main(String[] args) {
		try {
		launch(args);
		System.out.println("Game closed ");
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
		
		// Set up for high score board and high score list 
		player_highscore = new Top_HighScore();
		player_highscore.setScore(0);
		HighScore_list bobo = new HighScore_list();
		bobo.setScore(1, 300);
		bobo.setScore(2, 200);
		bobo.setScore(3, 100);
		
		//Game Scene
	    background = new MyStage();
	    scene_game  = new Scene(background, 600, 800);  
	    create_frogger();										// main_frog created
	    
	    animation = new Create_animations(background);			// all animations created
	    level_control = new Level_control(background);
	    
	    update_highscore_board = new Update_HighScore_animation(player_highscore.getScore(), player_highscore, background);
	    create_frogger();
	    background.start();	
	    start();
	    
	    Menu_info_page menu_info_page = new Menu_info_page(primaryStage, scene_info, scene_start, scene_game);

	    primaryStage.setScene(menu_info_page.get_start_scene());
		primaryStage.show();
		System.out.println("Game Start");
		HelloWorld qiqi = new HelloWorld();				// use to test end of code
		
}
	
	/**
	 * Create Main Frog Character
	 */
	public void create_frogger() {
	    String main_frog = "/graphic_animation/froggerUp.png";
		animal = new Frog_player(main_frog);
		background.add(animal);
}
	
	/**
	 * Method to create animation timer
	 */
	public void createTimer() {
		
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	if (animal.changeScore()) {
            		
            		// Update High Score Board
            		if(animal.getPoints() > player_highscore.getScore()) {
            			player_highscore.setScore(animal.getPoints());
            			update_highscore_board.update_highest(animal.getPoints());
            		}
            		animation.set_curr_high(player_highscore.getScore());
            		refactor_game.set_number(background, animal.getPoints());
            		//set_number(animal.getPoints());
            		
            	}
            	
            	// Change Level
            	if (animal.change_level()) {
            		level_control.set_level((animal.getGoal() + 1));
            		refactor_game.update_level(background, animal.getGoal() + 1);
            	}
            	
            	// Finish Game
            	if (animal.getStop()) {										
            		System.out.println("*** STOP ***");
            		background.stopMusic();
            		stop();
            		background.stop();
            		Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("*-*-* YOU WIN *-*-*");
            		alert.setHeaderText("Your High Score: "+animal.getPoints()+"!");
            		alert.setContentText("Highest Possible Score: 1700");
            		alert.show();
            	}
            }
        };
    }
	
	/**
	 * Method to start the game
	 */
	public void start() {
		background.playMusic();
    	createTimer();
        timer.start();
    }

	/**
	 * Method to stop the game
	 */
    public void stop() {
        timer.stop();
    }
    
    /*
    
     * Method to update score board
     * @param current_points of the player
     
    public void set_number(int current_points) {
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
    }*/
    
}

//////////////////////////////////////THE END/////////////////////////////////////////////////////////////
