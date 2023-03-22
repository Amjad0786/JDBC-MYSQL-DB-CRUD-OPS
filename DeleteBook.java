package amjad.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteBook {
	
    private static final String DB_URl= "jdbc:mysql://localhost:3306/advjdb";
	
	private static final String DB_UNAME = "root";
	
	private static final String DB_PWD = "amjadkhan@1234";
	
	private static final String DELETE_SQL ="DELETE FROM BOOKS WHERE BOOK_ID=102";
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
		Connection con = DriverManager.getConnection(DB_URl, DB_UNAME, DB_PWD);
		
		Statement stmt = con.createStatement();
		
		int cnt = stmt.executeUpdate(DELETE_SQL);
		
		System.out.println("Rows Effected :: " + cnt);
		
		con.close();
		
		
	}

}
