package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CourseService;
import test.Course;

/**
 * Servlet implementation class CourseServlet
 */
public class CourseServlet extends HttpServlet {
	private CourseService courseService;
	List<Course>courses=new ArrayList<Course>();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StringBuilder builder=new StringBuilder();
		builder.append('[');
		courseService=new CourseService();
		courses=courseService.getCourses();
		for (Course course : courses) {
			builder.append('{');
			builder.append("年级:\"").append(course.getGrade()).append("\",");
			builder.append("专业:\"").append(course.getDiscipline()).append("\",");
			builder.append("专业人数:\"").append(course.getNumber()).append("\",");
			builder.append("课程名称:\"").append(course.getName()).append("\",");
			builder.append("选修类型:\"").append(course.getType()).append("\",");
			
			builder.append("学分:\"").append(course.getXuefen()).append("\",");
			builder.append("学时:\"").append(course.getLearnhours()).append("\",");
			builder.append("实验学时:\"").append(course.getExphours()).append("\",");
			builder.append("上机学时:\"").append(course.getShangji()).append("\",");
			builder.append("起讫周序:\"").append(course.getBeginend()).append("\",");
			builder.append("任课教师:\"").append(course.getTeacher()).append("\",");
			builder.append("备注:\"").append(course.getRemark());
			builder.append("\"},");
		}
		builder.deleteCharAt(builder.length()-1);
		builder.append(']');
		request.setAttribute("json", builder.toString());
		request.getRequestDispatcher("/WEB-INF/page/course.jsp").forward(request,response);
	}
//	public static void main(String[] args) {
//		CourseService courseService=new CourseService();
//		List<Course>courses=courseService.getCourses();
//		CourseServlet courseServlet=new CourseServlet();
//		courseServlet.doTest();
//	}

//	private void doTest() {
//		StringBuilder builder=new StringBuilder();
//		builder.append('[');
//		courseService=new CourseService();
//		courses=courseService.getCourses();
//		for (Course course : courses) {
//			builder.append('{');
//			builder.append("年级:\"").append(course.getGrade()).append("\",");
//			builder.append("专业:\"").append(course.getDiscipline()).append("\",");
//			builder.append("专业人数:\"").append(course.getNumber()).append("\",");
//			builder.append("课程名称:\"").append(course.getName()).append("\",");
//			builder.append("选修类型:\"").append(course.getType()).append("\",");
//			
//			builder.append("学分:\"").append(course.getXuefen()).append("\",");
//			builder.append("学时:\"").append(course.getLearnhours()).append("\",");
//			builder.append("实验学时:\"").append(course.getExphours()).append("\",");
//			builder.append("上机学时:\"").append(course.getShangji()).append("\",");
//			builder.append("起讫周序:\"").append(course.getBeginend()).append("\",");
//			builder.append("任课教师:\"").append(course.getTeacher()).append("\",");
//			builder.append("备注:\"").append(course.getRemark());
//			builder.append("},");
//		}
//		builder.deleteCharAt(builder.length()-1);
//		builder.append(']');
//		System.out.println(builder.toString());
//		
//	}



}
