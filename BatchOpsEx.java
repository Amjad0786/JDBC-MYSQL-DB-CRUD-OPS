package amjad.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchOpsEx {
	
	private static final String DB_URl= "jdbc:mysql://localhost:3306/advjdb";
	
	private static final String DB_UNAME = "root";
	
	private static final String DB_PWD = "amjadkhan@1234";
	
	public static void main(String[] args) throws Exception {
		
		Connection con = DriverManager.getConnection(DB_URl, DB_UNAME, DB_PWD);
		Statement stmt = con.createStatement();
		
		stmt.addBatch("INSERT INTO BOOKS VALUES(106, 'AI', 2800.00)");
		stmt.addBatch("INSERT INTO BOOKS VALUES(107, 'ML', 3800.00)");
		stmt.addBatch("INSERT INTO BOOKS VALUES(108, 'DS', 4800.00)");
		
		int[] count = stmt.executeBatch();
		
	
			System.out.println("Records Effected ::" + count.length);
		    
			
			
			
			
		
	  con.close();
	  
	  System.out.println("Execution Completed");
		
	}

}
