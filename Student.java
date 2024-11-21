package com.codegnan.university.mangement;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> enrolledCourses;
	
	public Student(String name) {
		super();
		this.name = name;
		this.enrolledCourses = new ArrayList<>();
	}
	public void enrollInCourse(Course course) {
		if(!enrolledCourses.contains(course)) {
			enrolledCourses.add(course);
		}
		
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getEnrolledCourses() {
		return enrolledCourses;
	}
	public void setEnrolledCourses(List<Course> enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
	@Override
	public String toString() {
		return name;
	}

	
	

}
