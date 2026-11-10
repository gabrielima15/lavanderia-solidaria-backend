package br.gov.lavanderiasolidaria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_benenficaria")
@NoArgsConstructor
@Setter
@Getter

public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "documento_indentificacao")
    private String documentoIndentificacao;

    @Column(name = "senha_hash")
    private String senhaHash;

    @Column(name = "is_ativo")
    private boolean isAtivo;

    @Column(name = "data_registro")
    private LocalDateTime dataRegistro;

    public Beneficiario(LocalDateTime dataRegistro, String documentoIndentificacao,boolean isAtivo, String nome, String senhaHash, String telefone) {
        this.dataRegistro = dataRegistro;
        this.documentoIndentificacao = documentoIndentificacao;
        this.isAtivo = isAtivo;
        this.nome = nome;
        this.senhaHash = senhaHash;
        this.telefone = telefone;
    }
}
