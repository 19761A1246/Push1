import java.sql.*;
import java.io.*;
public  class PreparedStatementPractice
{
	public static void main(String args[])
	{
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/school";
		String username="root";
		String password="Ayirp2@112002";
		try {
			System.out.println("Inside try");
		Class.forName(driver);
		Connection con= DriverManager.getConnection(url,username,password);
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b= new BufferedReader(i);
		System.out.println("enter the rol number");
		String rno=b.readLine();
		System.out.println("enter the name");
		String name=b.readLine();
		String qry="insert into student values(?,?)";
		PreparedStatement st= con.prepareStatement(qry);
		st.setInt(1, Integer.parseInt(rno));
		st.setString(2, name);
		st.executeUpdate();
		con.close();
		}
		catch(Exception e){
			System.out.println("Inside catch");
		}
	}
}