package game_highscore;

import files_IO.CreateFile;
import files_IO.ReadFile;
import files_IO.WriteFile;

/**
 * Class of High Score
 * @author Jun Yuan
 *
 */
public class Top_HighScore {
	
	private String path = "../Frog_Jump/Src/Files/highest_display.txt";
	
	/**
	 * Construct an Instance of Edit_topScore
	 */
	public Top_HighScore() {
		CreateFile file = new CreateFile(path);
		file.check_file();
	}
	
	/**
	 * Write NEW high score in text file
	 * @param new_high_score is the current new high score
	 */
	public void setScore(int new_high_score) {
		WriteFile file = new WriteFile(path);
		file.sending(new_high_score);
		file.write_file();
	}
	
	/**
	 * Get CURRENT high score in text file
	 * @return the value of high score in String
	 */
	public int getScore() {
		ReadFile file = new ReadFile(path);
		file.read_file();
		return file.number_content();
	}
	
}
