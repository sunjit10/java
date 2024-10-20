package lambdas.funcinterface.basics;

public class MyFuncInterfaceImpl implements MyFuncInterface {

    public void sayHello() {
	System.out.println("Hello");
    }
    
    public static void main(String[] args) {
	MyFuncInterfaceImpl impl = new MyFuncInterfaceImpl();
	impl.sayHello();
	impl.sayBye();
    }
}
