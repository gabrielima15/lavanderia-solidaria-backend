package br.gov.lavanderiasolidaria.dto;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BeneficiarioEntradaDTO(
        @NotBlank(message = "O nome é obrigatório.")
        String nome,

        @NotBlank(message = "O e-mail é obrigatório.")
        @Email(message = "Formato de e-mail inválido.")
        String email,

        @NotBlank(message = "O documento é obrigatório.")
        @Pattern(
                regexp = "^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11}|\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}|\\d{14})$",
                message = "Documento inválido. Informe um CPF ou CNPJ válido."
        )
        String documentoIndentificacao,

        @NotBlank(message = "O telefone é obrigatório.")
        @Pattern(
                regexp = "^\\+?[1-9]{2}\\s?9?\\d{4}-?\\d{4}$",
                message = "Telefone inválido. Utilize o formato com DDD (ex: 11988887777)."
        )
        String telefone,

        String senhaHash, // Opcional conforme solicitado

        @NotNull(message = "A indicação se o cadastro é presencial é obrigatória.")
        Boolean presencialBalcao // Suporte a cadastros presenciais no balcão

) {}
