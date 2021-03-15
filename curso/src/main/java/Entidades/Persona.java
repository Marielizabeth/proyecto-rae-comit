package Entidades;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter



public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	
private string apellido;
private string nombre;
private string mail;
private List <Telefono> telefonos;

public Persona() {
	// TODO Auto-generated constructor stub
}



}
