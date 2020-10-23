package saalRestful.WebServiceModelBeans;

import java.util.List;

public class Course {
	
	String id;
	String name;
	String description;
	List<String> stepsToFinshCourse;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<String> getStepsToFinshCourse() {
		return stepsToFinshCourse;
	}
	
	public void setStepsToFinshCourse(List<String> stepsToFinshCourse) {
		this.stepsToFinshCourse = stepsToFinshCourse;
	}
	
	

}
