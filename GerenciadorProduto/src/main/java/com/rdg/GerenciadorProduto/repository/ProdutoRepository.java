package com.rdg.GerenciadorProduto.repository;

import com.rdg.GerenciadorProduto.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
