package com.torus2.torus.service;

import java.util.List;
import com.torus2.torus.entities.Course;

public interface CourseService {
	public List<Course> getCourse();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public Course deleteCourse(long parseLong);
   
}
