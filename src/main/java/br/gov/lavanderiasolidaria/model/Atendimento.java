package br.gov.lavanderiasolidaria.model;

import java.time.LocalDateTime;

import br.gov.lavanderiasolidaria.model.enums.StatusLavagem;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "atendimentos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDateTime dataEntrada;

    private LocalDateTime dataEntrega;

    private Integer quantidadeRoupas;

    private Double pesoKg;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private StatusLavagem status;

    @Column(columnDefinition = "TEXT")
    private String observacoes;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "beneficiario_id", nullable = false)
    private Beneficiario beneficiario;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agendamento_id")
    private Agendamento agendamento;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "responsavel_entrada_id", nullable = false)
    private Usuario responsavelEntrada;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "responsavel_entrega_id")
    private Usuario responsavelEntrega;

    @PrePersist
    public void prePersist() {
        if (this.dataEntrada == null) {
            this.dataEntrada = LocalDateTime.now();
        }
        if (this.status == null) {
            this.status = StatusLavagem.AGUARDANDO;
        }
    }
}