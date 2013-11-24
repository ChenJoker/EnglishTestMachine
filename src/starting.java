import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class starting {

	private BufferedReader input;
	private List<String> engList;
	private List<String> chiList;
	private String temp;
	private String[] separate;
	
	/*
	 * open file to read
	 */
	public void openFile(){
		try{
			input = new BufferedReader(new InputStreamReader(new FileInputStream("Vocabulary\\eng.txt")));
		}catch(FileNotFoundException fnfe){
			JOptionPane.showMessageDialog(null, "No file here");
		}
	}
	
	/*
	 * close file
	 */
	public void closeFile() throws IOException{
		if(input!=null)
			input.close();
	}
	
	/*
	 * reading vocabulary from file
	 */
	public void readFile() throws IOException{
		engList = new ArrayList<String>();
		chiList = new ArrayList<String>();
		
		if(input!=null){
			try{
				//split string into english and chinese
				while((temp = input.readLine()) != null){
					separate = temp.split("\\t");
					engList.add(separate[0]);
					chiList.add(separate[separate.length-1]);
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
