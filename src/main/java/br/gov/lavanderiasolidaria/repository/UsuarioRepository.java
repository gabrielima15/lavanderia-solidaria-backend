package br.gov.lavanderiasolidaria.repository;

import br.gov.lavanderiasolidaria.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
