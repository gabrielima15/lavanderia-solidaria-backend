package br.gov.lavanderiasolidaria.dto.saida;

public record RegraAtendimentoSaidaDTO(
    Integer id, Double pesoMaximoKg, Integer quantidadeMaximaRoupas,
    Integer intervaloMinimoDias, Integer limiteAtendimentosPorPessoa,
    Integer vagasSimultaneasPorHorario
) {}
