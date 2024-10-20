package lambdas;

public class AccessingVariables {

    private int classVariable = 0;

    public static void main(String[] args) {
	new AccessingVariables().runExample();

    }

    public void runExample() {
	int localVariable = 100;
	Runnable r = () -> {
	    System.out.println(this.classVariable);

	    // Lambda can read or modify Global/Class Variables
	    classVariable++;
	    System.out.println(this);

	    // Lambda can read local variable but it cannot change it
	    System.out.println(localVariable);

	    // Local variables should be final or effectively final
	    //localVariable++;

	};

	r.run();
	r.run();
    }

}
