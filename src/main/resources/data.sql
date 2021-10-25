/* CURSO */
INSERT INTO curso(id, nombre) VALUES(10001, 'POO');
INSERT INTO curso(id, nombre) VALUES(10002, 'Programación I');
INSERT INTO curso(id, nombre) VALUES(10003, 'Programación II');

/* LIBRETA */
INSERT INTO libreta(id, registro) VALUES(30001, 'A123456');
INSERT INTO libreta(id, registro) VALUES(30002, 'B123456');
INSERT INTO libreta(id, registro) VALUES(30003, 'C123456');

/* ESTUDIANTE */
INSERT INTO estudiante(id, nombre, apellido, libreta_id) VALUES(20001, 'Fernando', 'Orellana', 30001);
INSERT INTO estudiante(id, nombre, apellido, libreta_id) VALUES(20002, 'Carolina', 'Carmona', 30002);
INSERT INTO estudiante(id, nombre, apellido, libreta_id) VALUES(20003, 'Candela', 'Di Marco', 30003);

/* COMENTARIO */
INSERT INTO comentario(id, valoracion, descripcion, curso_id) VALUES(40001, 5, 'Excelente', 10001);
INSERT INTO comentario(id, valoracion, descripcion, curso_id) VALUES(40002, 4, 'Muy bueno', 10001);
INSERT INTO comentario(id, valoracion, descripcion, curso_id) VALUES(40003, 3, 'Regular', 10003);

/* ESTUDIANTE - CURSO */
INSERT INTO estudiante_curso(estudiante_id, curso_id) VALUES(20001, 10001);
INSERT INTO estudiante_curso(estudiante_id, curso_id) VALUES(20002, 10001);
INSERT INTO estudiante_curso(estudiante_id, curso_id) VALUES(20002, 10002);