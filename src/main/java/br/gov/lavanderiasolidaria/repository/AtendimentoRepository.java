package br.gov.lavanderiasolidaria.repository;

import br.gov.lavanderiasolidaria.model.Atendimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoRepository extends JpaRepository<Atendimento,Long> {
}
