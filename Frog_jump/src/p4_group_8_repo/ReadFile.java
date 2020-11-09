package p4_group_8_repo;

import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class ReadFile {
	
	String data;
	
	public ReadFile() {
		
	}
	
  public void read_file() {
    try {
      File myObj = new File("../Frog_Jump/Src/Files/tutorial.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        data = myReader.nextLine();
        //System.out.println(data);
        //text_content(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  
  public String text_content() {
	  return data;
  }
}