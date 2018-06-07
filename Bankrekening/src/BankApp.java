import javax.swing.JFrame;

public class BankApp extends JFrame {
  
	public static void main( String args[] ) {
    JFrame frame = new BankApp();
    frame.setBounds( 700, 400, 350, 200 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "Bank" );
    frame.setVisible( true );
	}
	
}
