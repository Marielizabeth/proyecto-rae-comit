package com.comit.curso.entidades;

import java.io.Serializable;

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
public class Telefono implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer codigoArea = 0;
	private Integer numero = 0;
	private Boolean isCelular= false;
	public Integer getCodigoArea() {
		return codigoArea;
	}
	public void setCodigoArea(Integer codigoArea) {
		this.codigoArea = codigoArea;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Boolean getIsCelular() {
		return isCelular;
	}
	public void setIsCelular(Boolean isCelular) {
		this.isCelular = isCelular;
	} 

}
