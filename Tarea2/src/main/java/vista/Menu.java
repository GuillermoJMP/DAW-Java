package vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.dwes.daoImple.DaoPlantaImple;

import modelo.Planta;
import util.Conexion;

public class Menu {

	boolean continuar = true;
	Scanner sc = new Scanner(System.in);
	Conexion con = new Conexion();
	
	DaoPlantaImple daoPlantaImple = new DaoPlantaImple(con.abrirConexion()) ;

	public Menu() {
		super();
	}

	public void mostrar() {
		do {

			System.out.println("\n---Menu Principal---");
			System.out.println("1. Insertar planta.");
			System.out.println("2. Modificar planta.");
			System.out.println("3. Eliminar planta.");
			System.out.println("9. Salir");

			try {

				int opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					insertarPLanta();
					break;

				case 2:
					modificarPLanta();
					break;

				case 3:
					eliminarPLanta();
					break;

				case 9:
					System.out.println("Cerrando sesion, adios.");
					continuar = false;
					break;

				default:
					System.err.print("Opcion no valida, introduzca una de las opciones mostradas.");
					break;
				}

			} catch (InputMismatchException error) {

				System.err.println("Opcion no valida.");
				error.printStackTrace();
				sc.next();
			}

		} while (continuar);

	}

	private void insertarPLanta() {
		System.out.println("Introduce el Id de la planta: ");
		String id = sc.nextLine().trim();

		System.out.println("Introduce el nombre comun de la planta: ");
		String nombreComun = sc.nextLine().trim();

		System.out.println("Introoduce el nombre cientifico de la planta: ");
		String nombreCientifico = sc.nextLine().trim();
		
		Planta newPlanta = new Planta(id, nombreComun, nombreCientifico);
		daoPlantaImple.insertar(newPlanta);
	}

	private void modificarPLanta() {
		System.out.println("Introduce el nuevo Id de la planta: ");
		String id = sc.nextLine().trim();

		System.out.println("Introduce el nuevo nombre comun de la planta: ");
		String nombreComun = sc.nextLine().trim();

		System.out.println("Introoduce el nuevo nombre cientifico de la planta: ");
		String nombreCientifico = sc.nextLine().trim();
	}

	public void eliminarPLanta() {
		System.out.println("Introduce el id de la plata que quieres eliminar.");
		String id = sc.nextLine().trim();
	}
	
	

}
