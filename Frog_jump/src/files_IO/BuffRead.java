package files_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Class to read files using BufferedReader 
 * @author tigus
 *
 */
public class BuffRead {
	
	String path;
	ArrayList<String>list =new ArrayList<String> ();
	
	/**
	 * Construct an instance of BuffRead
	 * @param path of the file
	 */
	public BuffRead(String path) {
		this.path = path;
	}
	
	/**
	 * Method to read and return the text 
	 * @return the text in array list format
	 */
	public ArrayList<String> buffer_reader() {
		try {
		    BufferedReader br = new BufferedReader(new FileReader(path));
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
