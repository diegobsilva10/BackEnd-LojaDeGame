package org.generation.LojaDeGame.repositories;


import org.generation.LojaDeGame.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
    public List<ProdutoModel> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
}
