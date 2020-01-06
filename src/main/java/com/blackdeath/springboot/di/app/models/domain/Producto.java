package com.blackdeath.springboot.di.app.models.domain;

/**
 * 
 * @author blackdeath
 *
 */
public class Producto {
	private String nombre;
	private Integer precio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

}
