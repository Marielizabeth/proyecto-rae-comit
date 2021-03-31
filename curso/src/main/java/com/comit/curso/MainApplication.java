package com.comit.curso;

import java.util.ArrayList;

import Entidades.Persona;

public class MainApplication {

	public static void main(String[] args) {
		Persona per = Persona.builder()
					.setApellido("Robles")
					.setNombre("Mariela Elizabeth")
					.setMail("m.elizabeth.robles87@gmail.com")
					.setCiudad("Mar del Plata")
					.setTelefono(new ArrayList<Telefono>()).build();
		per.setApellido("Robles");
		
		System.out.println(per.toString());

	}

}
