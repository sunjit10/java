package lambdas.consumer;

import lambdas.data.Student;
import lambdas.data.StudentDataBase;
import java.util.List;
import java.util.function.Consumer;

// Consumer1.andThen(Consumer2).accept(Lambda Variable)
public class ConsumerChainingWithFilters {
    public static void main(String[] args) {
	Consumer<Student> c1 = (student) -> System.out.println(student.getName());
	Consumer<Student> c2 = (student) -> System.out.println(student.getActivities());
	List<Student> studentList = StudentDataBase.getAllStudents();
	
	System.out.println("Students In Grade 3: Names and Activities");
	studentList.forEach(s -> {
		if (s.getGradeLevel() > 3) {
		    System.out.println(s.getGradeLevel());
		    c1.andThen(c2).accept(s); // Here accept is required
		}
	    });
    }
}
