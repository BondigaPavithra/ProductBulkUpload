package com.Upwardiq.Pavithra.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Upwardiq.Pavithra.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
	@Query("SELECT DISTINCT p.productType FROM Product p")
    List<String> findDistinctByProductType();
	
	List<Product> findByProductNameAndProductType(String productName, String productType);
	
	

}
