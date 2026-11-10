package br.gov.lavanderiasolidaria.dto;

import java.time.LocalDateTime;

public record BeneficiarioSaidaDTO(
        Long id,
        String nome,
        String email,
        String documentoIndentificacao,
        String telefone,
        Boolean presencialBalcao,
        boolean isAtivo,
        LocalDateTime dataRegistro
) {
}
