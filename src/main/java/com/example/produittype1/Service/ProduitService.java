package com.example.produittype1.Service;

import com.example.produittype1.Entity.Produit;
import com.example.produittype1.Entity.TypeProduit;


import java.util.List;

public interface ProduitService {
    Produit create(Produit p );
//    List<Produit> findAllProduitByTypeProduit(TypeProduit typeProduit);
//    List<Produit> findAllProduitByTypeProduit_Id(Long id);
    List<Produit> getAllProduit();
    Produit getProduit(Long id);
   List<Produit> findByTypeProduitId(Long typeId);
    //List<Produit> findByTypeProduit(TypeProduit typeProduit);

}
