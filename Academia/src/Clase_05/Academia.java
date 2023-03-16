package Clase_05;

import java.util.ArrayList;
/*
 * La clase contenedora es la que va a guardar la información en Estructuras de Datos.
 * Y todos los métodos que trabajen con esas estructuras de datos.
 */
public class Academia {
	private static ArrayList<Persona> aPersonas = new ArrayList<>(); /*ATRIBUTO DE CLASE*/
	
	/*Alamacena/guarda la persona p en el ArrayList de Personas*/
	public static void insertarPersona(Persona p) {
		aPersonas.add(p);
	}

	public static ArrayList<Persona> getaPersona() {
		return aPersonas;
	}
}