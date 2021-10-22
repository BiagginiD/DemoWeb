package com.gabrielCode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIO")
	private int codigo;

	@Column(name = "CLAVE")
	private String clave;

	@Column(name = "nombre")
	private String nombre;

	public Usuario() {
	}
	
	public Usuario(String clave, String nombre) {
		this.clave = clave;
		this.nombre = nombre;
	}

	public Usuario(int codigo, String clave, String nombre) {
		super();
		this.codigo = codigo;
		this.clave = clave;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
