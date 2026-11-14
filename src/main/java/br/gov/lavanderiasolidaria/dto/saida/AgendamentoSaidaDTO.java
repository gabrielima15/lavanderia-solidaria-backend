package br.gov.lavanderiasolidaria.dto.saida;

import java.time.LocalDateTime;
import br.gov.lavanderiasolidaria.model.enums.StatusAgendamento;

public record AgendamentoSaidaDTO(
    Integer id, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
    StatusAgendamento status, LocalDateTime criadoEm,
    Integer beneficiarioId, Integer usuarioId
) {}