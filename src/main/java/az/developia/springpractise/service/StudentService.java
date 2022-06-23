package az.developia.springpractise.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import az.developia.springpractise.model.Student;

@Service
public class StudentService {
	public StudentService(List<Student> studentsList) {
		this.studentsList = studentsList;
	}

	private List<Student> studentsList=new ArrayList<Student>();
		{
			studentsList.add(new Student ("Emral"));
		}
		
		public void addStudent(Student student) {
			studentsList.add(student);
		
	}
	@GetMapping
	public List<Student> findAll(){
		return studentsList;
	}

	
}	