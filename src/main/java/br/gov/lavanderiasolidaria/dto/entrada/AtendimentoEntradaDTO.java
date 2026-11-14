package br.gov.lavanderiasolidaria.dto.entrada;
import br.gov.lavanderiasolidaria.model.enums.StatusLavagem;
import jakarta.validation.constraints.*;

public record AtendimentoEntradaDTO(
    @NotNull(message = "A quantidade de roupas é obrigatória.")
    @Positive Integer quantidadeRoupas,

    @NotNull(message = "O peso é obrigatório.")
    @Positive Double pesoKg,

    @NotNull(message = "O status é obrigatório.")
    StatusLavagem status,

    @Size(max = 1000, message = "As observações devem ter no máximo 1000 caracteres.")
    String observacoes,

    @NotNull(message = "O beneficiário é obrigatório.")
    @Positive Integer beneficiarioId,

    @Positive Integer agendamentoId,

    @NotNull(message = "O usuário que registra é obrigatório.")
    @Positive Integer usuarioRegistroId
) {}
