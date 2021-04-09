INSERT INTO Persona(DTYPE, apellido, nombre, mail, ciudad) VALUES('1', 'Robles', 'Mariela', 'marielaerobles@gmail.com', 'Mar del Plata');
INSERT INTO Telefono(codigo_area, numero, is_celular) VALUES('11', '60389624', false);
INSERT INTO Telefono(codigo_area, numero, is_celular) VALUES('223', '4565606', true);

INSERT INTO persona_telefonos(persona_id, telefonos_id) VALUES(1,1), (1,2);