package lambdas.supplier;

import java.util.function.Supplier;
import java.util.function.Function;
import lambdas.data.Student;
import java.util.Arrays;

/*
 * Constructor Reference:
 *  String::new
 *  Student::new
 */
public class ConstructorReference {
    public static void main(String[] args) {
	Supplier<Student> s = () -> new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
	System.out.println(s.get());

	// The default constructor of Student is invoked here (everything will be null)
	// Note: Default/Empty constructor of Student must be defined for this to work
	Supplier<Student> s2 = Student::new;
	System.out.println(s2.get());

	// Student has a String name constructor which is being used here
	Function<String, Student> s3 = Student::new;
	System.out.println(s3.apply("lulu"));
    }
}
