package saalRestful.WebServiceModelControll;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import saalRestful.WebServiceModelBeans.Student;
import saalRestful.WebServiceModelBeans.StudentRegistration;


@RestController
public class StudentRetrieveController {
	
	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")

	@ResponseBody
	public List<Student> getStudent() {
		return StudentRegistration.getInstance().getStudentRecords();
	}
}