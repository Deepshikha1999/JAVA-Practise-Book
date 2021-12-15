import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		String sql="insert into product values(145,'paper pin',6.5)";
		
		try {
			Connection conn=JdbcUtil.getConnection();
			Statement stmt=conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Record inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
