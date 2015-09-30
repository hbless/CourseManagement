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
			course.setGrade(jsonObject.getString("�꼶"));
			course.setDiscipline(jsonObject.getString("רҵ"));
			course.setNumber(jsonObject.getString("רҵ����"));
			course.setName(jsonObject.getString("�γ�����"));
			course.setType(jsonObject.getString("ѡ������"));
			course.setXuefen(jsonObject.getString("ѧ��"));
			course.setLearnhours(jsonObject.getString("ѧʱ"));
			course.setExphours(jsonObject.getString("ʵ��ѧʱ"));
			course.setShangji(jsonObject.getString("�ϻ�ѧʱ"));
			course.setBeginend(jsonObject.getString("��������"));
			course.setTeacher(jsonObject.getString("�ον�ʦ"));
			course.setRemark(jsonObject.getString("��ע"));
			courses.add(course);
		}
		return courses;
	}
}
