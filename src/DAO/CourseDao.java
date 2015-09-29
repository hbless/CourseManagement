package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.Common;
import test.Course;
import Utils.DBUtils;

public class CourseDao {

	private Connection connection;
	public void add(Course course){
		
		PreparedStatement ps=null;
		try {
			connection=DBUtils.getConnection();
			ps=connection.prepareStatement(Common.insertsql);
			ps.setString(1, course.getGrade());
			ps.setString(2, course.getDiscipline());
			ps.setString(3, course.getNumber());
			ps.setString(4, course.getName());
			ps.setString(5, course.getType());
			ps.setString(6, course.getXuefen());
			ps.setString(7, course.getLearnhours());
			ps.setString(8, course.getExphours());
			ps.setString(9, course.getShangji());
			ps.setString(10, course.getBeginend());
			ps.setString(11, course.getTeacher());
			ps.setString(12, course.getRemark());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtils.close(ps);
			DBUtils.close(connection);
		}
	}
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		List<Course>courses=new ArrayList<Course>();
		Course course=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		Connection connection=null;
		try {
			connection=DBUtils.getConnection();
			ps=connection.prepareStatement(Common.querysql);
			rs=ps.executeQuery();
			while(rs.next()){
				course=new Course();
				course.setGrade(rs.getString("年级"));
				course.setDiscipline(rs.getString("专业"));
				course.setNumber(rs.getString("专业人数"));
				course.setName(rs.getString("课程名称"));
				course.setType(rs.getString("选修类型"));
				course.setXuefen(rs.getString("学分"));
				course.setLearnhours(rs.getString("学时"));
				course.setExphours(rs.getString("实验学时"));
				course.setShangji(rs.getString("上机学时"));
				course.setTeacher(rs.getString("任课教师"));
				course.setRemark(rs.getString("备注"));
				course.setBeginend(rs.getString("起讫周序"));
				courses.add(course);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtils.close(rs);
			DBUtils.close(ps);
			DBUtils.close(connection);
		}
		return courses;
	}
}
