CREATE TABLE Usuarios(
	nombre text,
	clave varchar(6)
);
INSERT into Usuarios VALUES ('Pedro','Ped753');
INSERT into Usuarios values ('Carolina', 'c4569a');

create table Agenda(
	nombre text,
	apellido text,
	direccion text,
	telefono integer
);
insert into Agenda values('Carlos','Gutiérrez','calle 20 55 47', 123456);
INSERT into Agenda values('Pedro', 'Martínez', 'calle 95 70 80', 987654);
insert into Agenda values('Ana','Cantillo', 'Cra 58 69 74', 456123);

SELECT * from Agenda a; -- selecciona todos los campos de Agenda
select nombre from Agenda;
select nombre, direccion from Agenda;

select * from Agenda where nombre = 'Pedro'; -- =,<>,>,>,>=,<=

create table libros(
        titulo text,
        autor text,
        editorial text,
        precio real
 );

drop table libros; --borrar una tabla

create table articulos(
  codigo integer,
  nombre text,
  descripcion text,
  precio real,
  cantidad integer
 );
insert into articulos (codigo, nombre, descripcion, precio,cantidad)
  values (1,'impresora','Epson Stylus C45',400.80,20);
 insert into articulos (codigo, nombre, descripcion, precio,cantidad)
  values (2,'impresora','Epson Stylus C85',500,30);
 insert into articulos (codigo, nombre, descripcion, precio,cantidad)
  values (3,'monitor','Samsung 14',800,10);
 insert into articulos (codigo, nombre, descripcion, precio,cantidad)
  values (4,'teclado','ingles Biswal',100,50);
 insert into articulos (codigo, nombre, descripcion, precio,cantidad)
  values (5,'teclado','español Biswal',90,50);

select * from articulos a where nombre = 'impresora'; --sleccionar los registros de las impresoras
SELECT * from articulos a where precio >=400;  --selecionar los articulos cuyo precio sea mayor o igual a 400
-- selecciones codigo y nombre de los artículos cuya cantidad sea menor a 30
SELECT codigo, nombre from articulos where cantidad < 30;

delete from Usuarios; --borra todos los registros de una tabla
delete from Agenda where nombre = 'Ana';

UPDATE articulos set cantidad = 10 where codigo = 1;
update articulos set precio = precio*1.1;
update articulos set precio = 500, cantidad = 40 where codigo = 2;

--valores null
create table medicamentos (
	codigo integer not null,
	nombre text not null,
	laboratorio text,
	precio real,
	cantidad integer not null	
);

insert into medicamentos (codigo,nombre,laboratorio,precio,cantidad)
  values(1,'Sertal gotas',null,null,100); 
insert into medicamentos (codigo,nombre,laboratorio,precio,cantidad)
  values(2,'Sertal compuesto',null,8.90,150);
insert into medicamentos (codigo,nombre,laboratorio,precio,cantidad)
  values(3,'Buscapina','Roche',null,200);
insert into medicamentos values (4, 'Acetaminofén', 'MK',5000,12);

drop table medicamentos;
create table medicamentos (
	codigo integer not null,
	nombre text not null,
	laboratorio text,
	precio real,
	cantidad integer not null,	
	primary key(codigo)
);

insert into medicamentos (nombre,laboratorio,precio,cantidad)
  values('Sertal gotas',null,null,100); 
insert into medicamentos (nombre,laboratorio,precio,cantidad)
  values('Sertal compuesto',null,8.90,150);
insert into medicamentos (nombre,laboratorio,precio,cantidad)
  values('Buscapina','Roche',null,200);
 
--valor default
 create table libros(
	codigo integer primary key,
	titulo text,
	autor text not null default 'desconocido', 
	editorial text,
	precio real,
	cantidad integer default 0
 );
insert into libros (titulo, precio) values ('Algoritmos',50000);
insert into libros (titulo,autor,editorial,precio,cantidad)
  values('El aleph','Borges','Planeta',15,100);
 insert into libros (titulo,autor,editorial,precio,cantidad)
  values('Martin Fierro','Jose Hernandez','Emece',22.20,200);
--columnas calculadas
 select titulo, precio, cantidad, precio*cantidad as precio_total from libros;
select titulo, precio, precio-precio*0.05 as descuento_5 from libros;
select titulo||'-'||autor||'-'||editorial from libros;
--order by
select * from libros l;
select * from libros order by precio;
select * from libros order by precio DESC;
select * from libros order by 3 desc;
select codigo, titulo from libros order by precio;
select titulo, precio, precio-precio*0.05 as descuento_5 
from libros 
order by descuento_5;
select * from medicamentos m ;
-- and, or, not
select * from libros where(autor = 'Borges')and (codigo = 2);
-- funciones de agregado (count)
select count(*) from libros;
SELECT count(*) from libros where autor = 'Borges';
select count(editorial) from libros;--cuenta todos los registros que no tengan null en este campo
-- sum, min, max y avg 
select max(precio) from libros;
select sum(cantidad) from libros;


 insert into libros (titulo, autor, editorial, precio)
  values('El aleph', 'Borges', 'Emece', null);
 insert into libros (titulo, autor, editorial, precio)
  values('Antología poética', 'Borges', 'Planeta', 39.50);
 insert into libros (titulo, autor, editorial, precio)
  values('Java en 10 minutos', 'Mario Molina', 'Planeta', 50.50);
 insert into libros (titulo, autor, editorial, precio)
  values('Alicia en el pais de las maravillas', 'Lewis Carroll', 'Emece', 19.90);
 insert into libros (titulo, autor, editorial, precio)
  values('Martin Fierro', 'Jose Hernandez', 'Emece', 25.90);
 insert into libros (titulo, autor, editorial, precio)
  values('Martin Fierro', 'Jose Hernandez', 'Paidos', 16.80);
 insert into libros (titulo, autor, editorial, precio)
  values('Aprenda PHP', 'Mario Molina', 'Emece', 19.50);
 insert into libros (titulo, autor, editorial, precio)
  values('Cervantes y el quijote','Borges', 'Paidos', 18.40);

select count(*) from libros where editorial = 'Planeta';
select count(*) from libros where editorial  = 'Emece';


--group by
select * from libros

select editorial, count(*) from libros GROUP by editorial;
select editorial, count(precio) from libros group by editorial;
select editorial, max(precio) as mayor, min(precio) as menor from libros group by editorial;
select editorial, autor, count(*) FROM libros group by editorial, autor order by autor;

--having
select editorial, count(*) from libros GROUP by editorial;
select editorial, count(*) from libros group by editorial HAVING count(*)>3;
select editorial, avg(precio) from libros group by editorial HAVING AVG(precio)<25 ;

select editorial, count(*) from libros group by editorial HAVING editorial<> 'Paidos';
select editorial, count(*) from libros WHERE editorial<>'Paidos' GROUP  by editorial;

drop table libros;
drop table if exists editoriales; 
create table libros(
	codigo integer primary key,
	titulo text,
	autor text, 
	precio real,
	codigoeditorial integer,
	foreign key (codigoeditorial) references editoriales(codigo)
);
create table editoriales(
	codigo integer primary key,
	nombre text
);

insert into editoriales(nombre) values('Planeta');
 insert into editoriales(nombre) values('Emece');
 insert into editoriales(nombre) values('Siglo XXI');

 insert into libros (titulo, autor, codigoeditorial, precio)
  values('El aleph', 'Borges', 2, 34);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Antología poética', 'Borges', 1, 39.50);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Java en 10 minutos', 'Mario Molina', 1, 50.50);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Alicia en el pais de las maravillas', 'Lewis Carroll', 2, 19.90);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Martin Fierro', 'Jose Hernandez', 2, 25.90);
 insert into libros (titulo, autor, codigoeditorial, precio)
  values('Martin Fierro', 'Jose Hernandez', 3, 16.80);
 
 select * from libros
join editoriales on libros.codigoeditorial = editoriales.codigo;

SELECT l.codigo, l.titulo, l.autor, e.nombre from libros l 
join editoriales e  on l.codigoeditorial = e.codigo;



