drop procedure if exists guardaHechos;

delimiter **
	create procedure guardaHechos(
	in idE int,
	in fechaI date,
	in lugarI nvarchar(50),
	in descripcionI nvarchar(500), 
	in testigosI nvarchar(200), 
	in mediosI int (1),
    in medios_probatorios_descripcionI nvarchar(500), 
    in otrosI nvarchar(500)
	)
	begin 
	declare newid int;
	declare msj nvarchar(200);


	set newid = 0;


	if idE = 0 then
		
		set newid = (select ifnull(max(id), 0) + 1 from Descripcion_hechos);
		
		insert into Descripcion_hechos (
			  id, fechahora, lugar, descripcion, testigos, medios_probatorios, medios_probatorios_descripcion, otros
		)
			values(
				  newid, fechaI, lugarI, descripcionI, testigosI, mediosI, medios_probatorios_descripcionI, otrosI
		);            
		set msj =  'Hechos guardados con exito';

	else

	set newid = idE;

		if((select count(*) from Descripcion_hechos where id = newid = 1)) then
			set msj =  'Datos Actualizados';
			
			update Descripcion_hechos set 
				  fechahora = fechaI, lugar = lugarI, descripcion = descripcionI, testigos = testigosI, medios_probatorios = mediosI, medios_probatorios_descripcion = medios_probatorios_descripcionI, otros = otrosI
				where id=newid;
			
		else
			set msj =  'Los hechos no se actualizaron';
		end if;
		
	end if;

	if(msj='Hechos guardados con exito') then
		select msj as Resultado, id as id from Descripcion_hechos where id = newid;
	else
		select msj as Resultado, 0 as id;
	end if;

end; **

delimiter ;

call guardaHechos(
"0", "1212/12/12 12:12:12", "Lugar",  "Descripcion", "testigo", 1, "medios_probatorios_descripcion", "otros"
);
call guardaHechos(
"1", "2112/12/12 12:12:12", "Lugar", "Descripcion", "testigo",  1, "medios_probatorios_descripcion", "otros"
);
select * from Descripcion_hechos;

# DELETE FROM Descripcion_hechos WHERE id >0;