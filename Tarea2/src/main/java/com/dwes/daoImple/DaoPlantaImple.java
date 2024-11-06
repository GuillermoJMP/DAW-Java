package com.dwes.daoImple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dwes.dao.PlantaDao;

import modelo.Planta;
import util.Conexion;

public class DaoPlantaImple implements PlantaDao {

	private Connection con;
	public PreparedStatement pre;
	private ResultSet res;

	public DaoPlantaImple(Connection con) {
		this.con = con;
	}

	public int insertar(Planta p) {
		try {
			pre = con.prepareStatement("INSERT INTO planta(codigo, nombrecomun, nombrecientifico) VALUES (?,?,?)");
			pre.setString(1, p.getCodigo());
			pre.setString(2, p.getNombreComun());
			pre.setString(3, p.getNombreCientifico());
			pre.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Planta no insertada correctamente.");
		}

		return 0;
	}

	public int modificar(Planta p) {
		try {
			pre = con.prepareStatement("UPDATE planta SET codigo=?,?=?,nombrecientifico=? WHERE 1)");
			pre.setString(2, p.getNombreComun());
			pre.setString(3, p.getNombreCientifico());
			pre.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Planta no insertada correctamente.");
		}

		return 0;
	}

	public int eliminar(Planta p) {

		try {
			pre = con.prepareStatement("DELETE FROM planta WHERE 0");
			pre.setString(1, p.getCodigo());
			pre.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Planta no insertada correctamente.");
		}

		return 0;
	}

}
