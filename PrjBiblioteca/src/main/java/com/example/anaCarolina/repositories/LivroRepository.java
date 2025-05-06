package com.example.anaCarolina.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.anaCarolina.entities.Livro;


public interface LivroRepository extends JpaRepository<Livro, Long> {

}