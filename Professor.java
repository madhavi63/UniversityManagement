package com.codegnan.university.mangement;

import java.util.ArrayList;
import java.util.List;
public class Professor {
	private String name;
	private List<Course> assignedCourses;
	
	public Professor(String name) {
		this.name =name;
		this.assignedCourses = new ArrayList<>();	
		}
	public void assignedCourse(Course course) {
		if(!assignedCourses.contains(course)) {
			assignedCourses.add(course);
			
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getAssignedCourses() {
		return assignedCourses;
	}
	public void setAssignedCourses(List<Course> assignedCourses) {
		this.assignedCourses = assignedCourses;
	}
	@Override
	public String toString() {
		return name;
	}

}
