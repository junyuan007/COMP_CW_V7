package Files_IO;


/**
 * Class to Edit High Score in txt Files
 * @author tigus
 *
 */
public class Edit_topScore {
	
	String path = "../Frog_Jump/Src/Files/highest.txt";
	
	/**
	 * Construct an Instance of Edit_topScore
	 */
	public Edit_topScore() {
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
