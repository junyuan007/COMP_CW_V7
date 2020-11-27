package files_IO;

import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

/**
 * Class of Read Files
 * @author Jun Yuan
 *
 */
public class ReadFile {
	
	private String data;
	private String file_path;
	
	/**
	 * Construct an instance of ReadFile
	 * @param path of the file
	 */
	public ReadFile(String path) {
		this.file_path = path;
	}
	
	/**
	 * Read the file
	 */
	public void read_file() {
		try {
			File myObj = new File(file_path);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {

				data = myReader.nextLine();

			}
			myReader.close();
		} catch (FileNotFoundException e) {
     	System.out.println("An error occurred.");
     	e.printStackTrace();
		}
  }
  
	/**
	 * Method to get file content in String
	 * @return content of file in string format
	 */
	public String text_content() {
	  return data;
	}
  
	/**
	 * Method to get file content in Integer
	 * @return content of file in integer format
	 */
	public int number_content() {
	  int number = Integer.parseInt(data);  	//convert string to int
	  return number;
	}
}