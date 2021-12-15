import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class ResultDemo {

	public static void main(String[] args) {
		String sql="select * from product";
		
		try {
			Connection conn=JdbcUtil.getConnection();
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			
			ResultSetMetaData meta=(ResultSetMetaData) rs.getMetaData();
			System.out.println(meta.getColumnName(1)+"\t"+meta.getColumnName(2)+"\t"+meta.getColumnName(3));
			while(rs.next())
			{	
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
