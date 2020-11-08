package p4_group_8_repo;

import java.io.File;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 * Class of main (launch)
 * @author CHIN JUN YUAN
 */
public class Main extends Application{
//public class Main extends Application implements EventHandler<ActionEvent>{
	AnimationTimer timer;
	MyStage background;
	Animal animal; 							//main_frog
	int size_digit = 30;
	
	Scene scene_start, scene_game;
	MyStage xxx;
	Button button_start;

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
		
		background = new MyStage();
		xxx = new MyStage();
		
		Image image = new Image("/graphic_animation/version_1.png");
		ImageView start_image = new ImageView(image);
		
		//Start Scene
		//Label label1= new Label("This is the Start scene");
	    //xxx.add(new Menu_page());
	    button_start = new Button("Click to START...");
	    button_start.setOnAction(e -> primaryStage.setScene(scene_game)); 
	    button_start.setTranslateY(100);
	    button_start.setStyle("-fx-font-size: 15pt;");
	    
	    StackPane stackPane = new StackPane(); 
	    ObservableList list = stackPane.getChildren();
	    list.addAll(start_image, button_start);
	    scene_start  = new Scene(stackPane, 600, 800);
	    
	    //Game Scene
	    scene_game  = new Scene(background, 600, 800);  
	    create_animations();
	    background.start();
	    start(); 
	    
		primaryStage.setScene(scene_start);
		primaryStage.show();
												//create timer
		
		System.out.println("Game Start ");
}
	
	/**
	 * Create all animations(object) and background
	 */
	public void create_animations() {
		
		//if(State == STATE.GAME) {
		//Background
	    //Shifted image link to BackgroundImage constructor
	    BackgroundImage frogger_wallpaper = new BackgroundImage();
	    background.add(frogger_wallpaper);
	    
	    //LOG
		//top
		String short_log = "/graphic_animation/log3.png";
		String long_log = "/graphic_animation/logs.png";
		background.add(new Log(short_log, 150, 0, 166, 0.75));	
		background.add(new Log(short_log, 150, 220, 166, 0.75));	
		background.add(new Log(short_log, 150, 440, 166, 0.75));	
		//mid
		background.add(new Log(long_log, 300, 0, 276, -2));		
		background.add(new Log(long_log, 300, 400, 276, -2));	
		//bottom
		background.add(new Log(short_log, 150, 50, 329, 0.75));	
		background.add(new Log(short_log, 150, 270, 329, 0.75));	
		background.add(new Log(short_log, 150, 490, 329, 0.75));	
		
		//TURTLE
		//top
		background.add(new WetTurtle(600, 217, -1, 130, 130));
		background.add(new WetTurtle(400, 217, -1, 130, 130));
		background.add(new WetTurtle(200, 217, -1, 130, 130));	
		//bottom
		background.add(new Turtle(500, 376, -1, 130, 130));
		background.add(new Turtle(300, 376, -1, 130, 130));
		background.add(new WetTurtle(700, 376, -1, 130, 130));
		
		//END goals
		background.add(new End(11,95));
		background.add(new End(139,95));
		background.add(new End(267, 95));	//removed addition operator
		background.add(new End(394, 95));
		background.add(new End(523, 95));
		/*
		//OBSTACLE
		//truck
		String truck_short_right = "/graphic_animation/truck1"+"Right.png";
		String truck_long_right = "/graphic_animation/truck2"+"Right.png";
		int short_truck_size = 120;
		int long_truck_size = 200;
		//top
		background.add(new Obstacle(truck_long_right, 0, 540, 1, long_truck_size, long_truck_size));
		background.add(new Obstacle(truck_long_right, 500, 540, 1, long_truck_size, long_truck_size));
		//bottom
		background.add(new Obstacle(truck_short_right, 0, 649, 1, short_truck_size, short_truck_size));
		background.add(new Obstacle(truck_short_right, 300, 649, 1, short_truck_size, short_truck_size));
		background.add(new Obstacle(truck_short_right, 600, 649, 1, short_truck_size, short_truck_size));
		
		//CAR
		String car_left = "/graphic_animation/car1"+"Left.png";
		int car_size = 50;
		//top
		background.add(new Obstacle(car_left, 500, 490, -5, car_size, car_size));
		//mid
		background.add(new Obstacle(car_left, 100, 597, -1.1, car_size, car_size));
		background.add(new Obstacle(car_left, 250, 597, -1.1, car_size, car_size));
		background.add(new Obstacle(car_left, 400, 597, -1.1, car_size, car_size));
		background.add(new Obstacle(car_left, 550, 597, -1.1, car_size, car_size));
		//bottom (new)
		background.add(new Obstacle(car_left, 175, 694, -0.60, car_size, car_size));
		background.add(new Obstacle(car_left, 475, 694, -0.60, car_size, car_size));
		*/
		//main_frog
	    //String main_frog = "file:src/p4_group_8_repo/froggerUp.png";
	    String main_frog = "/graphic_animation/froggerUp.png";
		animal = new Animal(main_frog);
		background.add(animal);
		
		//background.add(new Digit(0, 30, 360, 25));
		background.add(new Digit(0, size_digit, 565, 30));		//initial score_board

		System.out.println("Animations created");
}
	
	
	/**
	 * Method to create a timer
	 */
	public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	//System.out.println("xxx");
            	if (animal.changeScore()) {										//continue
            		set_number(animal.getPoints());
            	}
            	
            	if (animal.getStop()) {											//Victory 
            		System.out.print("*** STOP ! ***");
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
    		//System.out.println("n = "+ number);
    		//System.out.println("k = "+ display);
    		//System.out.println("d = "+ temp);
    		//System.out.println();

    		  background.add(new Digit(display, size_digit, x_coordinate, 30));		//overlap initial digit
    		  shift+=30;
    		}
    }
}

//////////////////////////////////////THE END/////////////////////////////////////////////////////////////

