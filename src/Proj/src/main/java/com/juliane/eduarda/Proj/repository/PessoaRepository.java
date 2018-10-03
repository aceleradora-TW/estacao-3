package com.juliane.eduarda.Proj.repository;

import com.juliane.eduarda.Proj.models.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

}
