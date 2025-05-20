package com.example.Spring_base_project.Repositery;

import com.example.Spring_base_project.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitRepositery extends JpaRepository<Produit,Long> {

    @Query("SELECT p FROM Produit p WHERE p.nom LIKE %:keyword%")
    Produit findByKeyword(@Param("keyword") String keyword);

}
