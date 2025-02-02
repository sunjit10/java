package lambdas;

import java.util.function.Consumer;

/*
  Restrictions on using Local Variables:
  - Not allowed to use the same local variable name as lambda parameters or inside 
    the lambda body
  - Not allowed to re-assign a value to a local variable
 */
public class LocalVariables {

    static int counter = 0;
    
    public static void main(String[] args) {
	example1();
	example2();
	example3();
    }

    private static void example1() {
	//int age = 20;
	
	// If I uncomment the above line, the Consumer lambda will not work
	// since lambda is not allowed to use the same name as a local variable
	Consumer<Integer> c1 = (age) -> {
	    System.out.println("Your age is " + age);
	    counter++;
	};
	c1.accept(20);
    }

    // multBy is "Effectively Final" since lambda cannot change local variables
    // It is as good as they are defined as final
    private static void example2() {
	int multBy = 5;
	Consumer<Integer> c2 = i ->  {
	    // multBy = 3;   // Cannot change Local Variable inside Lambda
	    counter++; // Can access Class instance variable
	    System.out.println("Value of i " + multBy*i);
	};
	c2.accept(10);	
    }

    private static void example3() {
	int multBy = 20;
	Consumer<Integer> c2 = i ->  {
	    System.out.println("Value of i " + multBy*i);
	};
	
	//multBy = 3; // Cannot even change outside lambda (since it is used by lambda)
	counter++; // 
	c2.accept(10);
	System.out.println("counter " + counter);
    }
}
