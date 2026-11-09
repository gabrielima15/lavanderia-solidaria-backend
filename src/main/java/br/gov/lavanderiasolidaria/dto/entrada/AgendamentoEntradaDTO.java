package br.gov.lavanderiasolidaria.dto.entrada;

import java.time.LocalDateTime;
import br.gov.lavanderiasolidaria.model.enums.StatusAgendamento;
import jakarta.validation.constraints.*;

public record AgendamentoEntradaDTO(
    @NotNull(message = "A data/hora inicial é obrigatória.")
    @Future(message = "O início deve estar no futuro.")
    LocalDateTime dataHoraInicio,

    @NotNull(message = "A data/hora final é obrigatória.")
    @Future(message = "O fim deve estar no futuro.")
    LocalDateTime dataHoraFim,

    @NotNull(message = "O status é obrigatório.")
    StatusAgendamento status,

    @NotNull(message = "O beneficiário é obrigatório.")
    @Positive Integer beneficiarioId,

    @NotNull(message = "O usuário responsável é obrigatório.")
    @Positive Integer usuarioId
) {}
