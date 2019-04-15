import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySQLConnection {
	public static void main(String[] args) {
		// Variables declaration
		String driver = null;
		String url = null;
		String user = null;
		String password = null;
		Connection connection = null;
		try {
			driver = "com.mysql.jdbc.Driver";
			url = "jdbc:mysql://35.192.136.197:3306/usuarios";
			user = "opet";
			password = "opet";
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			System.err.println("Connected.");
			connection.close();
			System.err.println("Closed.");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}