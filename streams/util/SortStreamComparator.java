package streams.util;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

import lambdas.data.StudentDataBase;
import lambdas.data.Student;

import static java.util.stream.Collectors.toList;

public class SortStreamComparator { 
    public static void main(String[] args) {
	List<Student> allStudents = StudentDataBase.getAllStudents();
	//allStudents.forEach(System.out::println);
	sortBasedOnName(allStudents);
	System.out.println("\n--------------------\n");
	sortBasedOnGPA(allStudents);
	System.out.println("\n--------------------\n");
	sortBasedOnGPADescending(allStudents);
    }

    private static void sortBasedOnName(List<Student> allStudents) {
	// Sort Student alphabetically
	List<Student> sortedNameStudents =
	    allStudents.stream()
	    .sorted(Comparator.comparing(Student::getName))
	    .collect(toList());
	
	sortedNameStudents.forEach(System.out::println);
    }

    private static void sortBasedOnGPA(List<Student> allStudents) {
	// Sort Student based on GPA
	List<Student> sortedGPAStudents =
	    allStudents.stream()
	    .sorted(Comparator.comparing(Student::getGpa))
	    .collect(toList());
	
	sortedGPAStudents.forEach(System.out::println);
    }

    private static void sortBasedOnGPADescending(List<Student> allStudents) {
	// Sort Student based on GPA
	List<Student> sortedGPAStudents =
	    allStudents.stream()
	    .sorted(Comparator.comparing(Student::getGpa).reversed())
	    .collect(toList());
	
	sortedGPAStudents.forEach(System.out::println);
    }
								  
}
