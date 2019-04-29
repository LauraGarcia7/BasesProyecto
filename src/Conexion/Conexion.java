package Conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	String bd= "Tesoreria";
	private final String url = "jdbc:mysql://localhost:3306/"+bd;
	Connection con = null;

	public Conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "");
			if (con != null) {
				System.out.println("Conexion a base de datos inventario listo");
			}
		} catch (SQLException e) {
			System.out.println(e.toString()+" Error 1");
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString()+" error 2");
		}
	}

	public Connection conectado() {
		return con;
	}

	public void desconectar() {
		con = null;
		System.out.println("conexion terminada");
	}
}
