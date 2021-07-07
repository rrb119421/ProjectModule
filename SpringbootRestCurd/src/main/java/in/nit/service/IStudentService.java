package in.nit.service;

import java.util.List;


import in.nit.model.Student;

public interface IStudentService {
	Student saveStudent(Student s);
	List<Student> findAllStudent();
	Student FindOneStudent (Integer id);
	void deleteStudent(Integer id);
	void UpdateStudent(Student s);
	boolean isStudentExists(Integer s);
	

}
