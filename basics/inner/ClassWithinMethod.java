package basics.inner;

public class ClassWithinMethod {

    private String name;
    private String city;

    ClassWithinMethod() {
	name = "LOL";
	city = "SpringField";
    }
    
    public static void main(String[] args) {
	ClassWithinMethod myClass = new ClassWithinMethod();
	myClass.complicatedMethod1();
	myClass.complicatedMethod2();
    }

    public void complicatedMethod1() {

	class PrintName {
	    PrintName() {
		System.out.println("PrintName constructor");
	    }
	}
	
	new PrintName();
	System.out.println(name);
    }

    public void complicatedMethod2() {
	
	class PrintName2 {

	    PrintName2() {
		System.out.println("PrintName2 constructor");
	    }

	    public void doYouKnowTheName() {
		System.out.println(name);
	    }

	    private void doYouKnowTheCity() {
		System.out.println(city);
	    }

	    public void doYouKnowTheName2() {
		// would not work, this means name is defined for PrintName2 class
		// System.out.println(this.name); 
		System.out.println(ClassWithinMethod.this.name);
	    }
	}
	
	PrintName2 pn = new PrintName2();
	pn.doYouKnowTheName();
	pn.doYouKnowTheCity();
	pn.doYouKnowTheName2();
    }
}
