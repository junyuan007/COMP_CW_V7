package p4_group_8_repo.Game_highscore;

import p4_group_8_repo.files_IO.CreateFile;
import p4_group_8_repo.files_IO.ReadFile;
import p4_group_8_repo.files_IO.WriteFile;

/**
 * Class of High Score List
 * @author Jun Yuan
 *
 */
public class HighScore_list {
	
	/**
	 * Construct an Instance of Edit_topScore
	 */
	public HighScore_list() {
		CreateFile file1 = new CreateFile("./Src/Files/highest_"+1+".txt");
		CreateFile file2 = new CreateFile("./Src/Files/highest_"+2+".txt");
		CreateFile file3 = new CreateFile("./Src/Files/highest_"+3+".txt");
		file1.check_file();
		file2.check_file();
		file3.check_file();
		
	}
	
	/**
	 * Write NEW high score in text file
	 * @param index is the ranking of high score
	 * @param value is the new high score
	 */
	public void setScore(int index, int value) {
		WriteFile file = new WriteFile("./Src/Files/highest_"+index+".txt");
		file.sending(value);
		file.write_file();
	}
	
	/**
	 * Get CURRENT high score in text file
	 * @param index is the ranking of high score
	 * @return the value of high score in String
	 */
	public int getScore(int index) {
		ReadFile file = new ReadFile("./Src/Files/highest_"+index+".txt");
		file.read_file();
		return file.number_content();
	}

}
