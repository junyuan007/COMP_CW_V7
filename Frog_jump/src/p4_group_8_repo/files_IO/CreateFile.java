package p4_group_8_repo.files_IO;


import java.io.File;  
import java.io.IOException;  

/**
 * Class to Create Files
 * @author Jun Yuan
 *
 */
public class CreateFile {
	
	private String file_path;
	
	/**
	 * Construct an instance of CreateFile
	 * @param path of the file
	 */
	public CreateFile(String path) {
		this.file_path = path;
	}
	
	/**
	 * Check status of desired file
	 */
	public void check_file() {
	    try {
	      //File myObj = new File("../Frog_Jump/Src/Files/test.txt");
	      File myObj = new File(file_path);
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } 
	      else {
	        //System.out.println("File already exists.");
	      }
	    } 
	    catch (IOException e) {
	      System.out.println("An error occurred in Create File");
	      e.printStackTrace();
	    }
	  }

}
