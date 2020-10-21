CREATE TABLE lancamento(
codigo SERIAL PRIMARY KEY, 
descricao VARCHAR(50) NOT NULL, 
data_vencimento DATE NOT NULL, 
data_pagamento DATE, 
valor NUMERIC(10,2) NOT NULL, 
observacao VARCHAR(100),
tipo VARCHAR(20) NOT NULL, 
codigo_categoria INTEGER NOT NULL,
codigo_pessoa INTEGER NOT NULL, 

FOREIGN KEY (codigo_categoria) REFERENCES categoria(codigo),
FOREIGN KEY (codigo_pessoa) REFERENCES pessoa(codigo)
);

INSERT INTO lancamento (descricao, data_vencimento, data_pagamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa) VALUES
('Salário mensal', '2017-06-10', null, 6500.00,'Distribuição de Lucros', 'RECEITA', 11, 1),
('Bahamas', '2017-02-10', '2017-02-10', 100.32,null, 'DESPESA', 6, 3),
('Extra', '2017-03-10', '2017-03-10', 1000.32,null, 'DESPESA', 10, 4);