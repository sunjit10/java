package basics.inner;

public class StaticInnerClassDemo {

    private String msg = " is working";
    
    static class ClassA {
	public void methodA() {
	    System.out.println("methodA");
	    // Cannot access outer class variables from static inner class
	    //System.out.println(msg);
	}
    }

    static class ClassB {
	public void methodB() {
	    System.out.println("methodB");
	    // Cannot access outer class variables from static inner class
	    //System.out.println(msg);
	}
    }

    public void print() {
	ClassA classA = new ClassA();
	classA.methodA();
	ClassB classB = new ClassB();
	classB.methodB();
    }

    public static void main(String[] args) {
	new StaticInnerClassDemo().print();
    }
}
