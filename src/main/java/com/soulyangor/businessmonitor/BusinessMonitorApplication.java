package com.soulyangor.businessmonitor;

import com.soulyangor.businessmonitor.entities.Category;
import com.soulyangor.businessmonitor.entities.Product;
import com.soulyangor.businessmonitor.repositories.CategoryRepository;
import com.soulyangor.businessmonitor.repositories.ProductRepository;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@EnableTransactionManagement
public class BusinessMonitorApplication {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    @Transactional
    public void init() {
        Category rootCategory = new Category();
        rootCategory.setName("root category");
        rootCategory.setTreePath("root");
        categoryRepository.save(rootCategory);

        Category category1 = new Category();
        category1.setName("category1");
        category1.setParentCategory(rootCategory);
        categoryRepository.save(category1);

        Category category2 = new Category();
        category2.setName("category2");
        category2.setParentCategory(rootCategory);
        categoryRepository.save(category2).getId();

        Category subCategory11 = new Category();
        subCategory11.setName("category1.1");
        subCategory11.setParentCategory(category1);
        categoryRepository.save(subCategory11);

        Category subCategory12 = new Category();
        subCategory12.setName("category1.2");
        subCategory12.setParentCategory(category1);
        categoryRepository.save(subCategory12);

        System.out.println("===============================================================================");
        categoryRepository.findAll().forEach(c -> System.out.println(c));

        Product product1 = new Product();
        product1.setName("Product1");
        product1.setCategory(category2);
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("Product2");
        product2.setCategory(category2);
        productRepository.save(product2);

        Product product3 = new Product();
        product3.setName("Product3");
        product3.setCategory(subCategory11);
        productRepository.save(product3);

        System.out.println("===============================================================================");
        productRepository.findAll().forEach(p -> System.out.println(p));

        System.out.println("===============================================================================");
        productRepository.findByCategory(category2).forEach(p -> System.out.println(p));

        System.out.println("===============================================================================");
        productRepository.findAllByCategorySpec(category2.getTreePath()).forEach(p -> System.out.println(p));
        
        System.out.println("===============================================================================");
    }

    public static void main(String[] args) {
        SpringApplication.run(BusinessMonitorApplication.class, args);
    }

}
