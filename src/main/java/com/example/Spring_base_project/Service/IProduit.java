package com.example.Spring_base_project.Service;


import com.example.Spring_base_project.Entity.Produit;

import java.util.List;

public interface IProduit {
    List<Produit> getProduits();
    Produit getProduit(Long id);
    Produit addProduit(Produit produit);
    Produit updateProduit(Produit produit);
    void deleteProduit(Long id);
    Produit findByNom(String nom);
}
