package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cursos")
public class Curso {
	
	@Id //Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincremental
	private long id;
	private String nombre;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(	name = "curso_alumno", 
				joinColumns = @JoinColumn(name = "curso_id"),
				inverseJoinColumns = @JoinColumn(name = "alumno_id"))
	private List<Alumno> alumnos = new ArrayList<>();
}
