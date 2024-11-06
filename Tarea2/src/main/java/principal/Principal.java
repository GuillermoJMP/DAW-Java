package principal;

import java.sql.Connection;
import java.util.Scanner;

import com.dwes.daoImple.DaoPlantaImple;

import modelo.Planta;
import util.Conexion;

public class Principal {
	public static void main(String[] args) {
		Conexion tabla = new Conexion();
		tabla.abrirConexion();
		tabla.cerrarConexion();
		Scanner sc = new Scanner(System.in);
		
		Connection con = tabla.abrirConexion();
		
		DaoPlantaImple daoPlantaImple = new DaoPlantaImple(con);

		System.out.println("Inserta tu primer plnata.");
		System.out.println("Inserta tu codigo:");
		String codigo = sc.nextLine().trim();

		System.out.println("Inserta nombre comun:");
		String nombreCom = sc.nextLine().trim();

		System.out.println("Inserta nombre cientifico:");
		String nombreCie = sc.nextLine().trim();
		
		Planta addPlanta = new Planta(codigo, nombreCom, nombreCie);
		daoPlantaImple.insertar(addPlanta);

	}

}
