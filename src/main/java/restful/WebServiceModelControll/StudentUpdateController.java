package restful.WebServiceModelControll;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import restful.WebServiceModelBeans.StudentRegistration;
import restful.WebServiceModelBeans.Student;


@RestController
public class StudentUpdateController {
	
	@RequestMapping(method = RequestMethod.PUT, value="/update/student")

	
	@ResponseBody
	public String updateStudentRecord(@RequestBody Student stdn) {		
		System.out.println("In updateStudentRecord");	   
	    return StudentRegistration.getInstance().upDateStudent(stdn);		
	}	
}
