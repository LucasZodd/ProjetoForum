package br.com.lucas.forum.repository;

import br.com.lucas.forum.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {


    Curso findByNome(String nome);
}
