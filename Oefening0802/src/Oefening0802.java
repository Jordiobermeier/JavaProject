public class Oefening0802 {
  public static void main( String[] args ) {
	Voorraad voorraad = new Voorraad();
    Item item1 = new Boek( "Java Boek", 39.99, 9 );
    Item item2 = new Boek( "UML Boek", 32.20, 3 );
    Item item3 = new Tijdschrift( "De Java tijdschrift", 2.99, 10, 8 );
    Item item4 = new Tijdschrift( "De UML tijdschrift", 4.99, 7, 12 );
    Item item5 = new Dvd( "De Java film", 9.99, 5, 3);
    Item item6 = new Dvd( "De UML film", 6.99, 4, 1);

    System.out.println( "Voor verkoop" );
    voorraad.voegtoe( item1 );
    voorraad.voegtoe( item2 );
    voorraad.voegtoe( item3 );
    voorraad.voegtoe( item4 );
    voorraad.voegtoe( item5 );
    voorraad.voegtoe( item6 );
    
    voorraad.print();
 
    System.out.println( "\nNa verkoop" );
    voorraad.verkoop( "Java Boek" );
    voorraad.verkoop( "Java Boek" );
    voorraad.verkoop( "Java Boek" );//Verwijder in totaal 3 Java boeken
    voorraad.verkoop( "UML Boek" );
    voorraad.verkoop( "UML Boek" );
    voorraad.verkoop( "UML Boek" );//Verwijder in totaal 3 UML boeken
    voorraad.verkoop( "De Java tijdschrift" );
    voorraad.verkoop( "De Java tijdschrift" );
    voorraad.verkoop( "De Java tijdschrift" );//Verwijder in totaal 3 Java tijdschriften
    voorraad.verkoop( "De UML tijdschrift" );
    voorraad.verkoop( "De UML tijdschrift" );
    voorraad.verkoop( "De UML tijdschrift" );
    voorraad.verkoop( "De UML tijdschrift" );//Verwijder in totaal 4 UML tijdschriften
    voorraad.verkoop( "De Java film" );
    voorraad.verkoop( "De Java film" );
    voorraad.verkoop( "De Java film" );//Verwijder in totaal 3 Java films
    voorraad.verkoop( "De UML film" );
    voorraad.verkoop( "De UML film" );//Verwijder in totaal 2 UML films
    voorraad.print();
  }
}
