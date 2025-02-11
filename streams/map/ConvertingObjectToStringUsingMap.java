package streams.map;

import lambdas.data.Student;
import lambdas.data.StudentDataBase;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Set;

/*
   Use map to convert a raw Object (Student) to a String (Student Name)
   Demo to show .collect(Collectors.toList()) and how easily it can be
   adapted to return a Set using .collect(Collectors.toSet())
 */
public class ConvertingObjectToStringUsingMap {
    public static void main(String[] args) {
	// We get a List of Student Objects
	collectToList();
	System.out.println("-----------------");
	collectToSet();
    }

    private static void collectToList() {
	// Goal: Use map to get String Names (Student Names) ONLY from Student Objects
	List<Student> allStudents = StudentDataBase.getAllStudents();
	List<String> studentNames = 
	    allStudents.stream()
	    .map(Student::getName)
	    .map(String::toUpperCase)
	    .collect(Collectors.toList());
	
	studentNames.forEach(System.out::println);
    }

    private static void collectToSet() {
	// Goal: Use map to get String Names (Student Names) ONLY from Student Objects
	List<Student> allStudents = StudentDataBase.getAllStudents();
	Set<String> studentNames = 
	    allStudents.stream()
	    .map(Student::getName)
	    .map(String::toUpperCase)
	    .collect(Collectors.toSet());
	
	studentNames.forEach(System.out::println);
    }
}
