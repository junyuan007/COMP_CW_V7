package p4_group_8_repo;

public class TopScore {
	
	String path = "../Frog_Jump/Src/Files/highest.txt";
	
	public TopScore() {
		CreateFile file = new CreateFile(path);
		file.check_file();
		//System.out.println("I am here");
	}
	
	public void setScore(int number) {
		WriteFile file = new WriteFile(path);
		file.sending(number);
		file.write_file();
	}
	
	public int getScore() {
		ReadFile file = new ReadFile(path);
		file.read_file();
		return file.number_content();
	}

}
