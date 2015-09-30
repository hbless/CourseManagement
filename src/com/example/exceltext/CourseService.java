package com.example.exceltext;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpConnection;
import org.json.JSONArray;
import org.json.JSONObject;

import android.R.integer;

public class CourseService {
	public static List<Course> getCourses() throws Exception{
		String path="http://192.168.191.1:8080/Excel/CourseServlet";
		URL url=new URL(path);
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.setConnectTimeout(5000);
		connection.setRequestMethod("GET");
		System.out.println(connection.getResponseCode());
		if (connection.getResponseCode()==200) {
			System.out.println("-------------");
			System.out.println(connection.getResponseCode());
			InputStream in=connection.getInputStream();
			return parseJson(in);
		}
		return null;
		
	}

	private static List<Course> parseJson(InputStream in) throws Exception {
		// TODO Auto-generated method stub
		List<Course> courses=new ArrayList<Course>();
		Course course=null;
		byte[] data=StreamTool.read(in);
		String json=new String (data);
		JSONArray array=new JSONArray(json);
		for (int i=0;i<array.length();i++) {
			course=new Course();
			JSONObject jsonObject=array.getJSONObject(i);
			course.setGrade(jsonObject.getString("年级"));
			course.setDiscipline(jsonObject.getString("专业"));
			course.setNumber(jsonObject.getString("专业人数"));
			course.setName(jsonObject.getString("课程名称"));
			course.setType(jsonObject.getString("选修类型"));
			course.setXuefen(jsonObject.getString("学分"));
			course.setLearnhours(jsonObject.getString("学时"));
			course.setExphours(jsonObject.getString("实验学时"));
			course.setShangji(jsonObject.getString("上机学时"));
			course.setBeginend(jsonObject.getString("起讫周序"));
			course.setTeacher(jsonObject.getString("任课教师"));
			course.setRemark(jsonObject.getString("备注"));
			courses.add(course);
		}
		return courses;
	}
}
