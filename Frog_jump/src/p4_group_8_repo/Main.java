package p4_group_8_repo;

import java.io.File;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Class of main (launch)
 * @author CHIN JUN YUAN
 */
public class Main extends Application {
	AnimationTimer timer;
	MyStage background;
	Animal animal; //main_frog
	int size_digit = 30;

	public static void main(String[] args) {
		launch(args);
	}
	
	//***********123
	//IllegalStateException 
	/**
	 * start method to create the animations and initiate the JavaFx runtime
	 * @param primaryStage is a type of stage is where all the visual parts of the JavaFX application are displayed
	 * @throws IllegalStateException if cause is nonexistent or unknown
	 */
	@Override
	public void start(Stage primaryStage) throws IllegalStateException {
		
	    background = new MyStage();
	    //Create frame of game
	    Scene scene  = new Scene(background, 600, 800);
	    
	    //Background
	    //Shifted image link to BackgroundImage constructor
	    BackgroundImage frogger_wallpaper = new BackgroundImage();
	    background.add(frogger_wallpaper);
	    //BackgroundImage frogger_wallpaper = new BackgroundImage("file:src/p4_group_8_repo/iKogsKW.png");
		//BackgroundImage frogger_wallpaper = new BackgroundImage("file:src/p4_group_8_repo/Screen Shot 2017-05-29 at 10.02.14 PM.png");	//image source
		
		//top log
		String short_log = "file:src/p4_group_8_repo/log3.png";
		String long_log = "file:src/p4_group_8_repo/logs.png";
		background.add(new Log(short_log, 150, 0, 166, 0.75));	
		background.add(new Log(short_log, 150, 220, 166, 0.75));	
		background.add(new Log(short_log, 150, 440, 166, 0.75));	
		//mid log
		//negative for speed means opposite direction
		background.add(new Log(long_log, 300, 0, 276, -2));		
		background.add(new Log(long_log, 300, 400, 276, -2));	
		//bottom log
		background.add(new Log(short_log, 150, 50, 329, 0.75));	
		background.add(new Log(short_log, 150, 270, 329, 0.75));	
		background.add(new Log(short_log, 150, 490, 329, 0.75));	
		
		//bottom turtles
		background.add(new Turtle(500, 376, -1, 130, 130));
		background.add(new Turtle(300, 376, -1, 130, 130));
		background.add(new WetTurtle(700, 376, -1, 130, 130));
		
		//top turtles
		background.add(new WetTurtle(600, 217, -1, 130, 130));
		background.add(new WetTurtle(400, 217, -1, 130, 130));
		background.add(new WetTurtle(200, 217, -1, 130, 130));	
		
		/*
		// before alignment
		background.add(new End(13,96));
		background.add(new End(141,96));
		background.add(new End(269, 96));	
		background.add(new End(398, 96));
		background.add(new End(528, 96));*/
		
		//End goals
		background.add(new End(11,95));
		background.add(new End(139,95));
		background.add(new End(267, 95));	//removed adition operator
		background.add(new End(394, 95));
		background.add(new End(523, 95));
		/*
		//vehicle
		//CHANGE name of obstacle to vehicle
		//bottom truck
		String truck_short_right = "file:src/p4_group_8_repo/truck1"+"Right.png";
		String truck_long_right = "file:src/p4_group_8_repo/truck2"+"Right.png";
		background.add(new Obstacle(truck_short_right, 0, 649, 1, 120, 120));
		background.add(new Obstacle(truck_short_right, 300, 649, 1, 120, 120));
		background.add(new Obstacle(truck_short_right, 600, 649, 1, 120, 120));
		//top_truck
		background.add(new Obstacle(truck_long_right, 0, 540, 1, 200, 200));
		background.add(new Obstacle(truck_long_right, 500, 540, 1, 200, 200));
		
		//background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 720, 649, 1, 120, 120));
		
		String car_left = "file:src/p4_group_8_repo/car1Left.png";
		//bottom_car
		background.add(new Obstacle(car_left, 100, 597, -1, 50, 50));
		background.add(new Obstacle(car_left, 250, 597, -1, 50, 50));
		background.add(new Obstacle(car_left, 400, 597, -1, 50, 50));
		background.add(new Obstacle(car_left, 550, 597, -1, 50, 50));
		//top_car
		background.add(new Obstacle(car_left, 500, 490, -5, 50, 50));
		*/
		
		//main_frog
	    String main_frog = "file:src/p4_group_8_repo/froggerUp.png";
		animal = new Animal(main_frog);
		background.add(animal);
		
		//background.add(new Digit(0, 30, 360, 25));
		background.add(new Digit(0, size_digit, 565, 30));		//initial score_board
		
		
		background.start();
		primaryStage.setTitle("Frogger by Jun Yuan");
		primaryStage.setScene(scene);
		primaryStage.show();
		start(); 
	} 	// END start
	
	/**
	 * Method to create a timer
	 */
	public void createTimer() {
        timer = new AnimationTimer() {
        	
            @Override
            public void handle(long now) {
            	if (animal.changeScore()) {										//continue
            		set_number(animal.getPoints());
            	}
            	
            	if (animal.getStop()) {											//Victory 
            		System.out.print("STOPP:");
            		background.stopMusic();
            		stop();
            		background.stop();
            		Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("Victory !");
            		alert.setHeaderText("Your High Score: "+animal.getPoints()+"!");
            		alert.setContentText("Highest Possible Score: 800");
            		// set high score see whether beaten or not
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
     * @param number
     */
    public void set_number(int number) {
    	int shift = 0;
    	while (number > 0) {
    		  int temp = number / 10;
    		  int display = number - (temp * 10);			// k is number setter
    		  number = temp;
    		  
    	int x_coordinate = 565 - shift;
    	
    		//test print in console
    		System.out.println("n = "+ number);
    		System.out.println("k = "+ display);
    		System.out.println("d = "+ temp);
    		System.out.println();
    		  // create new Digit & overlap initial score board
    		  //background.add(new Digit(k, 30, x_coordinate, 25));
    		  background.add(new Digit(display, size_digit, x_coordinate, 30));
    		  shift+=30;
    		}
    }
}

//////////////////////////////////////THE END/////////////////////////////////////////////////////////////

//Obstacle obstacle = new Obstacle("file:src/p4_group_8_repo/truck1Right.png", 25, 25, 3);
//Obstacle obstacle1 = new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 100, 100,2 );
//Obstacle obstacle2 = new Obstacle("file:src/p4_group_8_repo/truck1Right.png",0,  150, 1);

//background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 0, 166, 0.75));

//background.add(new Log("file:src/p4_group_8_repo/logs.png", 300, 800, 276, -2));

//background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 570, 329, 0.75));

//background.add(new Log("file:src/p4_group_8_repo/log2.png", 200, 100, 1));
//background.add(new Log("file:src/p4_group_8_repo/log2.png", 0, 100, 1));
//background.add(new Log("file:src/p4_group_8_repo/log2.png", 100, 120, -1));
//background.add(new Log("file:src/p4_group_8_repo/log2.png", 200, 120, -1));
//background.add(new Log("file:src/p4_group_8_repo/log2.png", 100, 140, 1));
//background.add(new Log("file:src/p4_group_8_repo/log2.png", 200, 140, 1));
//background.add(new Log("file:src/p4_group_8_repo/log2.png", 100, 160, -1));
//background.add(new Log("file:src/p4_group_8_repo/log2.png", 300, 160, -1));
//background.add(new Log("file:src/p4_group_8_repo/log2.png", 100, 180, 1));
//background.add(new Log("file:src/p4_group_8_repo/log2.png", 200, 180, 1));
//background.add(new Log("file:src/p4_group_8_repo/log2.png", 100, 200, -1));
//background.add(new Log("file:src/p4_group_8_repo/log2.png", 200, 200, -1));
//background.add(new Log("file:src/p4_group_8_repo/log2.png", 100, 220, 1));
//background.add(new Log("file:src/p4_group_8_repo/log2.png", 200, 220, 1));
//background.add(new Log("file:src/p4_group_8_repo/log2.png", 400, 220, 1));

