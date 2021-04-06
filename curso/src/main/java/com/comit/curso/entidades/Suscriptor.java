package com.comit.curso.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Suscriptor extends Persona {
	private static final long serialVersionUID = 1L; 
	
private String apellido;
private String nombre;
private String mail;
private String ciudad;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;



}
