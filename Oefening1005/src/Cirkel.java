import java.awt.Color;
import java.awt.Graphics;

public class Cirkel extends AbstractOnderdeel implements Onderdeel
                      {
  private int diameter;

  public Cirkel( Color kleur, int links, int onder, int diameter ) {
    super( kleur, links, onder );
    this.diameter = diameter;
  }

  public void teken( Graphics g ) { 
    g.setColor( kleur ) ;
    g.fillOval( links, onder-diameter, diameter, diameter );
    g.setColor( Color.black );
    g.drawOval( links, onder-diameter, diameter, diameter );
  }
}
  