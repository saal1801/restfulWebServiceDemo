package saalRestful.WebServiceModelBeans;

import java.util.ArrayList;
import java.util.List;

public class CourseRegistration {

	
	private String courseName;
	private ArrayList<Student> students;
	
	public CourseRegistration(String courseName) {
		this.courseName = courseName;
		
		students = new ArrayList<>();
		
	}

	public String getCourseName() {
		return courseName;
	}
	
	public int size() {
		return students.size();
	}

	public boolean add(Student student) {
		
		if(!students.contains(student)) {
			students.add(student);
			return true;
		}
		return false;
	}
	
	public void remove(Student student) {
		students.remove(student);
	}
	
	public void remove(int i) {
		students.remove(i);
	}
	
	// return index in DB
	public Student getStudent(int i) {
		return students.get(i);
		
	}
	
	public int indexof(Student student) {
		return students.indexOf(student);
		
	}
	
	public boolean contains(Student student) {
		return students.contains(student);
		
	}

	@Override
	public String toString() {
		String res = "course: " + courseName + " number of students: " + size();
		
		return res;
	}
	
	// student in another courses
	public Course intersect(Course other) {
		
		Course intersection = new Course();
		 for(Student s : students) {
			 if(((List<Student>) other).contains(s)) {
				 ((List<Student>) intersection).add(s);
			 }
		 }
		
		return intersection;
		
	}
}






