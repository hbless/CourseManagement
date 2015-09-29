package service;

import java.util.ArrayList;
import java.util.List;

import DAO.CourseDao;
import test.Course;

public class CourseService {
	private  CourseDao courseDao;
	private List<Course> courses;
	public List<Course> getCourses(){
		courseDao=new CourseDao();
		courses=courseDao.getCourses();
		return courses;
	}
}
