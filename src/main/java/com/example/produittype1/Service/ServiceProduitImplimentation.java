package com.example.produittype1.Service;

import com.example.produittype1.Entity.Produit;
import com.example.produittype1.Entity.TypeProduit;
import com.example.produittype1.Repository.ProduitRepository;
import com.example.produittype1.Repository.TypeProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduitImplimentation implements  ProduitService {
    @Autowired
    ProduitRepository produitRepository ;
    @Autowired
    TypeProduitRepository typeProduitRepository;
    @Override
    public Produit create(Produit p) {
       return produitRepository.save(p);

    }

    @Override
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }

    @Override
    public Produit getProduit(Long id) {
        return produitRepository.findById(id).get();
    }

//    @Override
//    public List<Produit> findAllProduitByTypeProduit(TypeProduit typeProduit) {
//        return produitRepository.findAllProduitByTypeProduit(typeProduit);
//    }
//
//    @Override
//    public List<Produit> findAllProduitByTypeProduit_Id(Long id) {
//        return produitRepository.findAllProduitByTypeProduit_Id(id);
//    }





}
