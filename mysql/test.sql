########################## spUsuario ##########################

call guardaUsuario(
0, "emjlo@correo.com", "Abelardo",  "ESCOM", "1234567", "9OJqX4d7npVn7V3q", "PAAE"
);
call guardaUsuario(
0, "ab@ab.com", "Bernardo",  "ESCOM", "1234567", "contrasena", "Coordinador"
);
call guardaUsuario(
0, "qwerty@qwerty.com", "Bernardo",  "ESCOM", "1234567", "qwerty", "PAAE"
);
call sesionUsuario(
"correo@ejemplo.com",  "contrasena");

call sesionUsuario(
"ab@ab.com",  "contrasena");


select * from Usuario;

call consultarUsuarioById(2);

# DELETE FROM Usuario WHERE id >0;

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
"0",  "Abel Abelardo", 21, 1, "Domicilio", "1234567", "correo@ipn1.com","Alumno", "ESCOM", "turno", 0, null
);
call guardaDatosDenunciante(
"0", "Bernardo Benito", 12, 1, "calle numero", "1234567", "correo@ipn2.com","Alumno", "ESCA", "turno", 1, 1
);
call guardaDatosDenunciante(
"0", "Carla Calderon", 23, 2, "numero calle", "1234567", "correo@ipn3.com","Trabajador", "Cecyt 1", "turno", 1, null
);
# DELETE FROM Datos_denunciante WHERE id >0;
select * from Datos_denunciante;

call consultarDatosDenuncianteById("1");


call guardaAlumnoDenunciante(0, 6, "grupo", "carrera", 1);
call guardaAlumnoDenunciante(0, 5, "2IM3", "Ing IA", 2);
call guardaTrabajadorDenunciante(0, "Funcion", "Contrato", 3);

# DELETE FROM Alumno_Denunciante WHERE id >0;
# DELETE FROM Trabajador_Denunciante WHERE id >0;

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
"0", "2020/12/12 12:12:12", "Lugar",  "Descripcion", "testigo", 1, "medios_probatorios_descripcion", "otros"
);
call guardaHechos(
"1", "2012/12/12 12:12:12", "Lugar", "Descripcion", null,  1, "medios_probatorios_descripcion", "otros"
);
call guardaHechos(
"0", "2023/12/12 12:12:12", "Lugar", "Descripcion", "testigo",  0, null, "otros"
);
select * from Descripcion_hechos;

# DELETE FROM Descripcion_hechos WHERE id >0;




########################## spDenuncia ##########################



call guardaDenuncia(
"0", "2017/11/12 00:00:00", 1, 1, 1, 1
);
call guardaDenuncia(
"0", "2020/12/02 ", 2, 2, 2, 2
);
call guardaDenuncia(
"0", "2023/09/02 ", 3, 1, 2, 2
);
call guardaDenuncia(
"0", "2024/01/01 ", 1, 1, 2, 2
);
call guardaDenuncia(
0, '2024/01/07 02:56:29', 2, 2, 1, 1
);


select * from Denuncia;
select * from datosDenuncia;
call consultarDenunciaById(2);
call consultarDenunciasByDate( "2023/12/02 ");


##DELETE FROM Denuncia WHERE id >0;
select * from Alumno_denunciante ;


call datosTotales();