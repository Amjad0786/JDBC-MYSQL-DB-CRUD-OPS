package amjad.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PraperedStatement {
	
	 private static final String DB_URl= "jdbc:mysql://localhost:3306/advjdb";
		
		private static final String DB_UNAME = "root";
		
		private static final String DB_PWD = "amjadkhan@1234";
		
		private static final String INSERT_SQL ="INSERT INTO BOOKS VALUES (?, ?, ?)";
		
		public static void main(String[] args)throws Exception {
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Book Id");
			int id = s.nextInt();
			
			System.out.println("Enter Book name ");
			String name = s.next();
			
			System.out.println("Enter Book Price");
			double price = s.nextDouble();
			
			Connection con = DriverManager.getConnection(DB_URl, DB_UNAME, DB_PWD);	
			System.out.println(con);
			
			PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setDouble(3, price);
			
			int cnt = pstmt.executeUpdate();
			
			System.out.println("Rows Effected :: "+ cnt);
			
			con.close();
			
		}
}
			
			
			
					
