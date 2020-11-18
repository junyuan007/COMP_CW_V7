package info_page;

import java.util.ArrayList;
import java.util.Iterator;

import files_IO.BuffRead;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;

/**
 * Class to create text area for Info Page
 * @author Jun yuan
 *
 */
public class Info_text {
	
	TextArea txting = new TextArea ();
	
	/**
	 * Construct an instance of Info_text
	 */
	public Info_text(){
		
		String path = "../Frog_Jump/Src/Files/tutorial.txt";
	    BuffRead read = new BuffRead(path);
	    ArrayList<String> instructions = new ArrayList<String> ();
	    instructions = read.buffer_reader();
	    Iterator it = instructions.iterator(); 
	    
	    while(it.hasNext()) {
	    	String element = (String)it.next();
	        txting.appendText(element + "\n");
	        //System.out.println("elements are: " + element);
	    }
	    design();
	}
	
	/**
	 * Method to design text area
	 */
	public void design() {
		
		Font type = Font.font ("Consolas", 20);
		double xxx = txting.getScrollTop();
	    txting.setScrollTop(xxx);
	    txting.setFont(type);
	    txting.setWrapText(true);
	    txting.setEditable(false);
	    txting.setTranslateY(75);

	}
	
	/**
	 * Get the text area
	 * @return the text area
	 */
	public TextArea get_text() {
		return txting;
	}

}