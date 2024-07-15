import java.sql.*;
public class ResultSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/school";
		String username="root";
		String password="Ayirp2@112002";
		try {
			System.out.println("inside try");
			Class.forName(driver);
			Connection con= DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();
			ResultSet res=st.executeQuery("Select * from student");
			while(res.next())
			{
				System.out.println(res.getInt(1)+"\t "+res.getString(2));
				
			}
			con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("Inside catch");
			}
       
	}

}
