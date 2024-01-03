drop procedure if exists guardaDenuncia;
drop procedure if exists consultarDenunciaById;
drop procedure if exists consultarDenunciasByDate;

delimiter **
	create procedure guardaDenuncia(
	in idE int,
	in fechaI date,
	in denuncianteI int,
	in involucradoI int,
	in profesorI int,
	in hechosI int,
    in tutorI int
	)
	begin 
	declare newid int;
	declare msj nvarchar(200);


	set newid = 0;


	if idE = 0 then
		
		set newid = (select ifnull(max(id), 0) + 1 from Denuncia);
		
		insert into Denuncia (
			  id, fecha, Datos_denunciante_id, Datos_involucrado_id, Descripcion_hechos_id, Profesor_id, Tutor_id
		)
			values(
				  newid, fechaI, denuncianteI, involucradoI, hechosI, profesorI, tutorI
		);            
		set msj =  'Denuncia guardada con exito';

	else

	set newid = idE;

		if((select count(*) from Denuncia where id = newid = 1)) then
			set msj =  'Datos Actualizados';
			
			update Denuncia set 
				 fecha=fechaI, Datos_denunciante_id=denuncianteI, Datos_involucrado_id=involucradoI, Descripcion_hechos_id=hechosI, Profesor_id = profesorI, Tutor_id = tutorI
				where id=newid;
			
		else
			set msj =  'La denuncia no se actualizó';
		end if;
		
	end if;

	if(msj='Denuncia guardada con exito') then
		select msj as Resultado, id as id from Denuncia where id = newid;
	else
		select msj as Resultado, 0 as id;
	end if;

	end; **

	create procedure consultarDenunciaById(in idE int)
	begin
		select * from datosDenuncia where idDenuncia = idE;
	end; **

	create procedure consultarDenunciasByDate(in fechaI date)
	begin
		select id from Denuncia where fecha = fechaI;
	end; **
delimiter ;
