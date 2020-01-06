package jdbcdemos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTableDemo2 {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		int rowsAffected1=0;
		int rowsAffected2=0;
		try {
			connection = DBConnection.makeConnection();
			connection.setAutoCommit(false);
			Statement stat = connection.createStatement();
			String insertQuery1 = "insert into hr.customer values(109,'bibhu','pune',5000)";
			rowsAffected1 = stat.executeUpdate(insertQuery1);
			String insertQuery2 = "insert into hr.customer values(110,'shubham','banaras',2500)";
			rowsAffected2 = stat.executeUpdate(insertQuery2);
			connection.commit();
			System.out.println("both record inserted");
		} catch (Exception e) {
			try {
				System.out.println("exception happened and rolling back");
				connection.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		System.out.println("insert success with "+(rowsAffected1+rowsAffected2)+" rows");

	}

}
