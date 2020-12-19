package io.github.rebecalopes.cursomc.service;

import io.github.rebecalopes.cursomc.domain.Categoria;
import io.github.rebecalopes.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria buscar(Integer id){
        Categoria objeto = repository.findOne(id);
                return objeto;

    }
}
