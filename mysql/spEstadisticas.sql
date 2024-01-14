drop procedure if exists datosTotales;
drop procedure if exists datosSemestrales;
drop procedure if exists datosBimestrales;

delimiter **

create procedure datosTotales()
	begin 

	select 
		count(*) as total, 
        count(if (edadDenunciante<18,1,null)) as menores,
        count(if (generoDenunciante="Femenino",1,null))  as femenino, 
        count(if (generoDenunciante="Masculino",1,null)) as masculino,
        count(if (anonimoDenunciante=1,1,null)) as anonimos,
        count(if (ocupacionDenunciante="Alumno",1,null)) as alumno,
        count(if (ocupacionDenunciante="Trabajador",1,null)) as trabajador,
        count(if (mediosHechos=1,1,null)) as medios,
        count(testigosHechos) as testigos,
        count(distinct unidadDenunciante) as unidades

        from datosDenuncia;
	end; **


create procedure datosSemestrales()
	begin 

	select 
		count(*) as total, 
        count(if (edadDenunciante<18,1,null)) as menores,
        count(if (generoDenunciante="Femenino",1,null))  as femenino, 
        count(if (generoDenunciante="Masculino",1,null)) as masculino,
        count(if (anonimoDenunciante=1,1,null)) as anonimos,
        count(if (ocupacionDenunciante="Alumno",1,null)) as alumno,
        count(if (ocupacionDenunciante="Trabajador",1,null)) as trabajador,
        count(if (mediosHechos=1,1,null)) as medios,
        count(testigosHechos) as testigos,
        count(distinct unidadDenunciante) as unidades

        from datosDenuncia 
        where fechaDenuncia > curdate()- interval(dayofmonth(curdate())-1) day - interval 6 month;
        
	end; **
    
    create procedure datosBimestrales()
	begin 

	select 
		count(*) as total, 
        count(if (edadDenunciante<18,1,null)) as menores,
        count(if (generoDenunciante="Femenino",1,null))  as femenino, 
        count(if (generoDenunciante="Masculino",1,null)) as masculino,
        count(if (anonimoDenunciante=1,1,null)) as anonimos,
        count(if (ocupacionDenunciante="Alumno",1,null)) as alumno,
        count(if (ocupacionDenunciante="Trabajador",1,null)) as trabajador,
        count(if (mediosHechos=1,1,null)) as medios,
        count(testigosHechos) as testigos,
        count(distinct unidadDenunciante) as unidades

        from datosDenuncia 
        where fechaDenuncia > curdate()- interval(dayofmonth(curdate())-1) day - interval 2 month;
	end; **
    
delimiter ;

