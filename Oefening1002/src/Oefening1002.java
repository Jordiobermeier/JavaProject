// Maak superklasse Huisdier die gemeenschappelijke kenmerken bevat van subklasse

public class Oefening1002 {
  public static void main(String[] args) {
    	
    Huisdier kat = new Kat( "Felix" );
    Huisdier hond = new Hond( "Fay" );
    	
    kat.maakGeluid();
    hond.maakGeluid();
  }
}
