package br.gov.lavanderiasolidaria.dto.entrada;
import jakarta.validation.constraints.*;

public record BeneficiarioEntradaDTO(
    @NotBlank(message = "O nome é obrigatório.")
    @Size(max = 150) String nome,

    @NotBlank(message = "O telefone é obrigatório.")
    @Pattern(
        regexp = "^(?:\\+55\\s?)?(?:\\(?[1-9][0-9]\\)?\\s?)?9?[0-9]{4}-?[0-9]{4}$",
        message = "Informe um telefone brasileiro válido."
    )
    String telefone,

    @NotBlank(message = "O documento é obrigatório.")
    @Pattern(
        regexp = "^(?:\\d{11}|\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2})$",
        message = "Informe um CPF válido, com ou sem pontuação."
    )
    String documentoIdentificacao,

    // Opcional para permitir cadastro presencial no balcão.
    // Null ou vazio são aceitos; se preenchido, exige no mínimo 8 caracteres.
    @Pattern(
        regexp = "^$|^.{8,}$",
        message = "A senha, quando informada, deve ter no mínimo 8 caracteres."
    )
    String senha,

    Boolean ativo
) {}
