package lambdas.methodreferences;

class Person {
    private String name;
    
    public Person() { this.name = "Jack"; }
    
    public Person(String name) { this.name = name; }
    
    public String getName() {  return name.toUpperCase(); }
    
    public void setName(String name) { this.name = name; }
    
    public String toString() { return name; }
}

@FunctionalInterface
interface PersonCreator {
    Person create();
}

@FunctionalInterface
interface PersonNameCreator {
    Person create(String name);
}

public class MethodReferencesConstructors {
    public static void main(String[] args) {
	PersonCreator pc1 = () -> new Person();
	Person p1 = pc1.create();
	System.out.println(p1.getName());
	
	PersonCreator pc2 = Person::new;
	Person p2 = pc2.create();
	System.out.println(p2.getName());
	
	PersonNameCreator pnc1 = s -> new Person(s);
	Person p3 = pnc1.create("Peter");
	System.out.println(p3.getName());
	
	PersonNameCreator pnc2 = Person::new;
	Person p4 = pnc2.create("Pokemon");
	System.out.println(p4.getName());
    }
}
