import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public final class JdbcUtil {
	private JdbcUtil()
	{
		
	}
	
	public static Connection getConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/ibm_training";
		DriverManager.registerDriver(new Driver());
		Connection conn= DriverManager.getConnection(url, "root", "Deep@9981#");
		//System.out.println("Connected Successfully....");
		return conn;
	}

}
