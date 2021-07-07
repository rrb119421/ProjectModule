package in.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nit.model.Student;
import in.nit.service.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	@Autowired
	private IStudentService service;
	//save student(json input)
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Student student){
		ResponseEntity<String> resp=null;
		try {
			Student id=service.saveStudent(student);
			String body="Student Saved with Id="+id;
			resp=new ResponseEntity<String>(body,HttpStatus.OK);
			
			
		}catch(Exception e) {
			resp=new ResponseEntity<String>("unable to save Student",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	

}
