import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
		String sql="insert into product value(201,'iPencil',8000)";
		String sql1="update product set price=49000 where code =178";
		String sql3="delete from product where code=421";
		Connection conn=null;
		try {
			conn=JdbcUtil.getConnection();
			conn.setAutoCommit(false);
			
			Statement stmt=conn.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();
			
			conn.commit();
			System.out.println("Transaction Successfully completed....");
		} catch (SQLException e) {
			System.out.println("Transaction failed.....");
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
