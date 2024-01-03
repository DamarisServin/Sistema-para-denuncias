
DROP DATABASE IF EXISTS DB1;

CREATE DATABASE DB1;

USE DB1;

CREATE TABLE Profesor (
  id int NOT NULL AUTO_INCREMENT,
  correo varchar(150) NOT NULL,
  nombre varchar(150) NOT NULL,
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

  PRIMARY KEY (id)
);
CREATE TABLE CentroEspecialidad (
  id int NOT NULL AUTO_INCREMENT,
  centro_id int NOT NULL,
  especialidad_id int NOT NULL,

  PRIMARY KEY (id),
  FOREIGN KEY (centro_id) REFERENCES Centro_de_ayuda(id),
  FOREIGN KEY (especialidad_id) REFERENCES Especialidad(id)
);
CREATE TABLE Genero (
  id int NOT NULL AUTO_INCREMENT,
  genero varchar(10),

  PRIMARY KEY (id) 
);
CREATE TABLE Tutor(
  id int NOT NULL AUTO_INCREMENT,
  nombre varchar(150) NOT NULL,
  edad int NOT NULL,
  genero_id int NOT NULL,
  domicilio varchar(50),
  telefono varchar(50) NOT NULL,
  correo varchar(50) NOT NULL,


  PRIMARY KEY (id),
  FOREIGN KEY (genero_id) REFERENCES Genero(id)

);

CREATE TABLE Datos_denunciante (
  id int NOT NULL AUTO_INCREMENT,
  nombre varchar(150) NOT NULL,
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
  nombre varchar(150) NOT NULL,
  dependencia_politecnico varchar(50) NOT NULL,
  turno varchar(50) NOT NULL,
  
  PRIMARY KEY (id)
);
CREATE TABLE Descripcion_hechos(
  id int NOT NULL AUTO_INCREMENT,
  fechahora DATETIME NOT NULL,
  lugar varchar(50) NOT NULL,
  descripcion varchar(500) NOT NULL,
  testigos varchar(200) ,
  medios_probatorios int(1) NOT NULL,
  medios_probatorios_descripcion varchar(500),
  otros varchar(500),

  PRIMARY KEY (id)
);
CREATE TABLE Denuncia(
  id int NOT NULL AUTO_INCREMENT,
  fecha DATETIME NOT NULL,
  Datos_denunciante_id int NOT NULL,
  Datos_involucrado_id int NOT NULL,
  Descripcion_hechos_id int NOT NULL, 
  Profesor_id int NOT NULL,
  Tutor_id int,

  PRIMARY KEY (id),
  FOREIGN KEY (Datos_denunciante_id ) REFERENCES Datos_denunciante(id),
  FOREIGN KEY (Datos_involucrado_id ) REFERENCES Datos_involucrado(id),
  FOREIGN KEY (Descripcion_hechos_id ) REFERENCES Descripcion_hechos(id),
  FOREIGN KEY (Profesor_id ) REFERENCES Profesor(id),
  FOREIGN KEY (Tutor_id ) REFERENCES Tutor(id)

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

#DROP VIEW datosDenuncia;
CREATE VIEW datosDenuncia AS
		SELECT d.id as idDenuncia, 
			   d.fecha as fechaDenuncia, 
			  dd.nombre as nombreDenunciante,
			  dd.edad as edadDenunciante,
			  gd.genero as generoDenunciante,
              dd.domicilio as domicilioDenunciante,
              dd.telefono as telefonoDenunciante,
              dd.correo as correoDenunciante,
              dd.unidad_academica as unidadDenunciante,
              dd.turno as turnoDenunciante,
              dd.anonimo as anonimoDenunciante,
--               tt.nombre as nombreTutor,
--               tt.edad as edadTutor,
--               gt.genero as generoTutor,
--               tt.telefono as telefonoTutor,
--               tt.correo as correoTutor,
              di.nombre as nombreInvolucrado,
              di.dependencia_politecnico as dependenciaInvolucrado,
              di.turno as turnoInvolucrado,
              dh.fechahora as fechaHechos,
              dh.lugar as lugarHechos,
              dh.descripcion as descripcionHechos,
              dh.testigos as testigosHechos,
              dh.medios_probatorios as mediosHechos,
              dh.medios_probatorios_descripcion as mediosDescripcionHechos,
              dh.otros as otrosHechos
		FROM Denuncia d 
        INNER JOIN Datos_denunciante dd ON d.Datos_denunciante_id = dd.id
        INNER JOIN Datos_involucrado di ON d.Datos_involucrado_id = di.id
        INNER JOIN Descripcion_hechos dh ON d.Descripcion_hechos_id = dh.id
--         INNER JOIN Tutor tt ON d.tutor_id = tt.id
        INNER JOIN Genero AS gd ON dd.genero_id = gd.id
--        INNER JOIN Genero AS gt ON tt.genero_id = gt.id
        ;
 
    
    
    