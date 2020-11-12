package Files_IO;


import java.io.File;  
import java.io.IOException;  

public class CreateFile {
	
	String path;
	
	public CreateFile(String path) {
		this.path = path;
	}
	
	public void check_file() {
	    try {
	      //File myObj = new File("../Frog_Jump/Src/Files/test.txt");
	      File myObj = new File(path);
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
