import java.awt.Color;
import java.awt.Graphics;

public abstract class AbstractOnderdeel implements Onderdeel {
  protected int links, onder;
  protected Color kleur;
    
  protected AbstractOnderdeel() {
    kleur = Color.black;
    links = onder = 0;
  }
  
  protected AbstractOnderdeel(Color kleur, int links, int onder ) {
    this.kleur = kleur;
    this.links = links;
    this.onder = onder;
  }

  public abstract void teken( Graphics g );

  public Color getKleur() {
    return kleur;
  }

  public void setKleur( Color kleur ) {
    this.kleur = kleur;
  }
}
