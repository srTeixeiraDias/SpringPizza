CREATE TABLE entregas
(
    id                VARCHAR(255)           NOT NULL,
    data_entrega      date                   NOT NULL,
    hoa_entrega       time WITHOUT TIME ZONE NOT NULL,
    tipo_pagamento    VARCHAR(255)           NOT NULL,
    codigo_de_entrega VARCHAR(255)           NOT NULL,
    CONSTRAINT pk_entregas PRIMARY KEY (id)
);