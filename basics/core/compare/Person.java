package basics.core.compare;

class Person implements Comparable<Person> {
    String name;
    int age;
    
    Person(String name, int age) {
	this.name = name;
	this.age = age;
    }
    
    public String getName() {   return name; }
    
    public Integer getAge() {  return Integer.valueOf(age); }
    
    @Override
    public String toString() {
	return name + " : " + age;
    }

    @Override
    public int compareTo(Person p) {
	int comparison1 = name.compareTo(p.getName());
	if (comparison1 == 0) {
	    // Cannot compare primitive int, hence had to convert to Integer
	    Integer age1 = Integer.valueOf(age);
	    comparison1 =  age1.compareTo(p.getAge());
	}
	return comparison1;
    }
}
