

INSERT INTO Profesor VALUES ("0", "correo@ejemplo.com", "Nombre de Ejemplo",  "ESCOM", "123456789", md5("contrasena"));


INSERT INTO Genero VALUES (1, "Masculino");
INSERT INTO Genero VALUES (2, "Femenino");
/*Se debe agregar -OTRO-?*/


INSERT INTO Especialidad (nombre) VALUES ("Violencia Familiar");
INSERT INTO Especialidad (nombre) VALUES ("Asistencia Social");
INSERT INTO Especialidad (nombre) VALUES ("Asesoria Legal");
INSERT INTO Especialidad (nombre) VALUES ("Violencia De Pareja");
INSERT INTO Especialidad (nombre) VALUES ("Violencia Infantil");
INSERT INTO Especialidad (nombre) VALUES ("Seguimiento Juridico");
INSERT INTO Especialidad (nombre) VALUES ("Violencia Hacia La Mujer");
INSERT INTO Especialidad (nombre) VALUES ("Atencion Psicologica");




INSERT INTO Centro_de_ayuda (nombre, direccion, contacto ) VALUES (
"Centro de Atención a la Violencia Intrafamiliar",
"General Gabriel Hernández 56, planta baja, col. Doctores, entre   Dr. Lavista y Río de la Loza, Ciudad de México",
"tels.: (55) 5345 5248, (55) 5345 5228, (55) 5345 5229"
);
INSERT INTO Centro_de_ayuda (nombre, direccion, contacto ) VALUES (
"Centro de Atención a Riesgos Victimales y Adicciones ",
"José María Izazaga 89, 5.o piso, col. Centro, Alcaldía Cuauhtémoc, Ciudad de México, Ciudad de México",
"tel.: (55) 5345 5066. centrocariva@gmail.com"
);
INSERT INTO Centro_de_ayuda (nombre, direccion, contacto ) VALUES (
"Centro de Investigación Victimológica y de Apoyo Operativo",
"Calzada de la Viga 11175, col. El Triunfo, Alcaldía Iztapalapa, 2.o y 3.er piso, Ciudad de México",
"tels.: (55) 5200 9188 y (55) 5200 9189"
);
INSERT INTO Centro_de_ayuda (nombre, direccion, contacto ) VALUES (
"Centro de Justicia para las Mujeres",
"Av. San Pablo Xalpa 396, col. San Martin Xochinahuac, Alcaldía Azcapotzalco",
"tel.: (55) 5346 8394"
);
INSERT INTO Centro_de_ayuda (nombre, direccion, contacto ) VALUES (
"Centro de Justicia para las Mujeres",
"Av. 20 de Noviembre 29, Manzana 227, col. Ixtlahuacán, Alcaldía Iztapalapa",
"tel.: (55) 53455737 "
);
INSERT INTO Centro_de_ayuda (nombre, direccion, contacto ) VALUES (
"Centro de Justicia para las Mujeres",
"Manuel Constanso 43, Manzana 63, lote 10, col. Miguel Hidalgo, Alcaldía Tlalpan, Ciudad de México",
"tel.: (55) 5200 9280"
);
INSERT INTO Centro_de_ayuda (nombre, direccion, contacto ) VALUES (
"Comisión de Derechos Humanos de la Ciudad de México",
"Avenida Universidad 1449, col. Pueblo Axotla, Alcaldía Álvaro Obregón, Ciudad de México",
"tel.: 52295600, cdhdf@cdhcm.org.mx"
);

INSERT INTO CentroEspecialidad (centro_id, especialidad_id) VALUES (1, 1);
INSERT INTO CentroEspecialidad (centro_id, especialidad_id) VALUES (1, 2);
INSERT INTO CentroEspecialidad (centro_id, especialidad_id) VALUES (2, 1);
INSERT INTO CentroEspecialidad (centro_id, especialidad_id) VALUES (2, 3);
INSERT INTO CentroEspecialidad (centro_id, especialidad_id) VALUES (3, 1);
INSERT INTO CentroEspecialidad (centro_id, especialidad_id) VALUES (3, 4);
INSERT INTO CentroEspecialidad (centro_id, especialidad_id) VALUES (4, 1);
INSERT INTO CentroEspecialidad (centro_id, especialidad_id) VALUES (4, 5);
