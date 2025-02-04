package lambdas.predicates.studentdata;

import java.util.function.Predicate;
import lambdas.data.*;
import java.util.List;

public class PredicateStudentFilter {
    public static void main(String[] args) {
		printAll3rdGradeStudents(StudentDataBase.getAllStudents());
		System.out.println("------------");
		printAll3rdOr4thGradeStudents(StudentDataBase.getAllStudents());
    }
	// Input: allStudents - Student Objects
	// Goal: Print only 3rd Grade Level Students
	private static void printAll3rdGradeStudents(List<Student> allStudents) {
		Predicate<Student> thirdGradeStudent = student -> student.getGradeLevel() == 3;
		allStudents.forEach(s -> {
			if (thirdGradeStudent.test(s)) {
				System.out.println(s);
			}
		});
    }

	// Input: allStudents - Student Objects
	// Goal: Print only 3rd or 4th Grade Level Students
    private static void printAll3rdOr4thGradeStudents(List<Student> allStudents) {
		Predicate<Student> thirdGradeStudent = student -> student.getGradeLevel() == 3;
		Predicate<Student> fourthGradeStudent = student -> student.getGradeLevel() == 4;
		allStudents.forEach(s -> {
			if (thirdGradeStudent.or(fourthGradeStudent).test(s)) {
				System.out.println(s);
			}
		});
	}
}