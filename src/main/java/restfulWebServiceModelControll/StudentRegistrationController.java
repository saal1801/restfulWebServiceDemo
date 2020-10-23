package restfulWebServiceModelControll;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import restfulWebServiceModelBeans.*;

//import sti.restfull.WebService.Model.restfull.WebService.Model.beans.*;

@RestController
public class StudentRegistrationController {

	@RequestMapping(method = RequestMethod.POST, value="/register/student")
	
	@ResponseBody
	StudentRegistrationReply registerStudent(@RequestBody Student student) {
		
		System.out.println("In registerStudent");
        StudentRegistrationReply stdregreply = new StudentRegistrationReply();           

        StudentRegistration.getInstance().add(student);

        //We are setting the below value just to reply a message back to the caller
        stdregreply.setName(student.getName());
        stdregreply.setAge(student.getAge());
        stdregreply.setRegistrationNumber(student.getRegistrationNumber());
        stdregreply.setRegistrationStatus("Successful");


        return stdregreply;
        
	}
}
