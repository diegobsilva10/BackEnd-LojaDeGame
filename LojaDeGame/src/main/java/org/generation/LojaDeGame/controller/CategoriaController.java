package org.generation.LojaDeGame.controller;


import org.generation.LojaDeGame.model.CategoriaModel;
import org.generation.LojaDeGame.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    CategoriaRepository CRepository;

    @GetMapping
    public ResponseEntity<List<CategoriaModel>> getAllCategorias(){
        List<CategoriaModel> categoriaList = CRepository.findAll();
        if(categoriaList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<List<CategoriaModel>>(categoriaList, HttpStatus.OK);
        }
    }
    @GetMapping(path = {"/{id}"})
    public ResponseEntity findById(@PathVariable long id){
        return CRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<CategoriaModel> post (@RequestBody CategoriaModel categoriaModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(CRepository.save(categoriaModel));
    }
    @PutMapping(value="/{id}")
    public ResponseEntity update(@PathVariable("id") long id,
                                 @RequestBody CategoriaModel categoriaModel) {
        return CRepository.findById(id)
                .map(record -> {
                    record.setNomeCategoria(categoriaModel.getNomeCategoria());
                    record.setDescricaoCategoria(categoriaModel.getDescricaoCategoria());
                    CategoriaModel updated = CRepository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity <?> delete(@PathVariable long id) {
        return CRepository.findById(id)
                .map(record -> {
                    CRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

}
