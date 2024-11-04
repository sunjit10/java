package lambdas.methodreferences;

class Person {
    private String name;

    public Person(String name) { this.name = name; }

    public String getName() {  return name.toUpperCase(); }

    public void setName(String name) { this.name = name; }

    public String toString() { return name; }
}

@FunctionalInterface
interface NameGetter {
    String get(Person p);
}

public class MethodReferencesArbitraryObjects {
    public static void main(String[] args) {
	Person person = new Person("Joe");
	NameGetter getter = p -> p.getName();
	System.out.println(getter.get(person));

	Person person2 = new Person("Jim");
	// Even if getName is not a Static method, you can do it
	// That is because get of NameGetter has first parameter of type Person
	NameGetter getter2 = Person::getName;
	System.out.println(getter2.get(person2));
    }
}
