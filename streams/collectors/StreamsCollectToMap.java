package streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import lambdas.data.Student;
import lambdas.data.StudentDataBase;

public class StreamsCollectToMap {
    public static void main(String[] args) {
	List<Student> allStudents = StudentDataBase.getAllStudents();
	// Print All Student Info:
	// allStudents.stream().forEach(System.out::println);
	printAllStudentToActivitiesMap(allStudents);
	System.out.println("---------------------------");
	printGrade3StudentToActivitiesMap(allStudents);
	System.out.println("---------------------------");
	printGrade3GPA4StudentToActivitiesMap(allStudents);
    }
    
    // Goal: Create a Map
    // Key Student Name, Value: Student Activities
    private static void printAllStudentToActivitiesMap(List<Student> allStudents) {
	Map<String, List<String>> studentNameToActivitiesMap = 
	    allStudents
	    .stream()
	    .collect(Collectors.toMap(Student::getName, Student::getActivities));
	
	System.out.println(studentNameToActivitiesMap);
    }

    // Goal: Create a Map of Students with Grade Level >= 3
    // Key: Student Name, Value: Student Activities
    private static void printGrade3StudentToActivitiesMap(List<Student> allStudents) {
	Predicate<Student> grade = s -> s.getGradeLevel() >= 3;
	Map<String, List<String>> gradeThreeMap = 
	    allStudents
	    .stream()
	    .filter(grade)
	    .collect(Collectors.toMap(Student::getName, Student::getActivities));
	System.out.println(gradeThreeMap);
    }

    private static void printGrade3GPA4StudentToActivitiesMap(List<Student> allStudents) {
	Predicate<Student> grade = s -> s.getGradeLevel() >= 3;
	Predicate<Student> gpa = s -> s.getGpa() == 4.0;

	Map<String, List<String>> students = 
	allStudents
	    .stream()
	    .filter(grade)
	    .filter(gpa)
	    .collect(Collectors.toMap(Student::getName, Student::getActivities));
	System.out.println(students);
    }
}
