package br.gov.lavanderiasolidaria.repository;

import br.gov.lavanderiasolidaria.model.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario,Long> {
}
