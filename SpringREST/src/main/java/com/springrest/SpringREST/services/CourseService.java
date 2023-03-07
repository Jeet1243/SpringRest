package com.springrest.SpringREST.services;

import java.util.List;

import com.springrest.SpringREST.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);

}
