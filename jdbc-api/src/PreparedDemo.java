import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedDemo {

	public static void main(String[] args) {
		String sql="insert into product values(?,?,?)";
		
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement stmt=conn.prepareStatement(sql);
			//System.out.println(args[0]+args[1]+args[2]);
			stmt.setInt(1,Integer.parseInt( args[0]));
			stmt.setString(2, args[1]);
			stmt.setDouble(3,Double.parseDouble(args[2]));
			stmt.executeUpdate();
			System.out.println("Record Inserted...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
