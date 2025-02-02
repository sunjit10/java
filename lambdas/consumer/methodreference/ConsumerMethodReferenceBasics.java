package lambdas.consumer.methodreference;

import java.util.function.Consumer;
import lambdas.data.Student;
import lambdas.data.StudentDataBase;

public class ConsumerMethodReferenceBasics {
    public static void main(String args[]) {
	//Consumer<Student> c1 = s -> System.out.println(s);

	// Using method references
	Consumer<Student> c1 = System.out::println;
	StudentDataBase.getAllStudents().forEach(c1);
	
    }
}
