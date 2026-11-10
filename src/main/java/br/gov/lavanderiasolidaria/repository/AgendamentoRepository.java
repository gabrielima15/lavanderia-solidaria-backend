package br.gov.lavanderiasolidaria.repository;

import br.gov.lavanderiasolidaria.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento,Long> {
}
