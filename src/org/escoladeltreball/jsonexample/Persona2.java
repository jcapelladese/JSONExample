package org.escoladeltreball.jsonexample;

import java.util.ArrayList;

public class Persona2 {
	
	private String nombre;
	private String apellido;
	private ArrayList<String> telefonos = new ArrayList<String>();
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param telefonos
	 */
	public Persona2(String nombre, String apellido, ArrayList<String> telefonos) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = telefonos;
	}
	
	// *********** Getters & Setters ************

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the telefonos
	 */
	public ArrayList<String> getTelefonos() {
		return telefonos;
	}

	/**
	 * @param telefonos the telefonos to set
	 */
	public void setTelefonos(ArrayList<String> telefonos) {
		this.telefonos = telefonos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Persona [nombre=%s, apellido=%s, telefonos=%s]", nombre, apellido,
				telefonos);
	}
	
	
	
	
	
	

}
