package p4_group_8_repo;

import java.util.ArrayList;
import java.util.Iterator;
import All_animation.Digit;
import All_animation.Menu_page;
import All_button.Back_menu_butt;
import All_button.Enter_game_butt;
import All_button.Info_butt;
import All_button.Pause_butt;
import All_button.Resume_butt;
import Files_IO.CreateFile;
import Files_IO.Edit_topScore;
import Game_functions.Create_animations;
import Game_functions.Update_HighScore;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import random.HelloWorld;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;



/**
 * Class of main (launch)
 * @author CHIN JUN YUAN
 */
public class Main extends Application{
//public class Main extends Application implements EventHandler<ActionEvent>{
	AnimationTimer timer;
	MyStage background;
	Frog_player animal; 							//main_frog
	int size_digit = 30;
	
	Scene scene_start;
	Scene scene_game;
	Scene scene_info;
	Edit_topScore top_score;
	Update_HighScore popo;

	public static void main(String[] args) {
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
		
		top_score = new Edit_topScore();
		//top_score.setScore(999);
		
		//Game Scene
	    background = new MyStage();
	    scene_game  = new Scene(background, 600, 800);  
	    create_frogger();										// main_frog created
	    Create_animations animation = new Create_animations(background);		// all animations created
	    
	    popo = new Update_HighScore(top_score.getScore(), top_score, background);
	    create_frogger();
	    background.start();	
	    start(); 												//create timer

	    info_menu_page(primaryStage);

		primaryStage.setScene(scene_start);
		primaryStage.show();
		System.out.println("Game Start");
		
		HelloWorld qiqi = new HelloWorld();

}

	private void info_menu_page(Stage primaryStage) {
		StackPane start_stage = new StackPane(); 
	    StackPane info_stage = new StackPane();

	    ObservableList start_list = start_stage.getChildren();
	    ObservableList info_list = info_stage.getChildren();
	    scene_info  = new Scene(info_stage, 600, 800);
	    scene_start  = new Scene(start_stage, 600, 800);
	    
	    //start page object
	    Menu_page menu_page = new Menu_page();
	    Enter_game_butt button_start = new Enter_game_butt(primaryStage, scene_game);
	    Info_butt button_info = new Info_butt(primaryStage, scene_info);

	    //info page object
	    Back_menu_butt back_1 = new Back_menu_butt(primaryStage, scene_start);
	    
	    String path = "../Frog_Jump/Src/Files/tutorial.txt";
	    BuffRead read = new BuffRead(path);
	    ArrayList<String> instructions = new ArrayList<String> ();
	    instructions = read.buffer_reader();
	    Iterator it = instructions.iterator(); 

	    TextArea txting = new TextArea ();
	    while(it.hasNext()) {
	    	String element = (String)it.next();
	        txting.appendText(element + "\n");
	        //System.out.println("elements are: " + element);
	    }
	    txting.setScrollTop(1);
	    txting.setStyle("-fx-font-size: 30");
	    txting.setFont(Font.font ("Verdana", 200));
	    txting.setWrapText(true);
	    txting.setEditable(false);
	    txting.setTranslateY(75);
	    txting.setPrefHeight(100);
	    txting.setPrefWidth(100);
	
	    start_list.addAll(menu_page.menu_page(), button_start.getButton(), button_info.getButton());
	    info_list.addAll(menu_page.menu_page(), txting, back_1.getButton());

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
            		set_number(animal.getPoints());
            		if(animal.getPoints() > top_score.getScore()) {
            			top_score.setScore(animal.getPoints());
            			popo.update_highest(animal.getPoints());
            		}

            	}
            	
            	if (animal.getStop()) {											//Complete GAME
            		System.out.println("*** STOP  ***");
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
    
    /**
     * Method to update score board
     * @param current_points
     */
    public void set_number(int current_points) {
    	int shift = 0;

    	while (current_points > 0) {
    		  int temp = current_points / 10;
    		  int display = current_points - (temp * 10);			// k is number setter
    		  current_points = temp;
    		  int x_coordinate = 565 - shift;
    		  background.add(new Digit(display, size_digit, x_coordinate, 35));		//overlap initial digit
    		  shift += 30;
    		}
    }
    
    
    
}

//////////////////////////////////////THE END/////////////////////////////////////////////////////////////

