select * from tb_categoria;
select * from tb_produto;
DELETE FROM tb_produto WHERE id = 5;

INSERT INTO tb_categoria(id,descricao,nome) values (1,'Celulares e Notebook', 'Eletrônicos');
INSERT INTO tb_categoria(id,descricao,nome) values (2,'Celulares e Notebook', 'Eletrônicos');

INSERT INTO tb_produto(id,nome,status,valor,categoria_id) values (2,'Jogo: Resident Evil','COMPRADO',250,2053);
INSERT INTO tb_produto(id,nome,status,valor,categoria_id) values (3,'Jogo: Gran Turismo','NAO_COMPRADO',300,2053);
INSERT INTO tb_produto(id,nome,status,valor,categoria_id) values (4,'Jogo: Horizon: ZERO DAWN','PENDENTE',350,2053);

INSERT INTO tb_produto(id,nome,status,valor,categoria_id) values (5,'','COMPRADO',250,2053);
INSERT INTO tb_produto(id,nome,status,valor,categoria_id) values (10,'Sabonete DOVE','COMPRADO',4,2052);
DELETE FROM tb_categoria WHERE id = 2052;


INSERT INTO tb_produto(id,nome,status,valor,categoria_id) values (1,'Sony Xperia XZ1','COMPRADO', 3500,1);
INSERT INTO tb_produto(id,nome,status,valor,categoria_id) values (5,'Notebook Sony Vaio','COMPRADO', 5800,1);

UPDATE tb_produto SET valor = 350 WHERE valor = 300;

SELECT SUM(valor) AS total_comprado FROM TB_PRODUTO WHERE status = 'COMPRADO'

INSERT INTO tb_categoria(id,descricao,nome) values (15,'PNEUS', 'AUTOMÓVEL');
DELETE FROM tb_categoria WHERE id = 15;

INSERT INTO tb_produto(id,nome,status,valor,categoria_id) values (17,'PNEU MICHELLIN ARO 15','COMPRADO',300,15);
DELETE FROM tb_categoria WHERE id = 15;
DELETE FROM tb_produto WHERE id = 17;


