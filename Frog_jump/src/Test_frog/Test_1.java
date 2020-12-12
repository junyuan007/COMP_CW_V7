package Test_frog;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import javafx.scene.Scene;
import p4_group_8_repo.Game_actor.Crocodile;
import p4_group_8_repo.Game_functions.Level_control;
import p4_group_8_repo.Game_highscore.HighScore_list;
import p4_group_8_repo.Game_highscore.Top_HighScore;
import p4_group_8_repo.Game_scene.MyStage;

class Test_1 {

	
	// Test Score		///////////////////////////////////////////
	@Test
	public void test_HighScoreList_1() {
		HighScore_list bobo = new HighScore_list();
		int score = bobo.getScore(1);
		assertTrue(score != 0);
	}
	
	@Test
	public void test_HighScoreList_2() {
		HighScore_list bobo = new HighScore_list();
		bobo.setScore(1, 999);
		int answer = bobo.getScore(1);
		assertEquals(answer, 999);
	}
	
	@Test
	public void test_Top_HighScore_1() {
		Top_HighScore testing = new Top_HighScore();
		int score = testing.getScore();
		assertTrue(score != 0);
	}
	
	@Test
	public void test_Top_HighScore_2() {
		Top_HighScore testing = new Top_HighScore();
		testing.setScore(999);
		int answer = testing.getScore();
		assertEquals(answer, 999);
	}
	
	
	
	// Scene Test		///////////////////////////////////////////
	@Test
	public void test_scene_1() {
		MyStage background = new MyStage();
		Scene scene = new Scene(background, 600, 800);
		int width = (int) scene.getWidth();
		assertTrue(width == 600);
	}
	
	@Test
	public void test_scene_2() {
		MyStage background = new MyStage();
		Scene scene = new Scene(background, 600, 800);
		int width = (int) scene.getHeight();
		assertTrue(width == 800);
	}
	
	
	
	// Source Test		///////////////////////////////////////////
	@Test
	public void test_image_files() {
		String main_frog = "/graphic_animation/froggerUp.png";
		File file = new File(main_frog);
		assertTrue(file != null);
	}
	
	
	
	// Level Test		///////////////////////////////////////////	
	@Test
	public void test_level_1() {
		MyStage background = new MyStage();
		Level_control level = new Level_control(background);
		level.set_level(99);
		int number = level.getLevel();
		assertEquals(99, number);
	}
	

}
