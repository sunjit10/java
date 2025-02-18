package streams.filter;

import lambdas.data.StudentDataBase;
import lambdas.data.Student;

import java.util.List;
import java.util.stream.Collectors;

// filter uses Predicate
public class FilterExample {
    public static void main(String[] args) {
	List<Student> allFemaleStudents = 
	    StudentDataBase.getAllStudents()
	    .stream()
	    .filter(s -> s.getGender().equals("female"))
	    .collect(Collectors.toList());

	System.out.println(allFemaleStudents);
    }
}
