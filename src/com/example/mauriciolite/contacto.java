package com.example.mauriciolite;

/**
 * @author Mauricio
 *
 */
public class contacto {
	private String nombre;
	private String numero;
		
	public contacto(String nombre, String numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	

}
