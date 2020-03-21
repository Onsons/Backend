package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
// @CrossOrigin(exposedHeaders="Access-Control-Allow-Origin,Authorization")
@RestController
public class ProduitController {

	@Autowired
	private ProduitRepository produitRepository;
	
	/*@PostMapping(value="/addProduit")
	public Produit addProduit(@RequestBody Produit produit) {
		return produitRepository.save(produit);
		
	}*/
}
