package basics.inner;

public class InnerClassDemo {
    
    public String msg = "yep";
    
    public class ClassX {
	public void methodX() {
	    System.out.println("methodX");
	    System.out.println(msg);
	}
    }
    
    public class ClassY {
	public void methodY() {
	    System.out.println("methodY");
	}
    }
    
    public void print() {
	// You don't have to do InnerClassDemo.ClassA
        ClassX classX = new ClassX();
	classX.methodX();
       
	ClassY classY = new ClassY();
	classY.methodY();
    }
    
    public static void main(String[] args) {
	new InnerClassDemo().print();
	
	// Cannot do the lines below
	//InnerClassDemo.ClassX cX = new InnerClassDemo.ClassX();
	//cX.methodX();

	InnerClassDemo icd = new InnerClassDemo();
	InnerClassDemo.ClassX cX = icd.new ClassX();
	cX.methodX();
    }
}
