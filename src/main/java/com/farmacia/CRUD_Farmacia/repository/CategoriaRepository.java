package com.farmacia.CRUD_Farmacia.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.farmacia.CRUD_Farmacia.model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {

	public List<CategoriaModel> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}
