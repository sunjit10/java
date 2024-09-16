package basics.pkg1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
 javac -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar basics/pkg1/PersonTest.java
 java -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore basics.pkg1.PersonTest
 */
public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
	Person mike = new Person();
	assertEquals("Hello World", mike.helloWorld());
    }

 
    @Test
    public void shouldReturnHelloJake() {
	Person jake = new Person();
	assertEquals("Hello Jake", jake.hello("Jake"));
    }
    

    @Test
    public void shouldReturnNumberOfPersons() {
	assertEquals(1, Person.numberOfPersons());
    }
}
