drop procedure if exists guardaProfesor;
drop procedure if exists consultarProfesorById;
drop procedure if exists sesionProfesor;


delimiter **
	create procedure guardaProfesor(
	in idE int,
	in email nvarchar(150),
	in nombre nvarchar(50),
	in escuela nvarchar(50),
	in no_poli nvarchar(50),
	in psw nvarchar(50)
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
				id, correo, nombre, escuela, no_poli, contrasena
			)
				values(newid, email, nombre, escuela, no_poli, md5(psw)
			);            
			set msj =  'Usuario guardado con exito';
		else
			set msj = 'Ya existe un usuario con ese correo';
		end if;
	   
	else

	set newid = idE;

		if((select count(*) from Profesor where id = newid = 1  and correo = email = 1)) then
			set msj =  'Usuario Actualizado';
			
			update Profesor set 
				nombre = nombre, escuela=escuela, no_poli=no_poli, contrasena=md5(psw) where id=newid;
			
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

	create procedure consultarProfesorById(in idE int)
	begin
		select * from Profesor where id = idE;
	end; **
    
    create procedure sesionProfesor(in email nvarchar(150), in psw  nvarchar(50))
	begin
	declare existe int;
	declare msj nvarchar(200);
	declare idProf int;

	set existe = (select count(*) from Profesor where correo = email and contrasena = md5(psw));
	if (existe = 1) then

		set msj = 'Profesor encontrado';
		select id as idProf, msj from Profesor where correo = email and contrasena = md5(psw);
	else
		set msj = 'No se inicio sesion';
		select 0 as idProf, msj;
		
	end if;
	end; **
    
delimiter ;




########################## TEST ##########################

call guardaProfesor(
"0", "ejemplo@correo.com", "Nombre",  "ESCOM", "1234567", "contrasena"
);

call sesionProfesor(
"correo@ejemplo.com",  "contrasena");

select * from Profesor;


call consultarProfesorById(2);

# DELETE FROM Profesor WHERE id >0;

