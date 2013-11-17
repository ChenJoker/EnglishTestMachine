import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class starting {

	private Scanner input;
	private List<String> engList;
	private List<String> chiList;
	
	/*
	 * open file to read
	 */
	public void openFile(){
		try{
			input = new Scanner(new File("Vocabulary\\eng.txt"));
		}catch(FileNotFoundException fnfe){
			JOptionPane.showMessageDialog(null, "No file here");
		}
	}
	
	/*
	 * close file
	 */
	public void closeFile(){
		if(input!=null)
			input.close();
	}
	
	/*
	 * reading vocabulary from file
	 */
	public void readFile(){
		engList = new ArrayList<String>();
		chiList = new ArrayList<String>();
		
		if(input!=null){
			try{
				while(input.hasNext()){
					engList.add(input.next());
					chiList.add(input.next());
				}
			}catch(NoSuchElementException nsee){
				System.err.println("File improperly formed.");
				input.close();
				System.exit(1);
			}catch(IllegalStateException ise){
				System.err.println("Error reading from file.");
				System.exit(1);
			}
			
			for(int i = 0 ; i <engList.size() ; i++){
				System.out.println(engList.get(i)+"\t"+chiList.get(i));
			}
		}
	}
}
