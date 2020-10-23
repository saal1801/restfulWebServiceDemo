package saalRestful.WebServiceModelControll;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import saalRestful.WebServiceModelBeans.Course;
import saalRestful.WebServiceModelBeans.CourseRegistration;




public class CourseController {
	
	@RequestMapping(method = RequestMethod.GET, value="/course/allscourse")

	@ResponseBody
	public List<Course> getStudent() {
		return CourseRegistration.getInstance().getSoursesRecords();
	}

}
