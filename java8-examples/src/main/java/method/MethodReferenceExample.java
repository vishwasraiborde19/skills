package method;

import java.util.List;
import java.util.function.Consumer;

import com.example.data.Student;
import com.example.data.StudentDataBase;

public class MethodReferenceExample {

	public static void getStudents() {
		Consumer<Student> studentName = Student::printListOfActivities;

		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(studentName);
	}

	public static void main(String args[]) {
		getStudents();
	}

}
