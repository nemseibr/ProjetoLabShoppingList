package LabShoppingList.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import LabShoppingList.Api.models.Produto;

public interface ProdutoRepository extends JpaRepository <Produto,Long> {

}
