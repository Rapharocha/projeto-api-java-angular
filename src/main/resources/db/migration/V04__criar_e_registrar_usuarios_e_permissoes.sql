CREATE TABLE usuario (
codigo SERIAL PRIMARY KEY,
nome VARCHAR(50) NOT NULL, 
email VARCHAR(50) NOT NULL, 
senha VARCHAR(150) NOT NULL
);

CREATE TABLE permissao (
codigo SERIAL PRIMARY KEY,
descricao VARCHAR(50) NOT NULL
);

CREATE TABLE usuario_permissao (
codigo_usuario INTEGER NOT NULL,
codigo_permissao INTEGER NOT NULL,
PRIMARY KEY (codigo_usuario, codigo_permissao),
FOREIGN KEY (codigo_usuario) REFERENCES usuario(codigo),
FOREIGN KEY (codigo_permissao) REFERENCES permissao(codigo)
);

INSERT INTO usuario (codigo, nome, email, senha) values 
(1, 'Administrador', 'admin@algamoney.com', '$2a$10$Lb/kcX0s2iGhA1Rz05Ik7.XLHxg2kVoKfItLZQNpWBbubFQWcSaw.'),
(2, 'Raphael Rocha', 'rapharocha@algamoney.com', '$2a$10$Q8T.jU8VVObIXyneUG4fu.k9lJekcGzD9464Jco30bKmbr77CIn/m');

INSERT INTO permissao (codigo, descricao) values (1,'ROLE_CADASTRAR_CATEGORIA'),
(2,'ROLE_PESQUISAR_CATEGORIA'),(3,'ROLE_CADASTRAR_PESSOA'),(4,'ROLE_REMOVER_PESSOA'),
(5,'ROLE_PESQUISAR_PESSOA'),(6,'ROLE_CADASTRAR_LANCAMENTO'),(7,'ROLE_REMOVER_LANCAMENTO'),
(8,'ROLE_PESQUISAR_LANCAMENTO');

--admin
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1,1),
(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8);

--user
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (2,2),(2,5),(2,8);