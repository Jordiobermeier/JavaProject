public class Tijdschrift extends Item {
  private int weeknr;
  
  public Tijdschrift( String titel, double prijs, int aantal, int weeknr ) {
    super( titel, prijs, aantal );
    this.weeknr = weeknr;
  }
  
  public int getWeeknr() {
    return weeknr;
  }
  
  public String toString() {
    return super.toString() + " weeknr " + getWeeknr();
  }
}
