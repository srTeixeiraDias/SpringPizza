CREATE TABLE clientes
(
    id                VARCHAR(255) NOT NULL,
    nome              VARCHAR(255) NOT NULL,
    telefone          VARCHAR(255) NOT NULL,
    endereco          VARCHAR(255) NOT NULL,
    codigo_de_entrega VARCHAR(255) NOT NULL,
    CONSTRAINT pk_clientes PRIMARY KEY (id)
);