package files_IO;


import java.io.FileWriter;  
import java.io.IOException; 

/**
 * Class to Write Files
 * @author Jun Yuan
 *
 */
public class WriteFile {
	
		String path;
		String message;
		
		/**
		 * Construct an instance of WriteFile
		 * @param path of the file
		 */
	  public WriteFile(String path) {
		  this.path = path;
	  }
	  
	  /**
	   * Method to set String to Integer
	   * @param number
	   */
	  public void sending(int number) {
		  this.message = String.valueOf(number);  //convert integer to string
	  }
	  

	  /**
	   * Write Files
	   */
	  public void write_file(){
	    try {
	      FileWriter myWriter = new FileWriter(path);
	      myWriter.write(message);
	      myWriter.close();
	      //System.out.println("Successfully wrote to the file---------- Message = " + message);
	      
	    }
	    catch (IOException e) {
	      System.out.println("An error occurred in Write File");
	      e.printStackTrace();
	    }
	  }
	}