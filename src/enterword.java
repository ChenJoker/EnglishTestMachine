import java.io.*;
import java.util.*;
import java.lang.SecurityException;

import javax.swing.JOptionPane;


public class enterword {

	private String file = "eng.txt";
	private String direction = "Vocabulary";
	private FileWriter output;
	private BufferedWriter bw;
	/*
	 * Check whether file exists or not.
	 * If not , create a new file.
	*/
	public void filecreate() throws IOException{
		File f = new File(direction , file);
		if(f.exists()){
			openFile();
			CreateWords();
			closeFile();
		}
		else{
			f.getParentFile().mkdir();
			try{
				f.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * open file , using FileWriter to escape cover old datas
	 */
	public void openFile(){
		try{
			output = new FileWriter("Vocabulary\\eng.txt" , true);
			bw = new BufferedWriter(output); //store datas temporarily , and save in memory 
		}catch(SecurityException se){
			System.err.println("You don't have write access to this file");	
			System.exit(1);
		}
		catch(FileNotFoundException fnfe){
			System.err.println("Error creating file");
			System.exit(1);
		}
		catch(IOException e){
			e.printStackTrace();
			System.err.println("Error creating file");
			System.exit(1);
		}
	}
	
	/*
	 * close file
	 */
	public void closeFile() throws IOException{
		if(output!=null)
			bw.close();
	}
	
	/*
	 * if file exists, then let user to enter his new vocabulary.
	 */
	public void CreateWords(){
		try{
			Scanner input = new Scanner(System.in);
			String english;
			String chinese;
			english = JOptionPane.showInputDialog("Enter english");
			chinese = JOptionPane.showInputDialog("Enter chinese"); 
			bw.write(english);
			bw.write(" ");
			bw.write(chinese);
			bw.write("\n");
			bw.flush(); // if use buffer , flush is needed
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
