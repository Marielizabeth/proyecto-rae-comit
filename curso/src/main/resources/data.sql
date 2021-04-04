INSERT INTO Persona(apellido, nombre, mail) VALUES("Robles", "Mariela", "marielaerobles@gmail.com");
INSERT INTO Telefono(codigo_area, numero, is_celular) VALUES("11", "60389624", false);
INSERT INTO Telefono(codigo_area, numero, is_celular) VALUES("223", "4565606", true);

INSERT INTO persona_telefonos(persona_id, telefonos_id) VALUES(1,1), (1,2);