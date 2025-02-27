package streams.terminal;

import java.util.List;
import java.util.stream.Collectors;

import lambdas.data.StudentDataBase;
import lambdas.data.Student;

public class MappingBasics {
    public static void main(String[] args) {
	List<String> namesList =
	    StudentDataBase.getAllStudents()
	    .stream()
	    .collect(Collectors.mapping(Student::getName, Collectors.toList()));

	System.out.println(namesList);
    }
}
