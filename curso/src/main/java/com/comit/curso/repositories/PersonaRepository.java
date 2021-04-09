package com.comit.curso.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.comit.curso.entidades.Persona;

@Repository
@Transactional
public interface PersonaRepository extends CrudRepository<Persona, Long> {

}
