import java.io.File;
import java.io.IOException;

public class starting {

	private String file = "eng.txt";
	private String direction = "Vocabulary";
	public void filecreate(){
		File f = new File(direction , file);
		if(f.exists()){
			System.out.println("���W�G" + f.getAbsolutePath());
            System.out.println("�ɮת��סG" + f.length());
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
}
