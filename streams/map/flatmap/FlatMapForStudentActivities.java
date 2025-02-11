package streams.map.flatmap;

import java.util.List;
import java.util.Set;
import lambdas.data.Student;
import lambdas.data.StudentDataBase;

public class FlatMapForStudentActivities {
    public static void main(String[] args) {
	List<Student> allStudents = StudentDataBase.getAllStudents();
	
	allStudents.stream()
	    .map(s -> s.getActivities()) // List<String>
	    .flatMap(List::stream)
	    .forEach(System.out::println);
    }
}
