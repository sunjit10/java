package basics.core.staticstuff;


/*
   - Can a non-static method return static value
   - Can a static method return non-static value
 */
public class Cat {
    
    private String name;
    
    static String FOOD = "Cat Food";
    private static int numCats = 0;
    private int catId = 0;
    
    public Cat(String name) {
	this.name = name;
	numCats++;
	// instance variable = VALUE of static
	// reason that works is because = is just assigning the value
	// of whatever is on the right of it to thee variable on left of it
	catId = numCats;
    }

    public int getTotalCats() {
	return numCats;
    }

    @Override
    public String toString() {
	return String.format("Cat %s with id %d", name, catId);
    }

    // A Non-Static method can return static value
    public String getCatFood() {
	return FOOD;
    }
    
    /*
      Cannot have a static method use non-static variable
    public static String getCatName() {
	return name;
    }
    */
}
