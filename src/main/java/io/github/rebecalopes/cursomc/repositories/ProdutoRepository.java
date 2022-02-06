package io.github.rebecalopes.cursomc.repositories;

import io.github.rebecalopes.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
}
