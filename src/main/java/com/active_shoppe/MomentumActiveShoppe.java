package com.active_shoppe;

import com.active_shoppe.model.CustomerActiveDaysModel;
import com.active_shoppe.model.CustomerModel;
import com.active_shoppe.model.ProductModel;
import com.active_shoppe.repository.CustomerRepository;
import com.active_shoppe.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;
import java.util.List;

@Slf4j
@SpringBootApplication
public class MomentumActiveShoppe implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(MomentumActiveShoppe.class, args);
    }

    @Override
    public void run(String... args) {
        productDataInit();
        customerDataInit();
    }

    public void productDataInit() {
        productRepository.deleteAll();
        List<ProductModel> productModelList = new LinkedList<>();

        ProductModel fistProduct = new ProductModel();
        fistProduct.setProductCode("P1");
        fistProduct.setProductCost(50);
        fistProduct.setProductName("Product Name");
        productModelList.add(fistProduct);

        ProductModel secondProduct = new ProductModel();
        secondProduct.setProductCode("P2");
        secondProduct.setProductCost(100);
        secondProduct.setProductName("Product Name2");
        productModelList.add(secondProduct);
        productRepository.saveAll(productModelList);
    }

    public void customerDataInit() {
        customerRepository.deleteAll();
        CustomerModel customerModel = new CustomerModel();
        customerModel.setCustomerName("Prince");
        CustomerActiveDaysModel customerActiveDaysModel = new CustomerActiveDaysModel();
        customerActiveDaysModel.setPoints(1000L);
        customerModel.setCustomerActiveDaysModel(customerActiveDaysModel);
        customerRepository.save(customerModel);
    }


}
