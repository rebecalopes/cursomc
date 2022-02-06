package io.github.rebecalopes.cursomc.service;

import io.github.rebecalopes.cursomc.domain.Categoria;
import io.github.rebecalopes.cursomc.repositories.CategoriaRepository;
import io.github.rebecalopes.cursomc.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria buscar(Integer id){
        Optional<Categoria> categoria = repository.findById(id);
                return categoria.orElseThrow(() -> new ObjectNotFoundException
                        ("Categoria não encontrada!"));

    }


}
