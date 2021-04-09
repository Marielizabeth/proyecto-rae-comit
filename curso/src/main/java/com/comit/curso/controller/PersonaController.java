package com.comit.curso.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comit.curso.entidades.Persona;
import com.comit.curso.repositories.PersonaRepository;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {
	
	@Autowired 
	PersonaRepository repo;
	
	@GetMapping(value = "/")
	public ResponseEntity<List<Persona>> getPersona(){
		return new ResponseEntity<List<Persona>>((List<Persona>) repo.findAll(), HttpStatus.OK);
	}

	
	@PostMapping(value = "/")
	public ResponseEntity<List<Persona>> getPersona(@PathParam (value = "nombre") String nombre){
		Persona persona = new Persona();
		persona.setNombre(nombre);
		repo.save(persona);
		return new ResponseEntity<List<Persona>>((List<Persona>) repo.findAll(), HttpStatus.CREATED);
    }
}