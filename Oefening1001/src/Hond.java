
public class Hond {
  private String naam;
  
  public Hond( String naam ) {
  	this.naam = naam;
  }
  
  public String getNaam() {
  	return naam;
  }

  public void maakGeluid() {
  	System.out.println( "Hond zegt: Woef!" );
  }
}
