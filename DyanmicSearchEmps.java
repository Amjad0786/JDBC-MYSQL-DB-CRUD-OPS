package amjad.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DyanmicSearchEmps {
	
	    private static final String DB_URl= "jdbc:mysql://localhost:3306/advjdb";
		
		private static final String DB_UNAME = "root";
		
		private static final String DB_PWD = "amjadkhan@1234";
		
		public static void main(String[] args) throws Exception {
			
			Scanner s = new Scanner (System.in);
			
			System.out.println("Enter Dept :: ");
			String dept = s.next();
			
			System.out.println("Enter Location :: ");
			String workLocation = s.next();
			
			System.out.println("Enter Gender :: ");
			String gender = s .next();
			
			String sql = "SELECT * FROM EMPLOYEE";
			
			Connection con = DriverManager.getConnection(DB_URl, DB_UNAME, DB_PWD);
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ "--" +rs.getString(2)+ "--" + rs.getInt(3)+ "--"+ 
			             rs.getString(4)+ "--"+ rs.getString(5)+ "--" + rs.getString(6));
				
			}
			 con.close();
			
	
		}
		

}
