package org.generation.LojaDeGame.repositories;

import org.generation.LojaDeGame.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
    public List<CategoriaModel> findAllByNomeCategoriaContainingIgnoreCase(String nomeCategoria);

}
