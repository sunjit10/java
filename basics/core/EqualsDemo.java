package basics.core;

class Person {

    String name;
    
    Person(String name) {
	this.name = name;
    }

    @Override
    public String toString() {  return name;  }

    @Override
    public boolean equals(Object o) {
	if (this == o) { return true; }
	if (o == null) { return false; }
	if (this.name == null) { return false; }
	if (!(o instanceof Person)) { return false; }

	
	Person p = (Person) o;
	if (name.equals(p.name)) { return true; }
	return false;
    }
}

/*
   Try with and without the equals method implementation
 */
public class EqualsDemo {
    public static void main(String[] args) {
	Person p1 = new Person("Mike");
	Person p2 = new Person("Mike");

	System.out.println(p1.equals(p2));
    }
}
