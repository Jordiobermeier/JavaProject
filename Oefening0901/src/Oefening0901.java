import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Oefening0901 extends JFrame {
  public static void main( String args[] ) {
    JFrame frame = new Oefening0901();
    frame.setBounds( 700, 400, 400, 200 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "Rekenmachine" );
    frame.setContentPane( new Rekenmachineview() );
    frame.setVisible( true );
  }
}

class Rekenmachineview extends JPanel {
  private JTextField venster;
  private JPanel toetsenbord;
  // max 16 knoppen
  private final int AANTAL_KNOPPEN = 16;
  private JButton[] knop;
  
  public Rekenmachineview() {
    setLayout( new BorderLayout() );
    // Font die later wordt gebruikt
    Font font = new Font( "Calibri", Font.PLAIN, 14 );
    
    venster = new JTextField( " 0", 15 );
    venster.setFont( font );
    venster.setHorizontalAlignment( JTextField.RIGHT );
    add( venster, BorderLayout.NORTH );
    
    toetsenbord = new JPanel();
    toetsenbord.setLayout( new GridLayout( 4, 4 ) );
    toetsenbord.setFont( font );
    
    knop = new JButton[ AANTAL_KNOPPEN ];
    // 9 cijfers loop
    for ( int i = 0; i <= 9; i++ )
      knop[ i ] = new JButton( "" + i );
    
    // Set aparte tekens
    knop[ 10 ] = new JButton( "+" );
    knop[ 11 ] = new JButton( "-" );
    knop[ 12 ] = new JButton( "*" );
    knop[ 13 ] = new JButton( "/" );
    knop[ 14 ] = new JButton( "C" );
    knop[ 15 ] = new JButton( "=" );
    
    for( int i = 0; i < AANTAL_KNOPPEN; i++ ) 
      knop[ i ].setFont( font );
    
    // Rij 1
    for ( int i = 7; i <= 10; i++ ) {
      toetsenbord.add( knop[ i ] );
    }
    
    // Rij 2
    for ( int i = 4; i <= 6; i++ ) {
      toetsenbord.add( knop[ i ] );
    }
    toetsenbord.add( knop[ 11 ] );
    
    // Rij 3
    for ( int i = 1; i <= 3; i++ ) {
      toetsenbord.add( knop[ i ] );
    }
    toetsenbord.add( knop[ 12 ] );
    
    // Rij 4
    toetsenbord.add( knop[ 0 ] );
    for ( int i = 13; i <= 15; i++ ) {
      toetsenbord.add( knop[ i ] );
    }
    add( toetsenbord, BorderLayout.CENTER );
  }
}
