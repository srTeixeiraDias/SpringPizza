CREATE TABLE pedidos
(
    id               VARCHAR(255)           NOT NULL,
    data             date                   NOT NULL,
    hora             time WITHOUT TIME ZONE NOT NULL,
    quantidade_itens INTEGER                NOT NULL,
    valor_total      DECIMAL                NOT NULL,
    cliente_id       VARCHAR(255),
    entrega_id       VARCHAR(255),
    CONSTRAINT pk_pedidos PRIMARY KEY (id)
);

ALTER TABLE pedidos
    ADD CONSTRAINT uc_pedidos_cliente UNIQUE (cliente_id);

ALTER TABLE pedidos
    ADD CONSTRAINT uc_pedidos_entrega UNIQUE (entrega_id);

ALTER TABLE pedidos
    ADD CONSTRAINT FK_PEDIDOS_ON_CLIENTE FOREIGN KEY (cliente_id) REFERENCES clientes (id);

ALTER TABLE pedidos
    ADD CONSTRAINT FK_PEDIDOS_ON_ENTREGA FOREIGN KEY (entrega_id) REFERENCES entregas (id);