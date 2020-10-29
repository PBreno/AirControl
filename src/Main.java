import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

	public static void main(String[] args) {
		 try {
	            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	        }
	        catch (UnsupportedLookAndFeelException e) {
	            // handle exception
	        }
	        catch (ClassNotFoundException e) {
	            // handle exception
	        }
	        catch (InstantiationException e) {
	            // handle exception
	        }
	        catch (IllegalAccessException e) {
	            // handle exception
	        }
	        new AirControl().setVisible(true);
	}
}
