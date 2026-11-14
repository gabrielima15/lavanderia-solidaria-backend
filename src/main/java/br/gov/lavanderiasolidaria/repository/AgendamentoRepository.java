package br.gov.lavanderiasolidaria.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.gov.lavanderiasolidaria.model.Agendamento;
import br.gov.lavanderiasolidaria.model.enums.StatusAgendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {

    List<Agendamento> findByStatus(StatusAgendamento status);

    List<Agendamento> findByDataHoraInicioBetween(
        LocalDateTime inicio,
        LocalDateTime fim
    );

}
