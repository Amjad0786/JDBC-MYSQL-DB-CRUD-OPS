package amjad.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertBooks2 {
	
   private static final String DB_URl= "jdbc:mysql://localhost:3306/advjdb";
	
	private static final String DB_UNAME = "root";
	
	private static final String DB_PWD = "amjadkhan@1234";
	
	private static final String INSERT_SQL ="INSERT INTO BOOKS VALUES (103, 'Devops', 3000)";
	
	public static void main(String[] args)throws Exception {
		
		//Step-1 : Load Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	    Connection con = DriverManager.getConnection(DB_URl, DB_UNAME, DB_PWD);
	    
	    Statement stmt = con.createStatement();
	    
	    int rowsEffected = stmt.executeUpdate(INSERT_SQL);
	    
	    System.out.println("Records Inserted : " + rowsEffected);
	    
	    con.close();

}
    }
