package _04.rest.exception.handling;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("studentRestController2")
@RequestMapping("/exception")
public class StudentRestController {

	private List<Student> students;

	@PostConstruct
	public void loadData() {

		students = new ArrayList<>();

		students.add(new Student("can", "berberoglu"));

		students.add(new Student("cem", "berberoglu"));

		students.add(new Student("ahmet", "berberoglu"));
	}

	@RequestMapping("/students/{studentId}")
	public Student getStudent(@PathVariable("studentId") int studentId) {

		if (studentId >= students.size() || studentId < 0) {
			throw new StudentNotFoundException("Student id not found - " + studentId);
		}

		return students.get(studentId);
	}

}
