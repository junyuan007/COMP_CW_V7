package p4_group_8_repo;


import java.io.FileWriter;  
import java.io.IOException; 

public class WriteFile {
	
		String path;
		String message;
		
	  public WriteFile(String path) {
		  this.path = path;
	  }
	  
	  public void sending(int number) {
		  this.message = String.valueOf(number);  //convert int to string
	  }
	  

	  public void write_file(){
	    try {
	      FileWriter myWriter = new FileWriter(path);
	      //myWriter.write("Frogger Game by CHIN JUN YUAN");
	      myWriter.write(message);
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	      System.out.println(message);
	      
	    }
	    catch (IOException e) {
	      System.out.println("An error occurred in Write File");
	      e.printStackTrace();
	    }
	  }
	}