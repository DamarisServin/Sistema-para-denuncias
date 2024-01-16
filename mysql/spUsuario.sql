drop procedure if exists guardaUsuario;
drop procedure if exists consultarUsuarioById;
drop procedure if exists sesionUsuario;
drop procedure if exists cambiarContrasena;

delimiter **
	create procedure guardaUsuario(
	in idE int,
	in email nvarchar(150),
	in nombreI nvarchar(50),
	in escuelaI nvarchar(50),
	in no_poliI nvarchar(50),
	in psw nvarchar(50),
    in rolI nvarchar(50)
	)
	begin 
	declare newid int;
	declare msj nvarchar(200);
	declare existeCorreo int;

	set newid = 0;

	if idE = 0 then
		
		set existeCorreo = (select count(*) from Usuario where correo = email);

		if ( existeCorreo = 0 )  then
			set newid = (select ifnull(max(id), 0) + 1 from Usuario);
			
			insert into Usuario (
				id, correo, nombre, escuela, no_poli, contrasena, rol
			)
				values(newid, email, nombreI, escuelaI, no_poliI, md5(psw), rolI
			);            
			set msj =  'Usuario guardado con exito';
		else
			set msj = 'Ya existe un usuario con ese correo';
		end if;
	   
	else

	set newid = idE;

		if((select count(*) from Usuario where id = newid = 1  and correo = email = 1)) then
			set msj =  'Usuario Actualizado';
			
			update Usuario set 
				nombre = nombreI, escuela=escuelaI, no_poli=no_poliI, contrasena=md5(psw), rol=rolI where id=newid;
			
		else
			set msj =  'El usuario no se actualizo';
		end if;
		
	end if;

	if(msj='Usuario guardado con exito') then
		select msj as Resultado, id as id from Usuario where nombre = nombreI and correo = email;
	else
		select msj as Resultado, 0 as id;
	end if;

	end; **

	create procedure consultarUsuarioById(in idE int)
	begin
		select * from Usuario where id = idE;
	end; **
    
    create procedure sesionUsuario(in email nvarchar(150), in psw  nvarchar(50))
	begin
	declare existe int;
	declare msj nvarchar(200);
	declare idUsur int;

	set existe = (select count(*) from Usuario where correo = email and contrasena = md5(psw));
	if (existe = 1) then

		set msj = 'Usuario encontrado';
		select id as idUsur, msj from Usuario where correo = email and contrasena = md5(psw);
	else
		set msj = 'No se inicio sesion';
		select 0 as idUsur, msj;
		
	end if;
	end; **
    
    
    create procedure cambiarContrasena(in email nvarchar(150), in psw nvarchar(50) )
	begin
	declare aux int;
    set aux = (select id from Usuario where correo = email);
		update Usuario set 
				contrasena=md5(psw) where correo=email and id = aux;
	end; **
delimiter ;




