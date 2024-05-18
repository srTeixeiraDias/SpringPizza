CREATE TABLE entregas
(
    id                VARCHAR(255) NOT NULL,
    data_entrega      date,
    hoa_entrega       time WITHOUT TIME ZONE,
    tipo_pagamento    VARCHAR(255),
    codigo_de_entrega VARCHAR(255) NOT NULL,
    CONSTRAINT pk_entregas PRIMARY KEY (id)
);