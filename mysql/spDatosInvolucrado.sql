
drop procedure if exists guardaDatosInvolucrado;

delimiter **
	create procedure guardaDatosInvolucrado(
	in idE int,
	in nombreI nvarchar(150),
	in dependenciaI nvarchar(50),
	in turnoI nvarchar(50)
	)
	begin 
	declare newid int;
	declare msj nvarchar(200);
	declare existeInvolucrado int;

	set newid = 0;


	if idE = 0 then
		
		set existeInvolucrado = (select count(*) from Datos_involucrado
		where nombre = nombreI);

		if ( existeInvolucrado = 0 )  then
			set newid = (select ifnull(max(id), 0) + 1 from Datos_involucrado);
			
			insert into Datos_involucrado (
				  id, nombre, dependencia_politecnico, turno
			)
				values(
					  newid, nombreI, dependenciaI, turnoI
			);            
			set msj =  'Datos del involucrado guardados con exito';
		else
			set msj = 'Ya existe un involucrado con ese nombre';
		end if;
	   
	else

	set newid = idE;

		if((select count(*) from Datos_involucrado where id = newid = 1 and nombre = nombreI = 1)) then
			set msj =  'Datos del involucrado Actualizado';
			
			update Datos_involucrado set 
				  dependencia_politecnico = dependenciaI, turno = turnoI
				where id=newid;
			
		else
			set msj =  'El involucrado no se actualizo';
		end if;
		
	end if;

	if(msj='Involucrado guardado con exito') then
		select msj as Resultado, id as id from Datos_involucrado where nombre = nombreI;
	else
		select msj as Resultado, 0 as id;
	end if;

	end; **

delimiter ;

call guardaDatosInvolucrado(
"0",  "Nombre Apellido Apellido", "Dependencia", "turno"
);
call guardaDatosInvolucrado(
"1", "Nombre Apellido Apellido", "Dependencia", "Turno"
);

select * from Datos_involucrado;

#DELETE FROM Datos_involucrado WHERE id >0;