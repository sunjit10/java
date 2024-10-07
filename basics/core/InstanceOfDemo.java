package basics.core;
import java.io.Serializable;

class Animal implements Serializable { private static final long serialVersionUID = 100L; }

class Mammal extends Animal { }

class CatFamily extends Mammal { }

class Tiger extends CatFamily { }

public class InstanceOfDemo {
    public static void main(String[] args) {
	//Object obj = new Tiger();
	//System.out.println(obj instanceof Integer);
	
	// 
	checkInstanceOf("Tiger", new Tiger());
	checkInstanceOf("CatFamily", new CatFamily());
	checkInstanceOf("Mammal", new Mammal());
	checkInstanceOf("Animal", new Animal());

	checkIfSerializable("Tiger", new Tiger());
	checkIfSerializable("CatFamily", new CatFamily());
	checkIfSerializable("Mammal", new Mammal());
	checkIfSerializable("Animal", new Animal());
    }

    private static void checkInstanceOf(String str, Object object) {
	System.out.println("Checking for " + str);
	System.out.println(object instanceof Tiger);
	System.out.println(object instanceof CatFamily);
	System.out.println(object instanceof Mammal);
	System.out.println(object instanceof Animal);
    }

    private static void checkIfSerializable(String str, Object object) {
	System.out.println("Serializable testing for " + str);
	System.out.println(object instanceof Serializable);
    }
}
