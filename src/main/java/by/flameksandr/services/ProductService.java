package by.flameksandr.services;

import by.flameksandr.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    //rollsback the RuntimeException but does not rollback the checked exception
    public void addOneProduct() {
        productRepository.addProduct("Beer");
        try {
            throw new RuntimeException(":(");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
