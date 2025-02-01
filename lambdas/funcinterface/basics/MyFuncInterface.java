package lambdas.funcinterface.basics;

// Any interface that has EXACTLY one abstract method is a Functional Interface

// Use the annotation to make it explicit that this is a Functional Interface
@FunctionalInterface
public interface MyFuncInterface {

    public void sayHello();

    public default void sayBye() {
	  System.out.println("Bye");
    }
    
}
