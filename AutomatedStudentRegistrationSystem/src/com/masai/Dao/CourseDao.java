package com.masai.Dao;

import java.util.List;

import com.masai.Dto.Course;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomethingWentWrongException;

public interface CourseDao {
	
	public void addcourse(Course cr) throws SomethingWentWrongException;
	public List<Course> searchCoursebycoursename(String  Cname) throws SomethingWentWrongException, NoRecordFoundException;
	public List<Course> searchCoursebydurationrange(int Duration) throws SomethingWentWrongException, NoRecordFoundException;
	public List<Course> searchCoursebyFeerange(int fees) throws SomethingWentWrongException, NoRecordFoundException;
	public void updateCourseDetails(Course cr) throws SomethingWentWrongException;
}
