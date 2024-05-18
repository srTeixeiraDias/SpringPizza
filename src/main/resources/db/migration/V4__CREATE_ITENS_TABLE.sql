CREATE TABLE itens
(
    id             VARCHAR(255) NOT NULL,
    descricao      VARCHAR(255) NOT NULL,
    preco_unitario DECIMAL      NOT NULL,
    quantidade     INTEGER      NOT NULL,
    pedido_id      VARCHAR(255),
    CONSTRAINT pk_itens PRIMARY KEY (id)
);

ALTER TABLE itens
    ADD CONSTRAINT FK_ITENS_ON_PEDIDO FOREIGN KEY (pedido_id) REFERENCES pedidos (id);