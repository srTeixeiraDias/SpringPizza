package model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name= "Entrega")
@Table(name= "entregas")
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name= "data_entrega", nullable = false)
    private LocalDate dataEntrega;

    @Column(name= "hoa_entrega", nullable = false)
    private LocalTime horaEntrega;

    @Column(name= "tipo_pagamento", nullable = false)
    private String tipoPagamento;

    @Column(name= "codigo_de_entrega", nullable = false)
    private String codigoDeEntrega;



}
