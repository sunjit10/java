package generics.basics;

public class Creature {
    
    private String name;
    
    public Creature(String name) {
	this.name = name;
    }
    
    @Override
    public String toString() {
	return name;
    }
    
}