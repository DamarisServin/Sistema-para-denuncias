
DROP DATABASE IF EXISTS DB1;

CREATE DATABASE DB1;
/* <<<<<<< HEAD */
USE DB1;
/* =======*/

/*>>>>>>> df66b329790b81d81bd3425723c16ca713e790d2 */

CREATE TABLE Profesor (
  id int NOT NULL AUTO_INCREMENT,
  correo varchar(150) NOT NULL,
  nombre varchar(50) NOT NULL,
  ap_paterno varchar(50) NOT NULL,
  ap_materno varchar(50) NOT NULL,
  escuela varchar(50) NOT NULL,
  no_poli varchar(50) NOT NULL, ##Numero empleado
  contrasena varchar(50) NOT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE Especialidad (
  id int NOT NULL AUTO_INCREMENT,
  nombre varchar(50) NOT NULL,

  PRIMARY KEY (id)
);
CREATE TABLE Centro_de_ayuda (
  id int NOT NULL AUTO_INCREMENT,
  nombre varchar(200) NOT NULL,
  direccion varchar(150), 
  contacto varchar(150),
  especialidad_id int NOT NULL,

  PRIMARY KEY (id),
  FOREIGN KEY (especialidad_id) REFERENCES Especialidad(id)
);
CREATE TABLE Genero (
  id int NOT NULL AUTO_INCREMENT,
  genero varchar(10),

  PRIMARY KEY (id) 
);
CREATE TABLE Datos_denunciante (
  id int NOT NULL AUTO_INCREMENT,
  fecha DATE NOT NULL,
  nombre varchar(50) NOT NULL,
  ap_paterno varchar(50) NOT NULL,
  ap_materno varchar(50) NOT NULL,
  edad int NOT NULL,
  genero_id int NOT NULL,
  domicilio varchar(150) NOT NULL,
  telefono varchar(15) NOT NULL,
  correo varchar(50) NOT NULL,
  unidad_academica varchar(50) NOT NULL,
  turno varchar(50) NOT NULL,
  anonimo int(1) NOT NULL,

  PRIMARY KEY (id),
  FOREIGN KEY (genero_id) REFERENCES Genero(id)
);
CREATE TABLE Datos_involucrado(
  id int NOT NULL AUTO_INCREMENT,
  nombre varchar(50) NOT NULL,
  ap_paterno varchar(50) NOT NULL,
  ap_materno varchar(50) NOT NULL,
  dependencia_politecnico varchar(50) NOT NULL,
  turno varchar(50) NOT NULL,
  
  PRIMARY KEY (id)
);
CREATE TABLE Descripcion_hechos(
  id int NOT NULL AUTO_INCREMENT,
  fecha DATE NOT NULL,
  hora TIME NOT NULL,
  lugar varchar(50) NOT NULL,
  descripcion varchar(500) NOT NULL,
  testigos varchar(200) NOT NULL,
  medios_probatorios int(1) NOT NULL,

  PRIMARY KEY (id)
);
CREATE TABLE Denuncia(
  id int NOT NULL AUTO_INCREMENT,
  Datos_denunciante_id int NOT NULL,
  Datos_involucrado_id int NOT NULL,
  Descripcion_hechos_id int NOT NULL, 
  Profesor_id int NOT NULL,

  PRIMARY KEY (id),
  FOREIGN KEY (Datos_denunciante_id ) REFERENCES Datos_denunciante(id),
  FOREIGN KEY (Datos_involucrado_id ) REFERENCES Datos_involucrado(id),
  FOREIGN KEY (Descripcion_hechos_id ) REFERENCES Descripcion_hechos(id),
  FOREIGN KEY (Profesor_id ) REFERENCES Profesor(id)

);
CREATE TABLE Denunciante (
  id int NOT NULL AUTO_INCREMENT,
  correo varchar(50),
  denuncia_id int NOT NULL,
  
  PRIMARY KEY (id),
  FOREIGN KEY (denuncia_id) REFERENCES Denuncia(id)
);
CREATE TABLE Alumno_denunciante(
  id int NOT NULL AUTO_INCREMENT,
  semestre int NOT NULL,
  grupo varchar(50) NOT NULL,
  carrera varchar(50) NOT NULL,
  denuncia_id int NOT NULL,

  PRIMARY KEY (id),
  FOREIGN KEY (denuncia_id) REFERENCES Datos_denunciante(id)
);
CREATE TABLE Trabajador_denunciante(
  id int NOT NULL AUTO_INCREMENT,
  funcion_actual varchar(50) NOT NULL,
  tipo_contrato varchar(50) NOT NULL,
  denuncia_id int NOT NULL,

  PRIMARY KEY (id),
  FOREIGN KEY (denuncia_id) REFERENCES Datos_denunciante(id)
);
CREATE TABLE Alumno_involucrado(
  id int NOT NULL AUTO_INCREMENT,
  semestre int NOT NULL,
  grupo varchar(50) NOT NULL,
  denuncia_id int NOT NULL,

  PRIMARY KEY (id),
  FOREIGN KEY (denuncia_id) REFERENCES Datos_involucrado(id)
);
CREATE TABLE Trabajador_involucrado(
  id int NOT NULL AUTO_INCREMENT,
  puesto varchar(50) NOT NULL, ##Preguntar por diferencia ¿será mejor cambiarlo por area/departamento?
  nombre_jefe varchar(50) NOT NULL,
  denuncia_id int NOT NULL,

  PRIMARY KEY (id),
  FOREIGN KEY (denuncia_id) REFERENCES Datos_involucrado(id)
);
CREATE TABLE Tutor(
  id int NOT NULL AUTO_INCREMENT,
  parentesco varchar(50) NOT NULL,
  nombre varchar(50) NOT NULL,
  ap_paterno varchar(50) NOT NULL,
  ap_materno varchar(50) NOT NULL,
  edad int NOT NULL,
  genero_id int NOT NULL,
  domicilio varchar(50) NOT NULL,
  telefono varchar(50) NOT NULL,
  correo varchar(50) NOT NULL,
  denuncia_id int NOT NULL,

  PRIMARY KEY (id),
  FOREIGN KEY (genero_id) REFERENCES Genero(id),
  FOREIGN KEY (denuncia_id) REFERENCES Denuncia(id)
);




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




INSERT INTO Centro_de_ayuda (nombre, direccion, contacto, especialidad_id) VALUES (
"Centro de Atención a la Violencia Intrafamiliar",
"General Gabriel Hernández 56, planta baja, col. Doctores, entre   Dr. Lavista y Río de la Loza, Ciudad de México",
"tels.: (55) 5345 5248, (55) 5345 5228, (55) 5345 5229",
1
);

INSERT INTO Centro_de_ayuda (nombre, direccion, contacto, especialidad_id) VALUES (
"Centro de Atención a Riesgos Victimales y Adicciones ",
"José María Izazaga 89, 5.o piso, col. Centro, Alcaldía Cuauhtémoc, Ciudad de México, Ciudad de México",
"tel.: (55) 5345 5066. centrocariva@gmail.com",
1
);

INSERT INTO Centro_de_ayuda (nombre, direccion, contacto, especialidad_id) VALUES (
"Centro de Investigación Victimológica y de Apoyo Operativo",
"Calzada de la Viga 11175, col. El Triunfo, Alcaldía Iztapalapa, 2.o y 3.er piso, Ciudad de México",
"tels.: (55) 5200 9188 y (55) 5200 9189",
1
);

INSERT INTO Centro_de_ayuda (nombre, direccion, contacto, especialidad_id) VALUES (
"Centro de Justicia para las Mujeres",
"Av. San Pablo Xalpa 396, col. San Martin Xochinahuac, Alcaldía Azcapotzalco",
"tel.: (55) 5346 8394",
1
);
INSERT INTO Centro_de_ayuda (nombre, direccion, contacto, especialidad_id) VALUES (
"Centro de Justicia para las Mujeres",
"Av. 20 de Noviembre 29, Manzana 227, col. Ixtlahuacán, Alcaldía Iztapalapa",
"tel.: (55) 53455737 ",
1
);INSERT INTO Centro_de_ayuda (nombre, direccion, contacto, especialidad_id) VALUES (
"Centro de Justicia para las Mujeres",
"Manuel Constanso 43, Manzana 63, lote 10, col. Miguel Hidalgo, Alcaldía Tlalpan, Ciudad de México",
"tel.: (55) 5200 9280",
1
);INSERT INTO Centro_de_ayuda (nombre, direccion, contacto, especialidad_id) VALUES (
"Comisión de Derechos Humanos de la Ciudad de México",
"Avenida Universidad 1449, col. Pueblo Axotla, Alcaldía Álvaro Obregón, Ciudad de México",
"tel.: 52295600, cdhdf@cdhcm.org.mx",
1
);


drop procedure if exists guardaProfesor;

delimiter **
create procedure guardaProfesor(
in idE int,
in email nvarchar(150),
in nombre nvarchar(50),
in ap_paterno nvarchar(50),
in ap_materno nvarchar(50),
in escuela nvarchar(50),
in no_poli nvarchar(50),
in constrasena nvarchar(50)
)
begin 
declare newid int;
declare msj nvarchar(200);
declare existeCorreo int;

set newid = 0;


if idE = 0 then
	
    set existeCorreo = (select count(*) from Profesor where correo = email);

    if ( existeCorreo = 0 )  then
		set newid = (select ifnull(max(id), 0) + 1 from Profesor);
        
		insert into Profesor (
			id, correo, nombre, ap_paterno, ap_materno, escuela, no_poli, contrasena
        )
			values(newid, email, nombre, ap_paterno, ap_materno, escuela, no_poli, md5(contrasena)
        );            
		set msj =  'Usuario guardado con exito';
    else
		set msj = 'Ya existe un usuario con ese correo';
    end if;
   
else

set newid = idE;

	if((select count(*) from Profesor where id = newid = 1)) then
		set msj =  'Usuario Actualizado';
        
        update Profesor set 
			nombre = nombre, ap_paterno=ap_paterno, ap_materno=ap_materno, 
			escuela=escuela, no_poli=no_poli, contrasena=md5(contrasena) where id=newid;
        
    else
		set msj =  'El usuario no se actualizo';
    end if;
    
end if;

if(msj='Usuario guardado con exito') then
	select msj as Resultado, id as id from Profesor where nombre = nombre and correo = email;
else
	select msj as Resultado, 0 as id;
end if;

end; **

delimiter ;


## TEST guardaProfesor

call guardaProfesor(
"0", "correo@ejemplo.com", "Nombre", "Apellido", "Apellido", "ESCOM", "1234567", "contrasena"
);

select * from Profesor;

call guardaProfesor(
"1", "correo@otroejemplo.com", "NombreSegundo", "Apellido", "Apellido", "ESCOM", "1234567", "contrasena"
);

select * from Profesor;

drop procedure if exists consultarProfesorById;
delimiter $$
create procedure consultarProfesorById(in id int)
begin
	select * from Profesor where id = id;
end; $$
delimiter ;



