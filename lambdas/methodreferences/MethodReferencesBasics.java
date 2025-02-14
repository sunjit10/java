package lambdas.methodreferences;

@FunctionalInterface
interface Greeter {
    void greet();
}

public class MethodReferencesBasics {
    public static void main(String[] args) {
		Greeter g = () -> System.out.println("Hi there");
		g.greet();

		// Can do this since sayHello() is a static method
		Greeter g2 = MethodReferencesBasics::sayHello;
		g2.greet();
	}

    private static void sayHello() {
		System.out.println("Hello");
	}
}
