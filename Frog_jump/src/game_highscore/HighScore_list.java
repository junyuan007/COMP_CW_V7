package game_highscore;

import files_IO.CreateFile;
import files_IO.ReadFile;
import files_IO.WriteFile;

public class HighScore_list {
	
	String path = "../Frog_Jump/Src/Files/highest_1.txt";
	int number;
	
	/**
	 * Construct an Instance of Edit_topScore
	 */
	public HighScore_list() {
		CreateFile file1 = new CreateFile("../Frog_Jump/Src/Files/highest_"+1+".txt");
		CreateFile file2 = new CreateFile("../Frog_Jump/Src/Files/highest_"+2+".txt");
		CreateFile file3 = new CreateFile("../Frog_Jump/Src/Files/highest_"+3+".txt");
		file1.check_file();
		file2.check_file();
		file3.check_file();
		
	}
	
	/**
	 * Write NEW high score in txt file
	 * @param number is the new high score
	 */
	public void setScore(int index, int value) {
		//this.number= index;
		WriteFile file = new WriteFile("../Frog_Jump/Src/Files/highest_"+index+".txt");
		file.sending(value);
		file.write_file();
	}
	
	/**
	 * Get CURRENT high score in txt file
	 * @return the value of high score in String
	 */
	public int getScore(int number) {
		this.number = number;
		ReadFile file = new ReadFile("../Frog_Jump/Src/Files/highest_"+this.number+".txt");
		file.read_file();
		return file.number_content();
	}

}
