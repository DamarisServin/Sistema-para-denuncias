drop procedure if exists getCentros;
drop procedure if exists getEspecialidadById;

delimiter **
    create procedure getCentros()
	begin
		SELECT *
			FROM Centro_de_ayuda c;
	end; **
    
	create procedure getEspecialidadById(in idI int)
	begin
		SELECT e.nombre
			FROM Especialidad e
            INNER JOIN CentroEspecialidad ce
			ON e.id = ce.especialidad_id
            WHERE ce.centro_id = idI;
	end; ** 
    
delimiter ;



-- CREATE VIEW InfoCentros AS 
-- SELECT c.nombre,c.direccion, c.contacto, e.nombre
-- 	FROM Centro_de_ayuda c
-- 	INNER JOIN CentroEspecialidad ce
-- 	ON c.id = ce.centro_id
-- 	INNER JOIN Especialidad e
-- 	ON e.id = ce.especialidad_id;