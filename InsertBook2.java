package amjad.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBook2 {
	
private static final String DB_URl= "jdbc:mysql://localhost:3306/advjdb";
	
	private static final String DB_UNAME = "root";
	
	private static final String DB_PWD = "amjadkhan@1234";
	
	private static final String INSERT_SQL ="INSERT INTO BOOKS VALUES (?, ?, ?) ";
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection(DB_URl, DB_UNAME, DB_PWD);
		
		PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
		
		pstmt.setInt(1, 105);
		pstmt.setString(2, "AWS");
		pstmt.setDouble(3, 3500.00);
		
		//pstmt.setInt(1, 105);
		//pstmt.setString(2, "GCP");
		
		//pstmt.setInt(1, 105);
		//pstmt.setString(2, "GCP");
		//pstmt.setDouble(3, 3200.00);
		//pstmt.setInt(4, 302);
	
		
		int count = pstmt.executeUpdate();
		System.out.println("Rows Effected ::" + count);
		
		con.close();
		

}
}
