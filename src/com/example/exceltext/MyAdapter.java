package com.example.exceltext;

import java.util.List;

import android.R.integer;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<Course> {
	private int resourceid;

	public MyAdapter(Context context, int textViewResourceId, List<Course> courses) {
		super(context, textViewResourceId, courses);
		// TODO Auto-generated constructor stub
		this.resourceid=textViewResourceId;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Course course=getItem(position);
		View view=LayoutInflater.from(getContext()).inflate(resourceid,null);
		TextView gradeView=(TextView)view.findViewById(R.id.grade);
		TextView disciplineView=(TextView)view.findViewById(R.id.name);
		gradeView.setText(course.getGrade());
		disciplineView.setText(course.getName());
		return view;
	}

}
