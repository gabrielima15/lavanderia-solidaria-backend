package br.gov.lavanderiasolidaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "regras_atendimento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegraAtendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double pesoMaximoKg;

    private Integer quantidadeMaximaRoupas;

    private Integer intervaloMinimoDias;

    private Integer limiteAtendimentosPorPessoa;

    private Integer vagasSimultaneasPorHorario;
}