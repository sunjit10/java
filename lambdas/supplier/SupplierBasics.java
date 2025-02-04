package lambdas.supplier;

import java.util.function.Supplier;
import lambdas.data.Student;
import lambdas.data.StudentDataBase;
import java.util.List;
    
/*
 *  Supplier<T>
 *  T get()
 */
public class SupplierBasics {
    public static void main(String[] args) {
	Supplier<Double> generateRandom = () -> Math.random();
	System.out.println(generateRandom.get());

	// StudentDataBase.getAllStudents()
	Supplier<List<Student>> allStudents = () -> StudentDataBase.getAllStudents();
	allStudents.get().forEach(s -> System.out.println(s));
    }
}
