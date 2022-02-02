package com.torus2.torus.service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.torus2.torus.entities.Course;
@Service
public class courseServiceImpl implements CourseService {

	
	List<Course> list;
	public  courseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(125,"Core java","basic"));
		list.add(new Course(128,"Advance java","Advance"));
		list.add(new Course(129,"SpringBoot","RestApi"));
		
	}
	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
	   Course c=null;
	   for(Course course:list)
	   {
		   if(course.getId()==courseId) {
			   c=course;
			   break;
		   }
	   }
		return c;
	}
	
	@Override
	public Course addCourse(Course course)
	{
		list.add(course);
		return course;
	}
	
	@Override
	public Course updateCourse(Course course)
	{
		list.forEach(e->{
			if(e.getId()==course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
				
		});
		
		return course;
	}
	@Override
	public Course deleteCourse(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
   	return null;
	}
	
	
}
