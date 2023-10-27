package by.flameksandr.services;

import by.flameksandr.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addOneProduct() {
        productRepository.addProduct("Beer");
        throw new RuntimeException(":(");
    }
}
