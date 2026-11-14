package br.gov.lavanderiasolidaria.dto.entrada;
import br.gov.lavanderiasolidaria.model.enums.TipoUsuario;
import jakarta.validation.constraints.*;

public record UsuarioEntradaDTO(
    @NotBlank(message = "O nome é obrigatório.")
    @Size(max = 150) String nome,
    @NotBlank(message = "O e-mail é obrigatório.")
    @Email(message = "Informe um e-mail válido.")
    @Size(max = 150) String email,
    @NotBlank(message = "A senha é obrigatória.")
    @Size(min = 8, message = "A senha deve ter no mínimo 8 caracteres.")
    String senha,
    @NotNull(message = "O perfil é obrigatório.") TipoUsuario perfil,
    Boolean ativo
) {}
