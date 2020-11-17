package Test_frog;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import game_highscore.Top_HighScore;
import game_highscore.HighScore_list;
import javafx.application.Application;
import javafx.stage.Stage;

class test_1 extends Application{

	Top_HighScore top_score = new Top_HighScore();
	HighScore_list bobo = new HighScore_list();
	
	@Test
	public void HighScore_1(){
		int x = 0;
		assertTrue(x <= top_score.getScore());
	}
	
	@Test
	public void HighScore_2(){
		File file = new File("../Frog_Jump/Src/Files/highest_display.txt");
		assertFalse(file.length() == 0);
	}

	//////////////////////////////////////////
	
	@Test
	public void HighList_1() {
		assertTrue(bobo.getScore(2) > bobo.getScore(3));
	}
	
	@Test
	public void HighList_2() {
		assertTrue(bobo.getScore(1) > bobo.getScore(2));
	}
	
	@Test
	public void HighList_3() {
		File file = new File("../Frog_Jump/Src/Files/highest_1.txt");
		assertFalse(file.length() == 0);
	}
	
	@Test
	public void HighList_4() {
		File file = new File("../Frog_Jump/Src/Files/highest_2.txt");
		assertFalse(file.length() == 0);
	}
	
	@Test
	public void HighList_5() {
		File file = new File("../Frog_Jump/Src/Files/highest_3.txt");
		assertFalse(file.length() == 0);
	}
	

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
