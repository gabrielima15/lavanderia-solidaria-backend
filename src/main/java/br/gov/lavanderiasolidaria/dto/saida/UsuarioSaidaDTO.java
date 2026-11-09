package br.gov.lavanderiasolidaria.dto.saida;

import br.gov.lavanderiasolidaria.model.enums.TipoUsuario;

public record UsuarioSaidaDTO(
    Integer id, String nome, String email, TipoUsuario perfil, Boolean ativo
) {}
