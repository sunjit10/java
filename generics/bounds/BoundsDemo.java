
package generics.bounds;

import generics.basics.Creature;
import generics.basics.Mammal;
import generics.basics.Cat;

import java.util.List;
import java.util.ArrayList;

/*
 Cat extends Mammal, Mammal extends Creature
 */
public class BoundsDemo {

    // Can accept ONLY Mammal or Cat (not Creature)
    private static void feedThem(List<? extends Mammal> list) {
	for (Mammal m : list) {
	    m.feed();
	}
    }


    private static void feedMammals() {
	List<Mammal> listOfMammals = new ArrayList<>();
	listOfMammals.add(new Mammal("dolphin"));
	listOfMammals.add(new Mammal("sheep"));
	
	feedThem(listOfMammals);
    }
    
    private static void feedCats() {
	List<Cat> listOfCats = new ArrayList<>();
	listOfCats.add(new Cat("perkins"));
	listOfCats.add(new Cat("squeeks"));
	
	feedThem(listOfCats);
    }
    
    public static void main(String[] args) {
	feedMammals();
	feedCats();	
    }
}
