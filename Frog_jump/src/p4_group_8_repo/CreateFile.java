package p4_group_8_repo;


import java.io.File;  
import java.io.IOException;  

public class CreateFile {
	
	public CreateFile() {
		
	}
	
	public void check_file() {
	    try {
	      File myObj = new File("../Frog_Jump/Src/Files/test.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } 
	      else {
	        System.out.println("File already exists.");
	      }
	    } 
	    catch (IOException e) {
	      System.out.println("An error occurred in Create File");
	      e.printStackTrace();
	    }
	  }

}
