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
		String sql="create table computer_tb(_id integer primary key autoincrement,�꼶,רҵ,רҵ����,�γ�����,ѡ������,ѧ��,ѧʱ,ʵ��ѧʱ,�ϻ�ѧʱ,��������,�γ���ʦ,��ע)";
		db.execSQL(sql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}
	public void init(SQLiteDatabase db){
		String sql1="insert into computer_tb(�꼶,רҵ,רҵ����,�γ�����,ѡ������,ѧ��,ѧʱ) values ('2012','�������ѧ�뼼��','87','Internet������Э�����ʵ��','ʵ��ѡ��','1','24')";
		db.execSQL(sql1);
		sql1="insert into computer_tb(�꼶,רҵ,רҵ����,�γ�����,ѡ������,ѧ��,ѧʱ) values ('2012','�������ѧ�뼼��','87','IT��ҵ��Ŀʵѵ','ʵ��ѡ��','2','48')";
		db.execSQL(sql1);
		sql1="insert into computer_tb(�꼶,רҵ,רҵ����,�γ�����,ѡ������,ѧ��,ѧʱ) values ('2012','�������ѧ�뼼��','87','��ý��ͨ�ż���','רҵѡ��','2','32')";
		db.execSQL(sql1);
		sql1="insert into computer_tb(�꼶,רҵ,רҵ����,�γ�����,ѡ������,ѧ��,ѧʱ) values ('2012','�������ѧ�뼼��','87','�ֲ�ʽ����ϵͳ','ʵ��ѡ��','2','32')";
		db.execSQL(sql1);
		sql1="insert into computer_tb(�꼶,רҵ,רҵ����,�γ�����,ѡ������,ѧ��,ѧʱ) values ('2012','�������ѧ�뼼��','87','�ֲ�ʽϵͳ','ʵ��ѡ��','2','48')";
		db.execSQL(sql1);
		sql1="insert into computer_tb(�꼶,רҵ,רҵ����,�γ�����,ѡ������,ѧ��,ѧʱ) values ('2012','�������ѧ�뼼��','87','��������������','ʵ��ѡ��','1','32')";
		db.execSQL(sql1);
		sql1="insert into computer_tb(�꼶,רҵ,רҵ����,�γ�����,ѡ������,ѧ��,ѧʱ) values ('2012','�������ѧ�뼼��','87','�ߵ���ѧ','ʵ��ѡ��','2','48')";
		db.execSQL(sql1);
		sql1="insert into computer_tb(�꼶,רҵ,רҵ����,�γ�����,ѡ������,ѧ��,ѧʱ) values ('2012','�������ѧ�뼼��','87','���ݽṹ','ʵ��ѡ��','2','48')";
		db.execSQL(sql1);
	}

}
