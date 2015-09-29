import java.sql.*;

public class hh{
 public static void main(String [] args)
 {
  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
  String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=excel";
  String userName="sa";
  String userPwd="086539";
 try
{
	Class.forName(driverName);
	System.out.println("成功加载驱动");
}catch(Exception e){
	e.printStackTrace();
	System.out.println("驱动加载失败");
}
try{
	Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
		System.out.println("连接成功");
}catch(Exception e)
{
	e.printStackTrace();
	System.out.print("SQL Server失败");
}		
}

}