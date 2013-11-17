import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class starting {

	private String file = "eng.txt";
	private String direction = "Vocabulary";
	public void filecheck(){
		File f = new File(direction , file);
		if(f.exists()){
			
		}
		else{
			JOptionPane.showMessageDialog(null, "No vocabulary");
		}
	}
}
