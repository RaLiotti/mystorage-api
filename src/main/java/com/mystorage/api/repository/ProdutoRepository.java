package com.mystorage.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mystorage.api.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
