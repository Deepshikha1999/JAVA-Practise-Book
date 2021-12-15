import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.Driver;



public class ConnectionDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ibm_training";
		Connection conn = null;

		try {
			DriverManager.registerDriver(new Driver());
			conn = DriverManager.getConnection(url, "root", "Deep@9981#");
			System.out.println("Connected Successfully....");
			
			DatabaseMetaData meta=(DatabaseMetaData) conn.getMetaData();
			System.out.println("DB name: "+meta.getDatabaseProductName());
			System.out.println("DB ver: "+meta.getDatabaseProductVersion());
			System.out.println("Driver name:"+meta.getDriverName());
			System.out.println("Driver ver:"+meta.getDriverVersion());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
