/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clases.ito.poo;

import java.time.LocalDate;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Instrumento.
 * 
 * @author Alfredo Juarez
 */
public class Instrumento {

	
	private String Nombre = "";

	
	private String Tipo = "";

	
	private int Antiguedad = 0;

	
	private String NombreMusico = "";

		private java.time.LocalDate FechaUtilizado = null;

	public Instrumento(String nombre, String tipo, int antiguedad, String nombreMusico, LocalDate fechaUtilizado) {
		super();
		Nombre = nombre;
		Tipo = tipo;
		Antiguedad = antiguedad;
		NombreMusico = nombreMusico;
		FechaUtilizado = fechaUtilizado;
	}
	

	// Start of user code (user defined methods for Instrumento)

	// End of user code
	/**
	 * Returns Nombre.
	 * @return Nombre 
	 */
	public String getNombre() {
		return this.Nombre;
	}

	/**
	 * Sets a value to attribute Nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.Nombre = newNombre;
	}

	/**
	 * Returns Tipo.
	 * @return Tipo 
	 */
	public String getTipo() {
		return this.Tipo;
	}

	/**
	 * Sets a value to attribute Tipo. 
	 * @param newTipo 
	 */
	public void setTipo(String newTipo) {
		this.Tipo = newTipo;
	}

	/**
	 * Returns Antiguedad.
	 * @return Antiguedad 
	 */
	public int getAntiguedad() {
		return this.Antiguedad;
	}

	/**
	 * Sets a value to attribute Antiguedad. 
	 * @param newAntiguedad 
	 */
	public void setAntiguedad(int newAntiguedad) {
		this.Antiguedad = newAntiguedad;
	}

	/**
	 * Returns NombreMusico.
	 * @return NombreMusico 
	 */
	public String getNombreMusico() {
		return this.NombreMusico;
	}

	/**
	 * Sets a value to attribute NombreMusico. 
	 * @param newNombreMusico 
	 */
	public void setNombreMusico(String newNombreMusico) {
		this.NombreMusico = newNombreMusico;
	}

	/**
	 * Returns FechaUtilizado.
	 * @return FechaUtilizado 
	 */
	public java.time.LocalDate getFechaUtilizado() {
		return this.FechaUtilizado;
	}

	/**
	 * Sets a value to attribute FechaUtilizado. 
	 * @param newFechaUtilizado 
	 */
	public void setFechaUtilizado(java.time.LocalDate newFechaUtilizado) {
		this.FechaUtilizado = newFechaUtilizado;
	}

	@Override
	public String toString() {
		return "Instrumento [Nombre=" + Nombre + ", Tipo=" + Tipo + ", Antiguedad=" + Antiguedad + ", NombreMusico="
				+ NombreMusico + ", FechaUtilizado=" + FechaUtilizado + "]";
	}

}
