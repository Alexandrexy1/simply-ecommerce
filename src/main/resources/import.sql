INSERT INTO tb_category(name) VALUES ('Livros');
INSERT INTO tb_category(name) VALUES ('Eletrônicos');
INSERT INTO tb_category(name) VALUES ('Computadores');

INSERT INTO tb_product(name, description, price, image_url) VALUES ('Harry Potter', 'Um livro muito bom', 49.30, 'harry_potter.png');
INSERT INTO tb_product(name, description, price, image_url) VALUES ('Senhor dos Aneis', 'Lorem ipsum', 30.10, 'senhor_dos_aneis.png');
INSERT INTO tb_product(name, description, price, image_url) VALUES ('PC Gamer', 'Lorem ipsum', 1900, 'pcgamer.png');
INSERT INTO tb_product(name, description, price, image_url) VALUES ('Macbook Air', 'Lorem ipsum', 4800, 'macbook.png');
INSERT INTO tb_product(name, description, price, image_url) VALUES ('Headphone', 'Lorem ipsum', 130, 'headphone.png');

INSERT INTO tb_product_category(product_id, category_id) VALUES (1, 1);
INSERT INTO tb_product_category(product_id, category_id) VALUES (2, 1);
INSERT INTO tb_product_category(product_id, category_id) VALUES (3, 3);
INSERT INTO tb_product_category(product_id, category_id) VALUES (4, 3);
INSERT INTO tb_product_category(product_id, category_id) VALUES (5, 2);

INSERT INTO tb_user(name, email, phone, password, birth_date) VALUES ('Alex Will', 'alex@test.com', '99993333', '123456', '1993-10-12');
INSERT INTO tb_user(name, email, phone, password, birth_date) VALUES ('Maria Lemon', 'maria@test.com', '33339999', '123456', '2001-12-01');

INSERT INTO tb_order(moment, status, client_id) VALUES (TIMESTAMP WITH TIME ZONE '2025-07-20T12:00:00Z', 1, 2);
INSERT INTO tb_order(moment, status, client_id) VALUES (TIMESTAMP WITH TIME ZONE '2025-07-21T15:30:00Z', 3, 1);
INSERT INTO tb_order(moment, status, client_id) VALUES (TIMESTAMP WITH TIME ZONE '2025-07-23T09:00:00Z', 1, 1);

INSERT INTO tb_order_item (order_id, product_id, quantity, price) VALUES (1, 2, 1, 30.10);

INSERT INTO tb_payment(order_id, moment) VALUES (1, TIMESTAMP WITH TIME ZONE '2025-07-20T12:05:00Z');
INSERT INTO tb_payment(order_id, moment) VALUES (2, TIMESTAMP WITH TIME ZONE '2025-07-21T15:33:00Z');