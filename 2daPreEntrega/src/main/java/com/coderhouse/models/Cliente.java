package com.coderhouse.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Cliente {
	
	@Id //Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincremental
	private long idCliente;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Apellido")
	private String apellido;
	
	@Column(name = "Email", unique = true, nullable = false)
	private String email;
	
	private LocalDateTime createdAt;

	private Cliente() {
		super();
	}
	
	public Cliente(String nombre, String apellido, String email) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliene(long idCliente) {
		this.idCliente = idCliente;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", createdAt=" + createdAt + "]";
	}
	
}
