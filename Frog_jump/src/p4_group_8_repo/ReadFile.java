package p4_group_8_repo;

import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class ReadFile {
	
	String data;
	String path;
	
	public ReadFile(String path) {
		this.path = path;
	}
	
  public void read_file() {
    try {
      File myObj = new File(path);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        data = myReader.nextLine();
        //System.out.println(data);

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
  
  public int number_content() {
	  int number = Integer.parseInt(data);  	//convert string to int
	  return number;
  }
}