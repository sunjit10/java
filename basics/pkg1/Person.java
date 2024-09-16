package basics.pkg1;

import basics.pkg2.Name;

public class Person {

    private Name personName;

    public static int numPersons = 0;

    public Person() {
	numPersons++;
    }

    public static void main(String[] args) {
	Person p = new Person();
	String msg = p.helloWorld();
	System.out.println("Message : " + msg);
    }

    public Name name() {
	return personName;
    }

    public String helloWorld() {
	return "Hello World";
    }

    public String hello(String name) {
	System.out.println("Hello " + name);
	return "Hello " + name;
    }

    public static int numberOfPersons() {
	return numPersons;
    }
}
 
