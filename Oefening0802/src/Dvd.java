public class Dvd extends Item {
  private int dvdnr;


  public Dvd( String titel, double prijs, int aantal, int dvdnr ) {
	  super( titel, prijs, aantal );
      this.dvdnr = dvdnr;
  }

  public int getDvdnr() {
      return dvdnr;
  }

  public String toString() {
      return super.toString() + " dvdnr " + getDvdnr();
  }
}