package test;

public class Common {
	 public static final String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	 public static final String user = "sa";
	 public static final String password = "086539";
	 public static final String excel_path = "E:\\info.xls";
	 public static final String url="jdbc:sqlserver://localhost:1433;databaseName=excel";
	 public static final String insertsql = "insert into t_course(年级,专业,专业人数,课程名称,选修类型,学分,学时,实验学时,上机学时,起讫周序,任课教师,备注) values(?, ?, ?, ?,?, ?, ?, ?,?, ?, ?, ?)";
	 public static final String querysql="select * from t_course";
}
