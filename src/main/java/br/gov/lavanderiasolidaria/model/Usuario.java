package br.gov.lavanderiasolidaria.model;

import br.gov.lavanderiasolidaria.model.enuns.TIpoUsuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.EmbeddedColumnNaming;

@Getter
@Setter
@Entity
@Table(name = "")
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senhaHash;

    private TIpoUsuario tIpoUsuario;

    @Column(name = "ativo")
    private boolean isAtivo;

    public Usuario(String nome, String email, String senhaHash, TIpoUsuario tIpoUsuario, boolean isAtivo) {
        this.nome = nome;
        this.email = email;
        this.senhaHash = senhaHash;
        this.tIpoUsuario = tIpoUsuario;
        this.isAtivo = isAtivo;
    }
}
