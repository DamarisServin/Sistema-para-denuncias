
drop procedure if exists guardaDatosDenunciante;
drop procedure if exists consultarDatosDenuncianteById;

delimiter **
	create procedure guardaDatosDenunciante(
	in idE int,
	in fechaI date,
	in nombreI nvarchar(150),
	in edadI int,
	in generoI int,
	in domicilioI nvarchar(150),
	in telefonoI nvarchar(15),
	in correoI nvarchar(50),
	in unidadI nvarchar(50),
	in turnoI nvarchar(50),
	in anonimoI int(1)
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
				  id, fecha, nombre, edad, genero_id, domicilio, telefono, correo, unidad_academica, turno, anonimo
			)
				values(
					  newid, fechaI, nombreI, edadI, generoI, domicilioI, telefonoI, correoI, unidadI, turnoI, anonimoI
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
				 fecha = fechaI, edad = edadI, genero_id = generoI, domicilio = domicilioI, telefono = telefonoI, unidad_academica = unidadI, turno = turnoI, anonimo = anonimoI
				where id=newid;
			
		else
			set msj =  'El denunciante no se actualizo';
		end if;
		
	end if;

	if(msj='Denunciante guardado con exito') then
		select msj as Resultado, id as id from Datos_denunciante where nombre = nombreI and correo = correoI;
	else
		select msj as Resultado, 0 as id;
	end if;

	end; **
	create procedure consultarDatosDenuncianteById(in idE int)
	begin
		select * from Datos_denunciante where id = idE;
	end; **
delimiter ;



