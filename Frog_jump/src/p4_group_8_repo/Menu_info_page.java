package p4_group_8_repo;

import info_page.Back_menu_butt;
import info_page.Info_background;
import info_page.Info_text;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import start_page.Enter_game_butt;
import start_page.Info_butt;
import start_page.Start_background;

/**
 * Class to create menu scene & info scene
 * @author Jun Yuan
 *
 */
public class Menu_info_page extends Actor{

	Scene temp_scene;
	
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
		StackPane start_stage = new StackPane(); 
	    StackPane info_stage = new StackPane();

	    ObservableList start_list = start_stage.getChildren();
	    ObservableList info_list = info_stage.getChildren();
	    scene_info  = new Scene(info_stage, 600, 800);
	    scene_start  = new Scene(start_stage, 600, 800);
	    
	    //start page object
	    Start_background menu_background = new Start_background();
	    Enter_game_butt button_start = new Enter_game_butt(primaryStage, scene_game);
	    Info_butt button_info = new Info_butt(primaryStage, scene_info);

	    //info page object
	    Info_background info_background = new Info_background();
	    Back_menu_butt InfoToMenu = new Back_menu_butt(primaryStage, scene_start);
	    Info_text information = new Info_text();
	    start_list.addAll(menu_background.menu_page(), button_start.getButton(), button_info.getButton());
	    //info_list.addAll(info_background.menu_page(), information.get_text(), InfoToMenu.getButton());
	    info_list.addAll(info_background.menu_page(), information.get_text(), InfoToMenu.getButton());

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
