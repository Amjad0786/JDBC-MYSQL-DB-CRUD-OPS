package amjad.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectBooks {
	
private static final String DB_URl= "jdbc:mysql://localhost:3306/advjdb";
	
	private static final String DB_UNAME = "root";
	
	private static final String DB_PWD = "amjadkhan@1234";
	
	private static final String SELECT_SQL ="SELECT * FROM BOOKS ";
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection(DB_URl, DB_UNAME, DB_PWD);
		
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs = stmt.executeQuery(SELECT_SQL);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)  +  "-----"  + rs.getString(2)  +  "---"  + rs.getDouble(3));
			
			Thread.sleep(20000);
			
		}
		
		con.close();
}
}

		
		
		
		
		
		  
		
		
		
		
	

