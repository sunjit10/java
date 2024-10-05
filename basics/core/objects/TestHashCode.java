package basics.core.objects;


/*
 *    What gets printed when you print an object
 *    How do you print the Hex hashcode value of an object
 *    How do you print the Integer hashcode value of the same object
 *  
 */
public class TestHashCode {
    public static void main(String[] args) {
	Fox fox = new Fox();
	
	// output is format: package.classname@hashcodeashexnumber
	System.out.println("fox " + fox);
	
	// output is hashcode, %x shows in hex format
	System.out.printf("%x", fox.hashCode());
	System.out.println();

	// output is same hashcode as integer value for that hex
	System.out.println(fox.hashCode());
    }
}


class Fox {
    
    Fox() {
	System.out.println(this);
    }    
}
