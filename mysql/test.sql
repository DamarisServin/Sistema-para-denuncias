########################## spProfesor ##########################

call guardaProfesor(
"0", "ejemplo@correo.com", "Abelardo",  "ESCOM", "1234567", "contrasena"
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

########################## spDatosDenunciante ##########################

call guardaDatosDenunciante(
"0", "12/12/12 12:12:12", "Abel Abelardo", 12, 1, "Domicilio", "1234567", "correo", "unidad", "turno", 1
);
call guardaDatosDenunciante(
"1", "12/12/12 12:12:12", "Bernardo Benito", 12, 1, "calle numero", "1234567", "correo", "unidad", "turno", 1
);
call guardaDatosDenunciante(
"0", "12/12/12 12:12:12", "Carlos Calderon", 12, 1, "calle numero", "1234567", "correo", "unidad", "turno", 1
);
select * from Datos_denunciante;

call consultarDatosDenuncianteById("1");

########################## spHechos ##########################

call guardaHechos(
"0", "1212/12/12 12:12:12", "Lugar",  "Descripcion", "testigo", 1, "medios_probatorios_descripcion", "otros"
);
call guardaHechos(
"1", "2112/12/12 12:12:12", "Lugar", "Descripcion", "testigo",  1, "medios_probatorios_descripcion", "otros"
);
call guardaHechos(
"0", "2023/12/12 12:12:12", "Lugar", "Descripcion", "testigo",  1, "medios_probatorios_descripcion", "otros"
);
select * from Descripcion_hechos;

# DELETE FROM Descripcion_hechos WHERE id >0;



########################## spDatosInvolucrado ##########################


call guardaDatosInvolucrado(
"0",  "Antonio Altamar", "Dependencia", "turno"
);
call guardaDatosInvolucrado(
"1", "Antorio Bond", "Dependencia", "Turno"
);
call guardaDatosInvolucrado(
"0", "Carla Celcius", "Dependencia", "Turno"
);
select * from Datos_involucrado;

#DELETE FROM Datos_involucrado WHERE id >0;


########################## spDenuncia ##########################


call guardaDenuncia(
"0", "2023/12/12", 1, 1, 1, 1
);
call guardaDenuncia(
"0", "2023/12/12", 2, 2, 2, 2
);
select * from Denuncia;
select fecha from Denuncia;