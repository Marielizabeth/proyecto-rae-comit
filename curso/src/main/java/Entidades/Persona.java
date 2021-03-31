package Entidades;

import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Builder(setterPrefix = "set")
@ToString
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	
private String apellido;
private String nombre;
private String mail;
private String ciudad;
private List<Telefono> telefonos;






}
