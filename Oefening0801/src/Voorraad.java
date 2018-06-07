import java.util.*;

public class Voorraad {
  private ArrayList<Item> lijst;
  
  public Voorraad() {
    lijst = new ArrayList<Item>();
  }
  
  public void voegtoe( Item item ) {
    lijst.add( item );
  }
  
  public void print() {
    for( Item i : lijst ) 
      System.out.println( i );
  }
  
  public void verkoop( String titel ) {
    Item item = zoek( titel );
    if( item != null ) 
      item.verminderAantal( 1 );
  }
  
  public Item zoek( String titel ) {
    for( Item item : lijst ) {
      if( titel.equals( item.getTitel() ) )
        return item;
    }
    return null; 
  }
}
