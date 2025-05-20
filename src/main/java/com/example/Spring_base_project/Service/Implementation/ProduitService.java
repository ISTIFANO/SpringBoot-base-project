package com.example.Spring_base_project.Service.Implementation;

import com.example.Spring_base_project.Entity.Produit;
import com.example.Spring_base_project.Repositery.ProduitRepositery;
import com.example.Spring_base_project.Repositery.ProduitRepository;
import com.example.Spring_base_project.Service.IProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService implements IProduit {

    private final ProduitRepositery produitRepository;

    @Autowired
    public ProduitService(ProduitRepositery produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public List<Produit> getProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit getProduit(Long id) {
        Optional<Produit> optionalProduit = produitRepository.findById(id);
        return optionalProduit.orElse(null);
    }

    @Override
    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit updateProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);
    }

    @Override
    public Produit findByNom(String nom) {
        return produitRepository.findByKeyword(nom);
    }
}
