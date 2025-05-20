package com.example.Spring_base_project.Controller;

import com.example.Spring_base_project.Entity.Produit;
import com.example.Spring_base_project.Service.IProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/produits")
public class ProduitController{

    private final IProduit produitService;

    @Autowired
    public ProduitController(IProduit produitService) {
        this.produitService = produitService;
    }

    @GetMapping
    public List<Produit> getAllProduits() {
        return produitService.getProduits();
    }

    @GetMapping("/{id}")
    public Produit getProduitById(@PathVariable Long id) {
        return produitService.getProduit(id);
    }

    @PostMapping
    public Produit addProduit(@RequestBody Produit produit) {
        return produitService.addProduit(produit);
    }

    @PutMapping("/{id}")
    public Produit updateProduit(@PathVariable Long id, @RequestBody Produit updatedProduit) {
        updatedProduit.setId(id); // Make sure ID is set
        return produitService.updateProduit(updatedProduit);
    }

    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable Long id) {
        produitService.deleteProduit(id);
    }

    @GetMapping("/search")
    public Produit searchProduits(@RequestParam("nom") String nom) {
        return produitService.findByNom(nom);
    }
}
