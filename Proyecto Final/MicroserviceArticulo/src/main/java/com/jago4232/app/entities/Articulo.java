package com.jago4232.app.entities;

public class Articulo {
	private long id;
	private String name;
	private String descripcion;
	private double precio;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getdescripcion() {
		return descripcion;
	}
	public void setdescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getprecio() {
		return precio;
	}
	public void setprecio(double precio) {
		this.precio = precio;
	}

}
