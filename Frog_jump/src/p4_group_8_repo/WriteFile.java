package p4_group_8_repo;


import java.io.FileWriter;  
import java.io.IOException; 

public class WriteFile {
	
	  public WriteFile() {
		  
	  }
	
	  public void write_file(){
	    try {
	      FileWriter myWriter = new FileWriter("../Frog_Jump/Src/Files/test.txt");
	      myWriter.write("Frogger Game by CHIN JUN YUAN");
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    }
	    catch (IOException e) {
	      System.out.println("An error occurred in Write File");
	      e.printStackTrace();
	    }
	  }
	}