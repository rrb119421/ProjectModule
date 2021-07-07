package in.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.model.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

}
