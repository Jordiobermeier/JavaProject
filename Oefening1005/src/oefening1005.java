import javax.swing.JFrame;

public class oefening1005 extends JFrame {
  public static void main( String args[] ) {
    JFrame frame = new oefening1005();
    frame.setBounds( 700, 400, 350, 200 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "Auto met abstracte klasse" );
    frame.setContentPane( new Autopaneel() );
    frame.setVisible( true );
  }
}
