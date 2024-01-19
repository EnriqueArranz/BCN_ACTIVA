


USE universidad;

SELECT apellido1, apellido2, nombre FROM persona WHERE tipo = "alumno" ORDER BY apellido1, apellido2, nombre;
SELECT apellido1, apellido2, nombre FROM persona WHERE tipo = "alumno" AND telefono IS NULL;
SELECT * FROM persona  WHERE  tipo = 'alumno' AND YEAR(fecha_nacimiento) = 1999;
SELECT * FROM persona  WHERE tipo = 'profesor' AND telefono IS NULL AND nif LIKE '%k';
SELECT * FROM asignatura WHERE cuatrimestre = 1 AND curso = 3 AND id_grado = 7;
SELECT p.apellido1, p.apellido2, p.nombre, d.nombre AS nombre_departamento FROM persona p JOIN profesor f ON p.id = f.id_profesor JOIN departamento d ON f.id_departamento = d.id  ORDER BY p.apellido1, p.apellido2, p.nombre;
SELECT a.nombre, c.anyo_inicio, c.anyo_fin FROM asignatura a JOIN alumno_se_matricula_asignatura m ON m.id_asignatura = a.id JOIN curso_escolar c ON c.id = m.id_curso_escolar JOIN persona p ON p.id = m.id_alumno WHERE p.nif = '26902806M';
SELECT DISTINCT d.nombre FROM departamento d JOIN profesor p ON d.id = p.id_departamento JOIN asignatura a ON p.id_profesor = a.id_profesor JOIN grado g ON a.id_grado = g.id WHERE g.nombre = 'Grado en Ingeniería Informática (Plan 2015)';
SELECT DISTINCT p.* FROM persona p JOIN alumno_se_matricula_asignatura m ON p.id = m.id_alumno JOIN curso_escolar c ON m.id_curso_escolar = c.id WHERE c.anyo_inicio = '2018' AND c.anyo_fin = '2019';
SELECT d.nombre AS departamento, p.apellido1 AS primer_apellido, apellido2 AS segundo_apellido, p.nombre AS nombre FROM persona p JOIN profesor f ON p.id = f.id_profesor LEFT JOIN departamento d ON f.id_departamento = d.id ORDER BY d.nombre, p.apellido1, p.apellido2, p.nombre;
SELECT p.* FROM persona p JOIN profesor f ON p.id = f.id_profesor LEFT JOIN departamento d ON f.id_departamento = d.id WHERE d.id IS NULL;
SELECT d.* FROM departamento d LEFT JOIN profesor p ON p.id_departamento = d.id WHERE p.id_departamento IS NULL;
SELECT p.* FROM persona p JOIN profesor f ON p.id = f.id_profesor LEFT JOIN asignatura a ON f.id_profesor = a.id_profesor WHERE a.id_profesor IS NULL ;
SELECT a.* FROM asignatura a LEFT JOIN profesor p ON a.id_profesor = p.id_profesor WHERE p.id_profesor IS NULL;
SELECT d.* FROM departamento d LEFT JOIN profesor p ON d.id = p.id_departamento LEFT JOIN asignatura a ON p.id_profesor = a.id_profesor LEFT JOIN grado g ON a.id_grado = g.id WHERE p.id_departamento IS NULL;
SELECT COUNT(*) AS cantidad_alumnos FROM persona WHERE tipo = 'alumno';
SELECT COUNT(*) AS cantidad_alumnos FROM persona WHERE tipo = 'alumno' AND YEAR(fecha_nacimiento) = 1999;
SELECT d.nombre AS nombre_departamento, COUNT(p.id_profesor) AS cantidad_profesores FROM departamento d JOIN profesor p ON d.id = p.id_departamento GROUP BY p.id_departamento ORDER BY COUNT(p.id_profesor) DESC;
SELECT d.nombre AS nombre_departamento, COUNT(p.id_profesor) AS cantidad_profesores FROM departamento d LEFT JOIN profesor p ON d.id = p.id_departamento GROUP BY d.nombre;
SELECT g.nombre AS nombre_grado, COUNT(a.id) AS cantidad_asignaturas FROM grado g LEFT JOIN asignatura a ON g.id = a.id_grado GROUP BY g.nombre ORDER BY COUNT(a.id) DESC;
SELECT g.nombre AS nombre_grado, COUNT(a.id) AS cantidad_asignaturas FROM grado g LEFT JOIN asignatura a ON g.id = a.id_grado GROUP BY g.nombre HAVING COUNT(a.id)>40;

USE tienda;

SELECT nombre FROM producto;
SELECT nombre, precio FROM producto;
SELECT * FROM producto;
SELECT nombre, precio, ROUND(precio*1.05, 2) FROM producto;
SELECT nombre AS nom_de_producto, precio AS euros, ROUND(precio*1.05) AS dòlars FROM producto;
SELECT UCASE(nombre), precio FROM producto;
SELECT LCASE(nombre), precio FROM producto;
SELECT nombre, UCASE(LEFT(nombre,2)) AS nombre_con_dos_mayúsculas FROM fabricante;
SELECT nombre, ROUND(precio,0) AS precio_redondeado FROM producto;
SELECT nombre, TRUNCATE(precio,0) AS precio_truncado FROM producto;
SELECT codigo_fabricante FROM producto;
SELECT DISTINCT codigo_fabricante FROM producto;
SELECT nombre FROM fabricante ORDER BY nombre;
SELECT nombre FROM fabricante ORDER BY nombre DESC;
SELECT nombre FROM producto ORDER BY nombre, precio DESC;
SELECT * FROM fabricante LIMIT 5;
SELECT * FROM fabricante LIMIT 3,2;
SELECT nombre, precio FROM producto ORDER BY precio LIMIT 1;
SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1;