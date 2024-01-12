
drop procedure if exists guardaDatosDenunciante;
drop procedure if exists consultarDatosDenuncianteById;
drop procedure if exists guardaAlumnoDenunciante;
drop procedure if exists guardaTrabajadorDenunciante;

delimiter **
	create procedure guardaDatosDenunciante(
	in idE int,
	in nombreI nvarchar(150),
	in edadI int,
	in generoI int,
	in domicilioI nvarchar(150),
	in telefonoI nvarchar(15),
	in correoI nvarchar(50),
    in ocupacionI nvarchar(50),
	in unidadI nvarchar(50),
	in turnoI nvarchar(50),
	in anonimoI int(1),
	in tutorI int
	)
	begin 
	declare newid int;
	declare msj nvarchar(200);
	declare existeDenunciante int;

	set newid = 0;


	if idE = 0 then
		
		set existeDenunciante = (select count(*) from Datos_denunciante
		where nombre = nombreI and correo = correoI);

		if ( existeDenunciante = 0 )  then
			set newid = (select ifnull(max(id), 0) + 1 from Datos_denunciante);
			
			insert into Datos_denunciante (
				  id, nombre, edad, genero_id, domicilio, telefono, correo, ocupacion, unidad_academica, turno, anonimo, tutor_id
			)
				values(
					  newid, nombreI, edadI, generoI, domicilioI, telefonoI, correoI, ocupacionI, unidadI, turnoI, anonimoI, tutorI
			);            
			set msj =  'Datos del denunciante guardados con exito';
		else
			set msj = 'Ya existe un denunciante con ese nombre y correo';
		end if;
	   
	else

	set newid = idE;

		if((select count(*) from Datos_denunciante where id = newid = 1)) then
			set msj =  'Datos del denunciante Actualizado';
			
			update Datos_denunciante set 
				  edad = edadI, genero_id = generoI, domicilio = domicilioI, telefono = telefonoI, ocupacion = ocupacionI, unidad_academica = unidadI, turno = turnoI, anonimo = anonimoI, tutor_id = tutorI
				where id=newid;
			
		else
			set msj =  'El denunciante no se actualizo';
		end if;
		
	end if;

	if(msj='Datos del denunciante guardados con exito') then
		select msj as Resultado, id as id from Datos_denunciante where id = newid;
	else
		select msj as Resultado, 0 as id;
	end if;

	end; **
    
	create procedure consultarDatosDenuncianteById(in idE int)
	begin
		select dd.id, dd.nombre, dd.edad, g.genero, dd.domicilio, dd.telefono, dd.correo, dd.ocupacion, dd.unidad_academica,
        dd.turno, dd.anonimo, dd.tutor_id 
		from Datos_denunciante dd
        inner join Genero g ON dd.genero_id = g.id
        where dd.id = idE;
	end; **
 
	create procedure guardaAlumnoDenunciante(
	in idE int,
	in sm int,
	in gp nvarchar(50),
	in cr varchar(50),
    in denunciante int
	)
	begin 
	declare newid int;
	declare msj nvarchar(200);

	set newid = 0;

	if idE = 0 then
		
		set newid = (select ifnull(max(id), 0) + 1 from Alumno_denunciante);
		
		insert into Alumno_denunciante (
			  id, semestre, grupo, carrera, denunciante_id
		)
			values(
				  newid, sm, gp, cr, denunciante
		);            
		set msj =  'Alumno denunciante guardado con exito';

	else

	set newid = idE;

		if((select count(*) from Alumno_denunciante where id = newid = 1)) then
			set msj =  'Datos Actualizados';
			
			update Alumno_denunciante set 
				   semestre= sm, grupo=gp, carrera=cr, denunciante_id = denunciante
				where id=newid;
			
		else
			set msj =  'Datos no actualizados';
		end if;
		
	end if;

	if(msj='Alumno denunciante guardado con exito') then
		select msj as Resultado, id as id from Alumno_denunciante where id = newid;
	else
		select msj as Resultado, 0 as id;
	end if;

end; **

	create procedure guardaTrabajadorDenunciante(
	in idE int,
	in fn nvarchar(50),
	in tc varchar(50),
    in denunciante int
	)
	begin 
	declare newid int;
	declare msj nvarchar(200);

	set newid = 0;

	if idE = 0 then
		
		set newid = (select ifnull(max(id), 0) + 1 from Trabajador_denunciante);
		
		insert into Trabajador_denunciante (
			  id, funcion_actual, tipo_contrato, denunciante_id
		)
			values(
				  newid, fn, tc, denunciante
		);            
		set msj =  'Trabajador denunciante guardado con exito';

	else

	set newid = idE;

		if((select count(*) from Trabajador_denunciante where id = newid = 1)) then
			set msj =  'Datos Actualizados';
			
			update Trabajador_denunciante set 
				   funcion_actual = fn, tipo_contrato = tc, denunciante_id = denunciante
				where id=newid;
			
		else
			set msj =  'Datos no actualizados';
		end if;
		
	end if;

	if(msj='Trabajador denunciante guardado con exito') then
		select msj as Resultado, id as id from Trabajador_denunciante where id = newid;
	else
		select msj as Resultado, 0 as id;
	end if;

end; **
   
delimiter ;



