package com.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.modelos.Pessoa;

@Repository
@Transactional
public interface IPessoaRepository  extends CrudRepository<Pessoa, Long>{

	@Query("select p from Pessoa p where p.nome like %?1%")
	List<Pessoa> findPessoaByName(String nomepesquisa);

}
