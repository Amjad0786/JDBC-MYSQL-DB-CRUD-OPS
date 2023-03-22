package amjad.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class InsertBook {
	
	private static final String DB_URl= "jdbc:mysql://localhost:3306/advjdb";
	
	private static final String DB_UNAME = "root";
	
	private static final String DB_PWD = "amjadkhan@1234";
	
	private static final String INSERT_SQL ="INSERT INTO BOOKS VALUES (102, 'PATHON', 2000)";
	
	public static void main(String[] args)throws Exception {
		
		//Step-1 : Load Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step-2 : Get DB Connection
		
		Connection con = DriverManager.getConnection(DB_URl, DB_UNAME, DB_PWD);
		
		
		//Step 3: Create Statement
		Statement stmt = con.createStatement();
		
		//Step-4 : Excute Query
		int rowsEffected= stmt.executeUpdate(INSERT_SQL);
		
		//Step-5 : Process Result
		
	   System.out.println("Record Inserted Count :: "+ rowsEffected);
	   
	   //step -6 : close connection
	   con.close();
		
	}

}
