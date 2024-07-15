import java.sql.*;
public class JDBCPractice{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Register the driver
		String Driver="com.mysql.cj.jdbc.Driver";
		String Url="jdbc:mysql://localhost:3306/school";
		String Username="root";
		String Password="Ayirp2@112002";
		try {
			System.out.println("I am inside try");
		Class.forName(Driver);//loads the driver into memory explicitly
		//2.get the connection
		Connection con=DriverManager.getConnection(Url,Username,Password);
		//3.create statement object
		Statement stmt=con.createStatement();
		//4.Execute a query
		stmt.executeUpdate("Insert into student values(1,'Priya')");
		stmt.executeUpdate("Insert into student values(2,'Darshini')");
		stmt.executeUpdate("Insert into student values(3,'Rayala')");
		stmt.executeQuery("Select * from student");
		System.out.println();
		//5.close the connection
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("I am inside catch");
		}	
	}
}
