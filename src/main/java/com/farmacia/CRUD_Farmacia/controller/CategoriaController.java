package com.farmacia.CRUD_Farmacia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.farmacia.CRUD_Farmacia.model.CategoriaModel;
import com.farmacia.CRUD_Farmacia.repository.CategoriaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@PostMapping
	public ResponseEntity<CategoriaModel> create(@RequestBody CategoriaModel categoria) {
		CategoriaModel savedCategoria = categoriaRepository.save(categoria);
		return new ResponseEntity<>(savedCategoria, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<CategoriaModel>> getAll() {
		List<CategoriaModel> categorias = categoriaRepository.findAll();
		return new ResponseEntity<>(categorias, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CategoriaModel> getById(@PathVariable Long id) {
		Optional<CategoriaModel> categoria = categoriaRepository.findById(id);
		return categoria.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PutMapping("/{id}")
	public ResponseEntity<CategoriaModel> update(@PathVariable Long id, @RequestBody CategoriaModel categoria) {
		if (!categoriaRepository.existsById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		categoria.setId(id);
		CategoriaModel updatedCategoria = categoriaRepository.save(categoria);
		return new ResponseEntity<>(updatedCategoria, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		if (!categoriaRepository.existsById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		categoriaRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}