package br.gov.lavanderiasolidaria.dto.saida;
import java.time.LocalDateTime;

public record BeneficiarioSaidaDTO(
    Integer id, String nome, String telefone, String documentoIdentificacao,
    Boolean ativo, LocalDateTime dataRegistro
) {}
