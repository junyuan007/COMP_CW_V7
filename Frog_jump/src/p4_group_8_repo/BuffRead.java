package p4_group_8_repo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BuffRead {
	
	String path;
	ArrayList<String>list =new ArrayList<String> ();
	
	public BuffRead(String path) {
		this.path = path;
	}
	
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
