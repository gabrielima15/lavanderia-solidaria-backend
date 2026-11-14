package br.gov.lavanderiasolidaria.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.gov.lavanderiasolidaria.model.Atendimento;
import br.gov.lavanderiasolidaria.model.enums.StatusLavagem;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Integer> {

    List<Atendimento> findByStatus(StatusLavagem status);

}
