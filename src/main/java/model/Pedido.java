package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name= "Pedido")
@Table(name= "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name= "data", nullable = false)
    private LocalDate data;

    @Column(name= "hora", nullable = false)
    private LocalTime hora;

    @Column(name= "quantidade_itens", nullable = false)
    private Integer quantidadeItens;

    @Column(name= "valor_total", nullable = false)
    private BigDecimal valorTotal;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "entrega_id")
    private Entrega entrega;

}
