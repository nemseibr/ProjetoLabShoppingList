package LabShoppingList.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import LabShoppingList.Api.models.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria,Long> {
	
}
