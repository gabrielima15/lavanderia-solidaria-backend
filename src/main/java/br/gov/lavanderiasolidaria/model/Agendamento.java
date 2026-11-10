package br.gov.lavanderiasolidaria.model;

import br.gov.lavanderiasolidaria.model.enuns.StatusAgendamento;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_agendamento")
@NoArgsConstructor
@Getter
@Setter
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_hora_inicio")
    private LocalDateTime dataHoraInicio;

    @Column(name = "data_hora_fim")
    private LocalDateTime dataHoraFim;

    private StatusAgendamento statusAgendamento;

}
