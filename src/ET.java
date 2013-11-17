import javax.swing.JFrame;
import javax.swing.UIManager;


public class ET {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Opening et = new Opening();
		et.setSize(500, 800);
		et.setVisible(true);
		et.setLocation(500, 100);
		et.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
