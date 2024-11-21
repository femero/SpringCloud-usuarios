INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$cH.sqNWpsfELdvLKtn9Qz.ertM4nwj3IibLLjjOEg5Ny3nZmVgQsq',1, 'edwin', 'maravi','emaravi@cjavaperu.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$cH.sqNWpsfELdvLKtn9Qz.ertM4nwj3IibLLjjOEg5Ny3nZmVgQsq',1, 'John', 'Doe','jhon.doe@gmail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);
