CREATE TABLE pessoa(
  codigo SERIAL PRIMARY KEY,
  nome VARCHAR(30) NOT NULL ,
  logradouro VARCHAR(50),
  numero VARCHAR(5),
  complemento VARCHAR(20),
  bairro VARCHAR(30),
  cep VARCHAR(9),
  cidade VARCHAR(30),
  estado VARCHAR(30),
  ativo BOOLEAN NOT NULL
);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values 
('Raphael', 'Rua Presidente Campo Salles', '123', 'apt 11', 'Vila Industrial','08730-730','Mogi das Cruzes', 'São Paulo', true),
('Vinicius', 'Praça da Sé', '2001', 'apt 5', 'Vila Brasileira','02340-420','Mogi das Cruzes', 'São Paulo', true),
('Bruno Mendes', 'Rua Borges Vieira', '51', 'apt 5', 'Vila Industrial','08134-730','Mogi das Cruzes', 'São Paulo', false);
