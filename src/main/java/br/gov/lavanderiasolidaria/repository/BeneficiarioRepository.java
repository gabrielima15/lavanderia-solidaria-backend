package br.gov.lavanderiasolidaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.gov.lavanderiasolidaria.model.Beneficiario;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Integer> {

    boolean existsByDocumentoIdentificacao(String documentoIdentificacao);

}
