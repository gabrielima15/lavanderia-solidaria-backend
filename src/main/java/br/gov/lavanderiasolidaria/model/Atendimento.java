package br.gov.lavanderiasolidaria.model;

import br.gov.lavanderiasolidaria.model.enuns.StatusLavagem;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(schema = "tb_Atendimento")
@NoArgsConstructor
@Getter
@Setter
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dara_entrada")
    private LocalDateTime dataEntrada;

    @Column(name = "status_lavagem")
    private StatusLavagem statusLavagem;

    @Column(name = "peso_kg")
    private double pesoKg;

    @Column(name = "qtde_roupa")
    private Integer quantidadeRoupas;

    @Column(name = "data_entrega")
    private LocalDateTime dataEntrega;

    @Column(name = "observacao")
    private String observacoes;


}
