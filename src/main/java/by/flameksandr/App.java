package by.flameksandr;

import by.flameksandr.config.ProjectConfig;
import by.flameksandr.services.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductService p = context.getBean(ProductService.class);
            p.addOneProduct();
        }
    }
}
