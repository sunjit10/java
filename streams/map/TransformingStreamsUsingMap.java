package streams.map;

import java.util.List;

class USStates {
    
    private String name;
    
    public USStates(String name) { this.name = name; }
    
    public String getName() { return name; }
    
    public void setName(String name) { this.name = name; }
    
    public String toString() { return "state is " + name; }
    
}

public class TransformingStreamsUsingMap {
    public static void main(String[] args) {
	var usStates = List.of("New York", "Rhode Island", "Michigan", "Wisconsin", "Texas", "Nevada", "Arizona", "Utah");
	
	// Using lambda
	usStates
	    .stream()
	    .map(s -> new USStates(s))
	    .forEach(System.out::println);

	System.out.println("-----------------");

	// Using method reference
	usStates
	    .stream()
	    .map(USStates::new)
	    .forEach(System.out::println);
    }
}
