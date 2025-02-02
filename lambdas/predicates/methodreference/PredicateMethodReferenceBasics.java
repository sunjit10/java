package lambdas.predicates.methodreference;

import java.util.function.Predicate;
import lambdas.data.Student;
import lambdas.data.StudentDataBase;
import java.util.List;

public class PredicateMethodReferenceBasics {
    public static void main(String args[]) {
	List<Student> allStudents = StudentDataBase.getAllStudents();
	Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
	
	allStudents.forEach(s -> {
		if (p1.test(s)) {
		    System.out.println(s);
		}
	    });
	usingMethodReferences();
    }
    

    private static void usingMethodReferences() {
	System.out.println("---------------------------------------");
	List<Student> allStudents = StudentDataBase.getAllStudents();
	// Using method reference
	Predicate<Student> p1 = PredicateMethodReferenceBasics::checkGradeLevel;
	allStudents.forEach(s -> {
		if (p1.test(s)) {
		    System.out.println(s);
		}
	    });
    }

    private static boolean checkGradeLevel(Student s) {
	return s.getGradeLevel() >= 3;
    }
}
