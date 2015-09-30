package sql;

import com.example.exceltext.MainActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class helper extends SQLiteOpenHelper {

	

	public helper(Context context) {
		super(context, "hbless.db", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
//		String sql="create table computer_tb(_id integer primary key autoincrement,grade,discipline,number,name,type,xuefen,learnhours,exphours,shangji,beginend,teacher,remark)";
		String sql="create table computer_tb(_id integer primary key autoincrement,年级,专业,专业人数,课程名称,选修类型,学分,学时,实验学时,上机学时,起讫周序,课程老师,备注)";
		db.execSQL(sql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}
	public void init(SQLiteDatabase db){
		String sql1="insert into computer_tb(年级,专业,专业人数,课程名称,选修类型,学分,学时) values ('2012','计算机科学与技术','87','Internet技术与协议分析实验','实践选修','1','24')";
		db.execSQL(sql1);
		sql1="insert into computer_tb(年级,专业,专业人数,课程名称,选修类型,学分,学时) values ('2012','计算机科学与技术','87','IT企业项目实训','实践选修','2','48')";
		db.execSQL(sql1);
		sql1="insert into computer_tb(年级,专业,专业人数,课程名称,选修类型,学分,学时) values ('2012','计算机科学与技术','87','多媒体通信技术','专业选修','2','32')";
		db.execSQL(sql1);
		sql1="insert into computer_tb(年级,专业,专业人数,课程名称,选修类型,学分,学时) values ('2012','计算机科学与技术','87','分布式操作系统','实践选修','2','32')";
		db.execSQL(sql1);
		sql1="insert into computer_tb(年级,专业,专业人数,课程名称,选修类型,学分,学时) values ('2012','计算机科学与技术','87','分布式系统','实践选修','2','48')";
		db.execSQL(sql1);
		sql1="insert into computer_tb(年级,专业,专业人数,课程名称,选修类型,学分,学时) values ('2012','计算机科学与技术','87','广义网技术试验','实践选修','1','32')";
		db.execSQL(sql1);
		sql1="insert into computer_tb(年级,专业,专业人数,课程名称,选修类型,学分,学时) values ('2012','计算机科学与技术','87','高等数学','实践选修','2','48')";
		db.execSQL(sql1);
		sql1="insert into computer_tb(年级,专业,专业人数,课程名称,选修类型,学分,学时) values ('2012','计算机科学与技术','87','数据结构','实践选修','2','48')";
		db.execSQL(sql1);
	}

}
