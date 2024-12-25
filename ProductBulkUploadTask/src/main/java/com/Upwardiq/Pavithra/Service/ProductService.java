package com.Upwardiq.Pavithra.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Upwardiq.Pavithra.Model.Product;
import com.Upwardiq.Pavithra.Repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo prodrepo;
	public void saveAll(List<Product> products) {
		prodrepo.saveAll(products);
	}
	public List<String> getAllProductTypes() {
		
		return prodrepo.findDistinctByProductType();
		
	}
	
	public List<Product> finbynameandtype(String productName,String productType){
		
		return prodrepo.findByProductNameAndProductType(productName, productType);
	}
	
	
	
	
	
	

}
