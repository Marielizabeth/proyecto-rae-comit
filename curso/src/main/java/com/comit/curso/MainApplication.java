package com.comit.curso;

import Entidades.Persona;

public class MainApplication {

	public static void main(String[] args) {
		Persona per = new Persona();
		per.setApellido("Robles");
		
		System.out.println(per.getApellido());

	}

}
