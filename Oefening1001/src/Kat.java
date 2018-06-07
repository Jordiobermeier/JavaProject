public class Kat {
  private String naam;
  
  public Kat( String naam ) {
  	this.naam = naam;
  }
  
  public String getNaam() {
  	return naam;
  }

  public void maakGeluid() {
  	System.out.println( "Kat zegt: Miauw!" );
  }
}
