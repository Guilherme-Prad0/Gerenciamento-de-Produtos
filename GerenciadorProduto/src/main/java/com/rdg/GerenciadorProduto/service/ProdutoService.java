package com.rdg.GerenciadorProduto.service;

import com.rdg.GerenciadorProduto.models.ProdutoModel;
import com.rdg.GerenciadorProduto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll() {
        return produtoRepository.findAll();
    }

    public ProdutoModel create(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

    public void delete(Long id) {
        produtoRepository.deleteById(id);
    }

    public ProdutoModel update(Long id, ProdutoModel produtoModel) {
        ProdutoModel produto = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        produto.setNomeProduto(produtoModel.getNomeProduto());
        produto.setPrecoProduto(produtoModel.getPrecoProduto());
        produto.setEstoque(produtoModel.getEstoque());

        return produtoRepository.save(produto);
    }
    

    public ProdutoModel findById(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }
}
