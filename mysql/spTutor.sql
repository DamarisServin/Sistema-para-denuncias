
drop procedure if exists guardaDatosTutor;
drop procedure if exists consultarDatosTutorById;
drop procedure if exists consultarDatosTutorByDenuncianteId;

delimiter **
	create procedure guardaDatosTutor(
	in idE int,
	in nombreI nvarchar(150),
	in edadI int,
	in generoI int,
	in domicilioI nvarchar(150),
	in telefonoI nvarchar(15),
	in correoI nvarchar(50)

	)
	begin 
	declare newid int;
	declare msj nvarchar(200);
	declare existeTutor int;

	set newid = 0;


	if idE = 0 then
		
		set existeTutor = (select count(*) from Tutor
		where nombre = nombreI and correo = correoI);

		if ( existeTutor = 0 )  then
			set newid = (select ifnull(max(id), 0) + 1 from Tutor);
			
			insert into Tutor (
				  id, nombre, edad, genero_id, domicilio, telefono, correo
			)
				values(
					  newid, nombreI, edadI, generoI, domicilioI, telefonoI, correoI
			);            
			set msj =  'Datos del tutor guardados con exito';
		else
			set msj = 'Ya existe un tutor con ese nombre y correo';
		end if;
	   
	else

	set newid = idE;

		if((select count(*) from Tutor where id = newid = 1)) then
			set msj =  'Datos del tutor Actualizado';
			
			update Tutor set 
				  edad = edadI, genero_id = generoI, domicilio = domicilioI, telefono = telefonoI
				where id=newid;
			
		else
			set msj =  'El tutor no se actualizo';
		end if;
		
	end if;

	if(msj='Datos del tutor guardados con exito') then
		select msj as Resultado, id as id from Tutor where id = newid;
	else
		select msj as Resultado, 0 as id;
	end if;

	end; **
    
	create procedure consultarDatosTutorById(in idE int)
	begin
		select * from Tutor where id = idE;
	end; **
    
    create procedure consultarDatosTutorByDenuncianteId(in idE int)
	begin
		select 
              tt.nombre as nombreTutor,
              tt.edad as edadTutor,
              g.genero as generoTutor,
              tt.telefono as telefonoTutor,
              tt.correo as correoTutor,
              tt.domicilio as domicilioTutor
		from Tutor tt
		inner join Datos_denunciante dd on dd.tutor_id = tt.id
        inner join Genero g on tt.genero_id = g.id
        where dd.id = idE;
	end; **
delimiter ;



