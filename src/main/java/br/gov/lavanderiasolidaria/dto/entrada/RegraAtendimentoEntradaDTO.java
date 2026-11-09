package br.gov.lavanderiasolidaria.dto.entrada;
import jakarta.validation.constraints.*;

public record RegraAtendimentoEntradaDTO(
    @NotNull @Positive Double pesoMaximoKg,
    @NotNull @Positive Integer quantidadeMaximaRoupas,
    @NotNull @Positive Integer intervaloMinimoDias,
    @NotNull @Positive Integer limiteAtendimentosPorPessoa,
    @NotNull @Positive Integer vagasSimultaneasPorHorario
) {}
