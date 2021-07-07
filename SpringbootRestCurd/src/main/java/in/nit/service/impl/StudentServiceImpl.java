package in.nit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.model.Student;
import in.nit.repo.IStudentRepository;
import in.nit.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepository repo;
	
	@Override
	public Student saveStudent(Student s) {
		Student id=  repo.save(s);
		return id;
		 
	}

	@Override
	public List<Student> findAllStudent() {
		List<Student> list=repo.findAll();
		
		return list;
	}

	@Override
	public Student FindOneStudent(Integer id) {
		Optional<Student> opt=repo.findById(id);
				if(opt.isPresent()) {
					opt.get();
					
				}
		return opt.get();
	}

	@Override
	public void deleteStudent(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public void UpdateStudent(Student s) {
		repo.save(s);
		

	}

	@Override
	public boolean isStudentExists(Integer s) {
		boolean status=repo.existsById(s);
		
		return status;
	}

}
