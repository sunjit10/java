package lambdas.consumer;

import lambdas.data.Student;
import lambdas.data.StudentDataBase;
import java.util.List;
import java.util.function.Consumer;

public class ListForEachConsumer {
    public static void main(String[] args) {
	List<Student> students = StudentDataBase.getAllStudents();
	
	Consumer<Student> studentConsumer = (student) -> System.out.println(student.getName()); 
	
	students.forEach(studentConsumer);

	alternateWay();
    }

    private static void alternateWay() {
	System.out.println("\n ---------- Alternate Way --------");
	Consumer<List<Student>> names = (List<Student> students) -> {
	    students.forEach(e -> {
		    System.out.println(e.getName());    
		});
	};
	
	names.accept(StudentDataBase.getAllStudents());
    }
}
