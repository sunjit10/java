package lambdas.consumer.biconsumer;

import lambdas.data.Student;
import lambdas.data.StudentDataBase;
import java.util.List;
import java.util.function.BiConsumer;

// List.forEach(e -> BiConsumer1.accept(param1, param2)
public class BiConsumerWithList {
    public static void main(String[] args) {
	List<Student> allStudents = StudentDataBase.getAllStudents();
	printStudentNameAndGradeLevel(allStudents);
	printStudentNameAndActivities(allStudents);
    }

    private static void printStudentNameAndGradeLevel(List<Student> allStudents) {
	BiConsumer<String, Integer> biConsumer = (name, grade) -> System.out.println(name + " is in grade " + grade);
	allStudents.forEach(s-> biConsumer.accept(s.getName(), s.getGradeLevel()));
    }

    private static void printStudentNameAndActivities(List<Student> allStudents) {
	BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " does these activities: " + activities);
	allStudents.forEach(s-> biConsumer.accept(s.getName(), s.getActivities()));
    }
}
