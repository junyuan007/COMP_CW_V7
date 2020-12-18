package p4_group_8_repo.main_view;


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import p4_group_8_repo.Game_functions.Create_animations;
import p4_group_8_repo.Game_functions.Create_frogger;
import p4_group_8_repo.Game_functions.Level_control;
import p4_group_8_repo.Game_functions.Refresh_game_page;
import p4_group_8_repo.Game_functions.Update_HighScore_animation;
import p4_group_8_repo.Game_highscore.HighScore_list;
import p4_group_8_repo.Game_highscore.Top_HighScore;
import p4_group_8_repo.Game_scene.MyStage;
import p4_group_8_repo.Start_control.Menu_info_page;



/**
 * Class of Main  (Initiation)
 * @author CHIN JUN YUAN
 */
public class Main extends Application{
	
	// Animation
	public AnimationTimer timer;
	public MyStage background;
	public Create_frogger frogger;
	// Scene
	Scene scene_start;
	Scene scene_game;
	Scene scene_info;
	// High Score
	public Top_HighScore player_highscore;
	public Update_HighScore_animation update_highscore_board;
	HighScore_list highscore_list;
	// 
	public Create_animations animation;
	public Level_control level_control;
	public Refresh_game_page refactor_game = new Refresh_game_page();
	
	public static void main(String[] args) {
		try {
		launch(args);
		System.out.println("Game is closed ");
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
		
		// Game Scene
	    background = new MyStage();
	    scene_game  = new Scene(background, 600, 800);  
	    
	    // Animation
	    animation = new Create_animations(background);
	    frogger = new Create_frogger(background);
	    
	    // High Score System
	 	player_highscore = new Top_HighScore();
	 	HighScore_list bobo = new HighScore_list();
	 	
	 	// RESET
	 	player_highscore.setScore(0);
	 	bobo.setScore(1, 300);
	 	bobo.setScore(2, 200);
	 	bobo.setScore(3, 100);
	 	
	    level_control = new Level_control(background);
	    update_highscore_board = new Update_HighScore_animation(player_highscore.getScore(), player_highscore, background);
	    
	    // Run Time Initiation
	    background.start();	
	    start();
	    
	    // Start Screen & Info Screen
	    Menu_info_page menu_info_page = new Menu_info_page(primaryStage, scene_info, scene_start, scene_game);
	    
	    // Stage Settings
	    primaryStage.setTitle("Frogger by Jun Yuan");
	    primaryStage.setScene(menu_info_page.get_start_scene());
		primaryStage.show();
		
		// Check for Error
		System.out.println("Game Start");
}
	
	
	/**
	 * Method to start the game
	 */
	public void start() {
		background.playMusic();
    	refactor_game.createTimer(this);
        timer.start();
    }

	/**
	 * Method to stop the game
	 */
    public void stop() {
        timer.stop();
    }
    
    
}
