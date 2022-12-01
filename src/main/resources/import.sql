create database ohreto;
use ohreto;
INSERT INTO cliente (telefono,dni,nombre, apellido, email) VALUES('00011','40820001','Rommel', 'Mercadao', 'rommelrmr@gmail.com' );
INSERT INTO cliente (telefono,dni,nombre, apellido, email) VALUES('00011','40820002','John', 'Does', 'johndos@gmail.com');
INSERT INTO cliente (telefono,dni,nombre, apellido, email) VALUES('00011','40820003','Lapa', 'Torval', 'ltorvald@gmail.com');



INSERT INTO producto (nombre, precio) VALUES('Panasonic Pantalla LCD', 259990);
INSERT INTO producto (nombre, precio) VALUES('Sony Camara digital DSC-W320B', 123490);
INSERT INTO producto (nombre, precio) VALUES('Apple shuffle', 1499990);
INSERT INTO producto (nombre, precio) VALUES('Sony Notebook', 37990);
INSERT INTO producto (nombre, precio) VALUES('Hewlett Multifuncional ', 69990);
INSERT INTO producto (nombre, precio) VALUES('Bianchi Bicicleta', 69990);
INSERT INTO producto (nombre, precio) VALUES('Mica Comoda 8 Cajones', 299990);

INSERT INTO venta (id_cliente,fecha) VALUES(1,'2022-12-01');
INSERT INTO detalle_venta (cantidad, id_venta, id_producto) VALUES(1, 1, 1);
INSERT INTO detalle_venta (cantidad, id_venta, id_producto) VALUES(2, 1, 4);
INSERT INTO detalle_venta (cantidad, id_venta, id_producto) VALUES(1, 1, 5);
INSERT INTO detalle_venta (cantidad, id_venta, id_producto) VALUES(1, 1, 7);

INSERT INTO venta (id_cliente,fecha) VALUES(1,'2022-12-01');
INSERT INTO detalle_venta (cantidad, id_venta, id_producto) VALUES(3, 2, 6);

INSERT INTO venta (id_cliente,fecha) VALUES(2,'2022-12-01');
INSERT INTO detalle_venta (cantidad, id_venta, id_producto) VALUES(3, 3, 3);
INSERT INTO venta (id_cliente,fecha) VALUES(2,'2022-12-01');
INSERT INTO detalle_venta (cantidad, id_venta, id_producto) VALUES(3, 4, 4);

INSERT INTO venta (id_cliente,fecha) VALUES(3,'2022-12-01');
INSERT INTO detalle_venta (cantidad, id_venta, id_producto) VALUES(3, 5, 2);
INSERT INTO venta (id_cliente,fecha) VALUES(3,'2022-12-01');
INSERT INTO detalle_venta (cantidad, id_venta, id_producto) VALUES(3, 6, 3);

INSERT INTO venta (id_cliente,fecha) VALUES(1,'2022-12-02');
INSERT INTO detalle_venta (cantidad, id_venta, id_producto) VALUES(3, 7, 1);
INSERT INTO venta (id_cliente,fecha) VALUES(1,'2022-12-02');
INSERT INTO detalle_venta (cantidad, id_venta, id_producto) VALUES(3, 8, 5);