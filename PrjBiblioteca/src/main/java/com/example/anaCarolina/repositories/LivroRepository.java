package com.example.anaCarolina.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.anaCarolina.entities.Livro;


public interface LivroRepository extends JpaRepository<Livro, Long> {

	@Query(value = "SELECT * FROM tbLivro l WHERE LOWER(l.nome) LIKE %:nome%", nativeQuery = true)
	List<Livro> buscarPorNome(@Param("nome") String nome);

}
