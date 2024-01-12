########################## spProfesor ##########################

call guardaProfesor(
"0", "emjlo@correo.com", "Abelardo",  "ESCOM", "1234567", "9OJqX4d7npVn7V3q"
);
call guardaProfesor(
"0", "ab@ab.com", "Bernardo",  "ESCOM", "1234567", "contrasena"
);
call guardaProfesor(
"0", "qwerty@qwerty.com", "Bernardo",  "ESCOM", "1234567", "qwerty"
);
call sesionProfesor(
"correo@ejemplo.com",  "contrasena");

select * from Profesor;

call consultarProfesorById(2);

# DELETE FROM Profesor WHERE id >0;

########################## spTutor ##########################

call guardaDatosTutor(
"0",  "Daniel Dominguez", 21, 1, "Domicilio", "1234567", "correo@ejemplo.com"
);
call guardaDatosTutor(
"0", "Estefania Estrada", 21, 2, "calle numero", "1234567", "correo"
);

# DELETE FROM Tutor WHERE id >0;

########################## spDatosDenunciante ##########################

call guardaDatosDenunciante(
"0",  "Abel Abelardo", 21, 1, "Domicilio", "1234567", "correo","Alumno", "unidad", "turno", 1, null
);
call guardaDatosDenunciante(
"0", "Bernardo Benito", 12, 1, "calle numero", "1234567", "correo","Alumno", "unidad", "turno", 1, 1
);
call guardaDatosDenunciante(
"0", "Carlos Calderon", 23, 1, "numero calle", "1234567", "correo","Alumno", "unidad", "turno", 1, null
);

select * from Datos_denunciante;

call consultarDatosDenuncianteById("1");


call guardaAlumnoDenunciante(0, 6, "grupo", "carrera", 1);
call guardaAlumnoDenunciante(0, 5, "2IM3", "Ing IA", 2);
call guardaTrabajadorDenunciante(0, "Funcion", "Contrato", 3);

########################## spDatosInvolucrado ##########################

call guardaDatosInvolucrado(
"0",  "Antonio Altamar", "Dependencia", "turno"
);
call guardaDatosInvolucrado(
"1", "Antonio Altamar", "Dependencia", "Diferente"
);
call guardaDatosInvolucrado(
"0", "Carla Celcius", "Dependencia", "Turno"
);
select * from Datos_involucrado;

#DELETE FROM Datos_involucrado WHERE id >0;


########################## spHechos ##########################

call guardaHechos(
"0", "1212/12/12 12:12:12", "Lugar",  "Descripcion", "testigo", 1, "medios_probatorios_descripcion", "otros"
);
call guardaHechos(
"1", "2112/12/12 12:12:12", "Lugar", "Descripcion", "testigo",  1, "medios_probatorios_descripcion", "otros"
);
call guardaHechos(
"0", "2023/12/12 12:12:12", "Lugar", "Descripcion", "testigo",  1, null, "otros"
);
select * from Descripcion_hechos;

# DELETE FROM Descripcion_hechos WHERE id >0;




########################## spDenuncia ##########################


call guardaDenuncia(
"0", "2023/11/12 00:00:00", 1, 1, 1, 1
);
call guardaDenuncia(
"0", "2023/12/02 ", 2, 2, 2, 2
);
call guardaDenuncia(
"0", "2023/12/02 ", 1, 1, 2, 2
);
call guardaDenuncia(
"0", "2024/01/01 ", 1, 1, 2, 2
);
call guardaDenuncia(0, '2024/01/07 02:56:29', 2, 2, 1, 1);


select * from Denuncia;
select * from datosDenuncia;
call consultarDenunciaById(2);
call consultarDenunciasByDate( "2023/12/02 ");


##DELETE FROM Denuncia WHERE id >0;
select * from Alumno_denunciante ;