package com.clearminds.cca.dtos;

import java.sql.Date;

public class Estudiante {

	private String nombre;
	private String apellido;
	private int id;
	private int edad; 
	private String fechaModificacion;
	
	
	public Estudiante(String nombre, String apellido, int id, int edad, String fecha_modificacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.edad= edad;
		this.fechaModificacion = fecha_modificacion;
	}	
	
	public Estudiante(String nombre, String apellido, int edad, String fechaModificacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad= edad;
		this.fechaModificacion = fechaModificacion;
	}
	
	public Estudiante() {
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}	
	
	
	
	
}
