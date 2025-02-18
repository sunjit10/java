package streams.reduce;

import java.util.List;
import java.util.Optional;

import lambdas.data.StudentDataBase;
import lambdas.data.Student;

public class ReduceStudentHighestGPA {
    public static void main(String[] args) {
	List<Student> allStudents = StudentDataBase.getAllStudents();

	Optional<Student> highestGPAStudent = 
	allStudents.stream()
	    .reduce((s1, s2) -> {
		    if (s1.getGpa() > s2.getGpa()) {
			return s1;
		    } else {
			return s2;
		    }
		});

	System.out.println(highestGPAStudent.get());
    }
}
