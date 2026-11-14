package br.gov.lavanderiasolidaria.dto.saida;
import java.time.LocalDateTime;
import br.gov.lavanderiasolidaria.model.enums.StatusLavagem;

public record AtendimentoSaidaDTO(
    Integer id, LocalDateTime dataEntrada, Integer quantidadeRoupas,
    Double pesoKg, StatusLavagem status, LocalDateTime dataEntrega,
    String observacoes, Integer beneficiarioId, Integer agendamentoId,
    Integer usuarioRegistroId, Integer usuarioEntregaId
) {}
