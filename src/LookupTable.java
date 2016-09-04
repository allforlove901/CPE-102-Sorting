import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
   A table for lookups and reverse lookups
*/
public class LookupTable
{ 
   private ArrayList<Item> people;

   /**
      Constructs a LookupTable object.
   */
   public LookupTable()
   { 
	   people = new ArrayList<Item>();
   }
   
   /**
      Reads key/value pairs.
      @param in the scanner for reading the input
   */
   public void read(Scanner in) 
   { 
      while(in.hasNext()){
    	  String name = in.nextLine();
    	  String number = in.nextLine();
    	  people.add(new Item(name, number));
      }
   }
   
   /**
      Looks up an item in the table.
      @param k the key to find
      @return the value with the given key, or null if no
      such item was found.
   */
   public String lookup(String k)
   { 
      String output = null;
	  for(Item item: people){
    	  if(k.equals(item.getName())){
    		  output = item.getNumber();
    	  }
      }
	  return output;
   }

   /**
      Looks up an item in the table.
      @param v the value to find
      @return the key with the given value, or null if no
      such item was found.
   */
   public String reverseLookup(String v)
   { 
	   String output = null;
		  for(Item item: people){
	    	  if(v.equals(item.getNumber())){
	    		  output = item.getName();
	    	  }
	      }
		  return output;
   }
}