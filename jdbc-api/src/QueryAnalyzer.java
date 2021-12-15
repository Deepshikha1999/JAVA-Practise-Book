import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class QueryAnalyzer {

	public static void main(String[] args) {
		String s="*";
		String s1="";
		
		String sql="select "+s+" from product "+s1;
		
		try {
			Connection conn=JdbcUtil.getConnection();
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			
			ResultSetMetaData meta=(ResultSetMetaData) rs.getMetaData();
			for(int i=1;i<=meta.getColumnCount();i++)
				System.out.print(meta.getColumnName(i).toUpperCase()+"\t");
			
			System.out.println();
			
			while(rs.next())
			{
				for(int i=1;i<=meta.getColumnCount();i++)
					System.out.print(rs.getObject(i)+"\t");
				
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
