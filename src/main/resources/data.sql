DROP table IF EXISTS Empleados;
DROP table IF EXISTS Departamentos;

create table Departamentos(
    codigo int auto_increment,
    nombre varchar(100),
    presupuesto int,
    PRIMARY KEY (codigo)
);

create table Empleados(
    dni varchar(8),
    nombre varchar(100),
    apellido varchar(255),
    codigoDepartamento int,
    PRIMARY KEY (dni),
    FOREIGN KEY (codigoDepartamento) REFERENCES Departamentos(codigo)
);

insert into Departamentos (nombre, presupuesto)values('dep01', 10000);
insert into Departamentos (nombre, presupuesto)values('dep02', 5000);
insert into Departamentos (nombre, presupuesto)values('dep03', 7500);

insert into Empleados (dni, nombre, apellido, codigoDepartamento)values('12345678', 'Maribel','Peña', 1);
insert into Empleados (dni, nombre, apellido, codigoDepartamento)values('23456781', 'Arnau','Salcedo', 2);
insert into Empleados (dni, nombre, apellido, codigoDepartamento)values('34567812', 'Jose-Pablo','Asensio', 1);