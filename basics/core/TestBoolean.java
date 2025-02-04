package basics.core;

/*
 *  1. What does !!someBoolean do
 *  2. Is this valid:  boolean isSame = 3 == 3;
 */
public class TestBoolean {
    public static void main(String[] args) {
	testNumbers();
	testBooleanPrimitives();
    }

    private static void testNumbers() {
	int i = 3;
	int j = 3;
	boolean isEqual = i == j;
	boolean isNotEqual = i != j;
	System.out.println("isEqual " + isEqual + " isNotEqual " + isNotEqual);
	
	if (!!isEqual) {
	    System.out.println("This shows that !! cancels out and !!isEqual is same as isEqual");
	}   
    }
    
    private static void testBooleanPrimitives() {
	boolean isWinter = true;
	boolean shouldWearCoat = false;
	boolean isSummer = false;
	
	if (isWinter && shouldWearCoat) {
	    System.out.println("Should wear coat1");
	}
	
	if (!isSummer || isWinter && shouldWearCoat) {
	    System.out.println("Should wear coat2");
	}
	
	if ((!isSummer || isWinter) && shouldWearCoat) {
	    System.out.println("Should wear coat3");
	}
	
	if (!isSummer || (isWinter && shouldWearCoat)) {
	    System.out.println("Should wear coat4");
	}
    }
    
}
