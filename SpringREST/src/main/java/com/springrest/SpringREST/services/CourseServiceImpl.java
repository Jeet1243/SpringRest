package com.springrest.SpringREST.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.SpringREST.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course>list;
	
	public CourseServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Course(145,"Java Core","This Course contains basics of Java"));
		list.add(new Course(142,"Spring Boot","Creating rest Api using spring boot"));
		
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		for(Course course : list)
		{
			if(course.getId()==courseId)
			{
				c= course;
				break;
			}
		}
		
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

}
