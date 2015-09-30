package com.example.exceltext;

import java.util.ArrayList;
import java.util.List;

import sql.helper;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {

	private helper myhHelper;
	private List<Course> courses=new ArrayList<Course>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		getDat();
		CourseService courseService=new CourseService();
		try {
			courses=courseService.getCourses();
			System.out.println(courses.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("-----------");
			e.printStackTrace();
		}
		MyAdapter adapter=new MyAdapter(MainActivity.this, R.layout.course_item, courses);
		ListView listView=(ListView)findViewById(R.id.mylist);
		listView.setAdapter(adapter);
	}
	private void getDat() {
		// TODO Auto-generated method stub
		
		
	}
	

}
