package com.example.anaCarolina.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.anaCarolina.controllers.LivroController;
import com.example.anaCarolina.entities.Livro;
import com.example.anaCarolina.repositories.LivroRepository;

@Service
public class LivroService {

private final LivroRepository livroRepository;
	
	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	
	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}
	
	public Livro findLivroByid(Long id) {
		Optional<Livro> livro = livroRepository.findById(id);
		return livro.orElse(null);
	}
	
	public List<Livro> getAllLivro(){
		return livroRepository.findAll();
	}
	
}
