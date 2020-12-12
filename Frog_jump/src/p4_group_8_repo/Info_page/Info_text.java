package p4_group_8_repo.Info_page;

import java.util.ArrayList;
import java.util.Iterator;

import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import p4_group_8_repo.files_IO.BuffRead;

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
		
		String path = "./Src/Files/frogger_info.txt";
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
	    txting.setFont(type);
	    txting.setWrapText(true);
	    txting.setEditable(false);
	    txting.setTranslateY(75);
	    txting.getScrollTop();

	}
	
	/**
	 * Get the text area
	 * @return the text area
	 */
	public TextArea get_text() {
		return txting;
	}

}
