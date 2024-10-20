package lambdas.funcinterface.basics;

@FunctionalInterface
public interface MyFuncInterface {

    public void sayHello();

    public default void sayBye() {
	System.out.println("Bye");
    }
    
}
