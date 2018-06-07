
public abstract class Huisdier {
  protected String naam;
  
  public Huisdier( String naam ) {
    this.naam = naam;
  }
  
  public String getNaam() {
    return naam;
  }
  
  // Maakt abstract om ervoor te zorgen wat bij wie past
  public abstract void maakGeluid();
}
