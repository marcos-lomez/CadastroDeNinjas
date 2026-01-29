-- V2 Migrations para adiconar a coluna de Rank na tabela de cadastros
ALTER  TABLE tb_cadastro
ADD COLUMN  rank varchar(255);
