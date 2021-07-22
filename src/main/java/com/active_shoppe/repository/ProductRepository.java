package com.active_shoppe.repository;

import com.active_shoppe.model.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<ProductModel, String> {
    List<ProductModel> findByProductCodeIn(List<String> listOfProductsCode);
}
