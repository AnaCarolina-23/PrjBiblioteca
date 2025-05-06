package com.example.anaCarolina.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.anaCarolina.entities.Livro;
import com.example.anaCarolina.services.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

private final LivroService livroService;
	
	@Autowired
	public LivroController(LivroService livroService) {
		this.livroService = livroService;
	}
	
	@PostMapping
	public Livro createLivro(@RequestBody Livro livro) {
		return livroService.saveLivro(livro);
	}
	
	@GetMapping
	public List<Livro> getAllLivro(){
		return livroService.getAllLivro();
	}
	
	@GetMapping("/{id}")
	public Livro getLivro(@PathVariable Long id) {
		return livroService.findLivroByid(id);
	}
	
	@GetMapping("/buscar/{nome}")
	public List<Livro> ListarLivroPorNome(@PathVariable String nome){
		return livroService.buscarPorNome(nome);
	}
}
