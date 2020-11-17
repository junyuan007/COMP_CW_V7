package game_highscore;

import files_IO.CreateFile;
import files_IO.ReadFile;
import files_IO.WriteFile;

/**
 * Class to Edit High Score in txt Files
 * @author tigus
 *
 */
public class Top_HighScore {
	
	String path = "../Frog_Jump/Src/Files/highest_display.txt";
	
	/**
	 * Construct an Instance of Edit_topScore
	 */
	public Top_HighScore() {
		CreateFile file = new CreateFile(path);
		file.check_file();
		//System.out.println("I am here");
	}
	
	/**
	 * Write NEW high score in txt file
	 * @param number is the new high score
	 */
	public void setScore(int number) {
		WriteFile file = new WriteFile(path);
		file.sending(number);
		file.write_file();
	}
	
	/**
	 * Get CURRENT high score in txt file
	 * @return the value of high score in String
	 */
	public int getScore() {
		ReadFile file = new ReadFile(path);
		file.read_file();
		return file.number_content();
	}

}
