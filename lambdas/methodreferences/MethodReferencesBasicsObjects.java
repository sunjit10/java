package lambdas.methodreferences;

@FunctionalInterface
interface Greeter {
    void greet();
}

public class MethodReferencesBasicsObjects {
    public static void main(String[] args) {
	Greeter g = () -> System.out.println("Howdy");
	g.greet();

	// Can do this since sayHello() is a static method
	MethodReferencesBasicsObjects myObject =
	    new MethodReferencesBasicsObjects();
	Greeter g2 = myObject::sayHi;
	g2.greet();
    }
    
    private void sayHi() {
	System.out.println("Hi there!");
    }
}
