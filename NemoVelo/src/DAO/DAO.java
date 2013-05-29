package DAO;

import java.sql.*;

public class DAO {

	// Enregistrée en static comme ca on ne la charge que la première fois
	private static Connection _conn;

	static Connection getConnection() {

		if (_conn == null) {

			try {

				// Chargement du driver
				Class.forName("com.mysql.jdbc.Driver").newInstance();

			}

			catch (Exception e) {
				e.printStackTrace();
			}

			try {

				_conn = DriverManager.getConnection("jdbc:mysql:///nemovelo?user=root");

			} catch (SQLException e) {
				System.out.println("sql exception");
				while (e != null) {
					System.out.println(e.getErrorCode());
					System.out.println(e.getMessage());
					System.out.println(e.getSQLState());
					e.printStackTrace();
					e = e.getNextException();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return _conn;
	}

}
