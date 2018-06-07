public class Item {
  private String titel;
  private double prijs;
  private int aantal;
  
  public Item( String titel, double prijs, int aantal ) {
    this.titel = titel;
    this.prijs = prijs;
    this.aantal = aantal;
  }
  
  public String getTitel() {
    return titel;
  }
  
  public double getPrijs() {
    return prijs;
  }
  
  public int getAantal() {
    return aantal;
  }
  
  public String toString() {
    return String.format( "%-20s %5.2f %3d stuks", titel, prijs, aantal );
  }
  
  public void verminderAantal( int hoeveelheid ) {
    aantal -= hoeveelheid;
  }
}
