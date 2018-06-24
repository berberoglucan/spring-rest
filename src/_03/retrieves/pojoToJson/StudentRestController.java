package _03.retrieves.pojoToJson;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> students;
	
	@PostConstruct
	public void loadData() {
		
		students = new ArrayList<>();
		
		students.add(new Student("can", "berberoglu"));
		
		students.add(new Student("cem", "berberoglu"));
		
		students.add(new Student("ahmet", "berberoglu"));
	}
	
	@RequestMapping("/students")
	public List<Student> getAllStudents() {
		
		return students;
		
	}
	
	@RequestMapping("/students/{studentId}")
	public Student getStudent(@PathVariable("studentId") int studentId) {
		return students.get(studentId);
	}
	
}
