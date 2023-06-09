package amjad.com;

import java.nio.file.attribute.AclEntry.Builder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DynamicSelectBooks {
	
	 private static final String DB_URl= "jdbc:mysql://localhost:3306/advjdb";
		
		private static final String DB_UNAME = "root";
		
		private static final String DB_PWD = "amjadkhan@1234";
		
		//private static final String INSERT_SQL ="INSERT INTO BOOKS VALUES (103, 'Devops', 3000)";
		
		public static void main(String[] args)throws Exception {
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Price");
			
			double price = s.nextDouble();
			
			Connection con = DriverManager.getConnection(DB_URl, DB_UNAME, DB_PWD);
			
			
			StringBuilder sql = new StringBuilder("SELECT * FROM BOOKS");
			
			if(price > 0) {
				sql.append("WHERE BOOK_PRICE > = ?");
			}
            
		
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			if(price > 0) {
			pstmt.setDouble(1, price);
			}
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "----" + rs.getString(2) + "----" + rs.getDouble(3));
			}
			
			con.close();
}
}
