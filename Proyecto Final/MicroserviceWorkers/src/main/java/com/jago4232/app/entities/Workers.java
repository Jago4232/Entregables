package com.jago4232.app.entities;

public class Workers {
	
	private long id;
	private String name;
	private String position;
	private double salario;
	
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
	
	public String getposition() {
		return position;
	}
	public void setdescripcion(String position) {
		this.position = position;
	}
	
	public double getsalario() {
		return salario;
	}
	public void setsalario(double salario) {
		this.salario = salario;
	}
		
}
