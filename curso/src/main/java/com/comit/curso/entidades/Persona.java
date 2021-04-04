package com.comit.curso.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	
private String apellido;
private String nombre;
private String mail;
private String ciudad;
@OneToMany
private List<Telefono> telefonos;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;






}
