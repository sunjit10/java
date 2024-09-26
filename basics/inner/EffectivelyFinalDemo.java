package basics.inner;

public class EffectivelyFinalDemo {
    
    public static void main(String[] args) {
	new EffectivelyFinalDemo().someMethod();
    }
    
    private void someMethod() {
	// variable is "Effectively Final"
	// it cannot be changed anymore since it is referenced from inside Inner Class
	String westernCity = "Tuscon";
	
	class Cities {

	    Cities() {
		// Cannot change the value
		//westernCity = "Santa Fe";
		System.out.println(westernCity);
	    }
	}
	
	new Cities();
	
	// You cannot even change it here (outside the Inner class)
	// westernCity = "Reno";
    }   
}
