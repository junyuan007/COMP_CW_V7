package p4_group_8_repo;


import info_page.Back_menu_butt;
import info_page.Info_background;
import info_page.Info_text;
import javafx.animation.AnimationTimer;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import start_page.Enter_game_butt;
import start_page.Info_butt;
import start_page.LR_frog;
import start_page.Start_background;
import start_page.RL_frog;
import start_page.WASD_butt;

/**
 * Class to create menu scene & info scene
 * @author Jun Yuan
 *
 */
public class Menu_info_page extends Actor{

	Scene temp_scene;
	private AnimationTimer timer;
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * construct an instance of Menu_info_page
	 * @param primaryStage is a type of stage is where all the visual parts of the JavaFX application are displayed
	 * @param scene_info is the info scene
	 * @param scene_start is the start scene
	 * @param scene_game is the game scene
	 */
	public Menu_info_page(Stage primaryStage, Scene scene_info, Scene scene_start, Scene scene_game) {
		MyStage start_stage = new MyStage();
	    StackPane info_stage = new StackPane();
	    
	    //StackPane xxx = new StackPane();
	    //ObservableList qqq = xxx.getChildren();
	    //scene_start  = new Scene(xxx, 600, 800);
	    
	    ObservableList start_list = start_stage.getChildren();
	    ObservableList info_list = info_stage.getChildren();
	    scene_info  = new Scene(info_stage, 600, 800);
	    scene_start  = new Scene(start_stage, 600, 800);
	   
	    //start page object
	    Start_background menu_background = new Start_background();
	    Enter_game_butt button_start = new Enter_game_butt(primaryStage, scene_game);
	    Info_butt button_info = new Info_butt(primaryStage, scene_info);
	    WASD_butt wasd = new WASD_butt();
	    RL_frog frog_RL = new RL_frog(70, 230, 422, 0);
	    LR_frog frog_LR = new LR_frog(70, 325, 422, 0);

	    //info page object
	    Info_background info_background = new Info_background();
	    Back_menu_butt InfoToMenu = new Back_menu_butt(primaryStage, scene_start);
	    Info_text information = new Info_text();
	    
	    start_list.addAll(menu_background.menu_page(), button_start.getButton(), button_info.getButton(), wasd.getButton(), frog_RL, frog_LR);
	    info_list.addAll(info_background.menu_page(), information.get_text(), InfoToMenu.getButton());
	    
	    //qqq.addAll(menu_background.menu_page(), button_start.getButton(), button_info.getButton(), wasd.getButton());
	    //qqq.addAll(info_background.menu_page(), information.get_text(), InfoToMenu.getButton());

	    start_stage.start();
	    temp_scene = scene_start;
	}
	
	/**
	 * Method to return start_scene to be set
	 * @return start scene
	 */
	public Scene get_start_scene() {
		return temp_scene;
	}
	


}
