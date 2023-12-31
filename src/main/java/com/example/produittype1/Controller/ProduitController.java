package com.example.produittype1.Controller;

import com.example.produittype1.Entity.Produit;
import com.example.produittype1.Entity.TypeProduit;
import com.example.produittype1.Service.ProduitService;
import com.example.produittype1.Service.ServiceProduitImplimentation;
import com.example.produittype1.Service.ServiceTypeProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RequestMapping("/api/produit")
@RestController
public class ProduitController {

    @Autowired
    ProduitService serviceProduit;
    @Autowired
    ServiceTypeProduit serviceTypeProduit;
    @PostMapping("/add")
    public Produit saveProduit(@RequestBody Produit p){
        return serviceProduit.create(p);
    }
    @GetMapping("/all")
    public List<Produit> getAllProduit(){
        return serviceProduit.getAllProduit();
    }
    @GetMapping("/get")
    public Produit getProduit(@RequestParam Long id){
        return serviceProduit.getProduit(id);
    }
    @GetMapping("/getByType")
    public List<Produit> findByTypeProduitId(@RequestParam Long id){
        return serviceProduit.findByTypeProduitId(id);
    }


//    @GetMapping("/getpProduitByType/{id}")
//    public List<Produit> getProduitByTpe(@RequestBody Long id ){
//      TypeProduit typeProduit= serviceTypeProduit.getTypeProduitById(id);
//      return  serviceProduit.getProductsByType(typeProduit);
//
//    }

}
