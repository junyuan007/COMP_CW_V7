package p4_group_8_repo.files_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Class to read files using BufferedReader 
 * @author Jun Yuan
 *
 */
public class BuffRead {
	
	private String file_path;
	ArrayList<String>list =new ArrayList<String> ();
	
	/**
	 * Construct an instance of BuffRead
	 * @param path of the file
	 */
	public BuffRead(String path) {
		this.file_path = path;
	}
	
	/**
	 * Method to read and return the text 
	 * @return the text in array list format
	 */
	public ArrayList<String> buffer_reader() {
		try {
		    BufferedReader br = new BufferedReader(new FileReader(file_path));
		    list = (ArrayList<String>) br.lines().collect(Collectors.toList());
		    //list.forEach(System.out::println);
		    br.close(); 
		} 
		catch (IOException ex) {
		    ex.printStackTrace();
		}
		
		return list;
	}

}
