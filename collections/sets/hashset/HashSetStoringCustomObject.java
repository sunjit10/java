package collections.sets.hashset;

import java.util.HashSet;

/*
 * Have to implement hashCode() and equals(Object obj) method 
 * to force make int id as the sole criteria for uniqueness
 */
class Creature {
    public int id;
    public String name;
    
    public Creature(int id, String name) {
	this.id = id;
	this.name = name;
    }
    
    public String toString() {
	return id + ":" + name;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)  return true;
	if (obj == null) return false;
	if (getClass() != obj.getClass()) return false;
	
	Creature other = (Creature) obj;
	if (id != other.id) return false;
	return true;
    }
}

public class HashSetStoringCustomObject {
    public static void main(String[] args) {
	HashSet<Creature> creatures = new HashSet<>();
	creatures.add(new Creature(1, "elmo"));
	creatures.add(new Creature(2, "cookie"));
	creatures.add(new Creature(1, "elmo"));
	creatures.add(new Creature(1, "big bird"));

	creatures.forEach(System.out::println);
    }
}
