package com.clearminds.cca.dtos;

public class Estudiante {

	private String nombre;
	private String apellido;
	private int id;
	
	
	public Estudiante(String nombre, String apellido, int id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}	
	
	public Estudiante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}	
	
	
	
}