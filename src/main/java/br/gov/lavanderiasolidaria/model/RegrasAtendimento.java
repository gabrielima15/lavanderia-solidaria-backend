package br.gov.lavanderiasolidaria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tools.jackson.databind.annotation.EnumNaming;

@Entity
@Table(schema = "tb_regra_atendimento")
@NoArgsConstructor
@Getter
@Setter
public class RegrasAtendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="peso_maximo_kg")
    private double pesoMaximoKg;

    @Column(name = "qtde_maxima_roupa")
    private Integer quantidadeMaximaRoupa;

    @Column(name = "intervalo_minimo_dias")
    private Integer intervaloMinimoDias;

    @Column(name = "limite_atendimentos_pessoas")
    private Integer limiteAtendimentosPessoas;

    @Column(name = "vagas_simultanea_por_hora")
    private Integer vagasSimultaneaHora;

    public RegrasAtendimento(Integer intervaloMinimoDias,
                             Integer limiteAtendimentosPessoas, double pesoMaximoKg,
                             Integer quantidadeMaximaRoupa, Integer vagasSimultaneaHora) {

        this.intervaloMinimoDias = intervaloMinimoDias;
        this.limiteAtendimentosPessoas = limiteAtendimentosPessoas;
        this.pesoMaximoKg = pesoMaximoKg;
        this.quantidadeMaximaRoupa = quantidadeMaximaRoupa;
        this.vagasSimultaneaHora = vagasSimultaneaHora;
    }
}
