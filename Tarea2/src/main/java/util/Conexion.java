package util;

import java.io.*;
import java.sql.*;
import java.util.*;

import com.mysql.cj.jdbc.MysqlDataSource;

public class Conexion {

	Connection con;
	MysqlDataSource m = new MysqlDataSource();
	Properties prop = new Properties();
	FileInputStream fis;

	String url;
	String usuario;
	String password;

	public Conexion() {

	}

	public Connection abrirConexion() {
		try {
			// Lee el archivo de propiedades
			fis = new FileInputStream("src/main/resources/db.properties");
			prop.load(fis);

			// Obtiene los valores del archivo
			url = prop.getProperty("url");
			usuario = prop.getProperty("usuario");
			password = prop.getProperty("password");

			// Configura la fuente de datos
			m.setUrl(url);
			m.setUser(usuario);
			m.setPassword(password);

			// Establece la conexión
			return m.getConnection();
		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println(
					"Se ha producido una FileNotFoundException: " + fileNotFoundException.getLocalizedMessage());
			fileNotFoundException.printStackTrace();

		} catch (IOException e) {
			System.out.println("Se ha producido una IOException: " + e.getLocalizedMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("Se ha producido una SQLException: " + e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

	public void cerrarConexion() {
		// Cierra la conexión
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
