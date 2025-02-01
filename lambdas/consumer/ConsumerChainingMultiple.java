package lambdas.consumer;

import lambdas.data.Student;
import lambdas.data.StudentDataBase;
import java.util.List;
import java.util.function.Consumer;

// Consumer1.andThen(Consumer2).andThen(Consumer3)
public class ConsumerChainingMultiple {
    public static void main(String[] args) {
	Consumer<Student> c1 = (student) -> System.out.println(student.getName());
	Consumer<Student> c2 = (student) -> System.out.println(student.getActivities());
	Consumer<Student> c3 = (student) -> System.out.println(student.getGradeLevel());
	
	List<Student> studentList = StudentDataBase.getAllStudents();
	
	System.out.println("All Students Names and Activities");
	studentList.forEach(c1.andThen(c2).andThen(c3));	
    }
}
