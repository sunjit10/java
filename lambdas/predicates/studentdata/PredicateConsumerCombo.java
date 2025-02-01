package lambdas.predicates.studentdata;

import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import lambdas.data.*;
import java.util.List;

// Print Students whose GPA >= 3.9 AND Grade >= 3
public class PredicateConsumerCombo {
    public static void main(String[] args) {
	usingPredicate();
	System.out.println("--------------------------");
	usingBiPredicate();
    }

    private static void usingPredicate() {
	List<Student> students = StudentDataBase.getAllStudents();
	Predicate<Student> gpa = s -> s.getGpa() >= 3.9;
	Predicate<Student> grade = s -> s.getGradeLevel() >= 3;
	
	Consumer<Student> studentInfo = s -> System.out.println("Student is " + s);
	
	students.forEach(s -> {
		if (gpa.and(grade).test(s)) {
		    studentInfo.accept(s);
		}

	    });
	
    }

    private static void usingBiPredicate() {
	List<Student> students = StudentDataBase.getAllStudents();
	BiPredicate<Double, Integer> gpaAndGrade = (gpa, grade) -> gpa >= 3.9 && grade >= 3;
	
	Consumer<Student> studentInfo = s -> System.out.println("Student is " + s);

	students.forEach(s -> {
		if (gpaAndGrade.test(s.getGpa(), s.getGradeLevel())) {
		    studentInfo.accept(s);
		}
	    });

    }
}
