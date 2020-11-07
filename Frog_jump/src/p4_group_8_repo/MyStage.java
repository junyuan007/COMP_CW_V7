package p4_group_8_repo;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

/**
 * Class of MyStage
 * @author JunYuan
 * 
 */
public class MyStage extends World{
	MediaPlayer mediaPlayer;
	
	/**
	 * Empty body 
	 */
	@Override
	public void act(long now) {
		
	}
	
	/**
	 * Construct an instance of MyStage (empty body)
	 */
	public MyStage() {
		
//		mediaPlayer.play();
//		mediaPlayer.setOnEndOfMedia(new Runnable() {
//
//			@Override
//			public void run() {
//				mediaPlayer.seek(Duration.ZERO);
//				
//			}
//			
//		});
//		mediaPlayer.play();
	}
	
	/**
	 * Method to play music in loop
	 */
	public void playMusic() {
		String musicFile = "src/frogger_music/Frogger_theme_song.mp3";   
		Media sound = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	    mediaPlayer.play();
	}
	
	/**
	 * Method to stop background music 
	 */
	public void stopMusic() {
		mediaPlayer.stop();
	}

}
