package com.farmacia.CRUD_Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.farmacia.CRUD_Farmacia.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

	public List<ProdutoModel> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
