package com.soulyangor.businessmonitor;

import com.soulyangor.businessmonitor.entities.Category;
import com.soulyangor.businessmonitor.repositories.CategoryRepository;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
@EnableTransactionManagement
public class BusinessMonitorApplication {

    @Autowired
    private CategoryRepository categoryRepository;

    @PostConstruct
    @Transactional
    public void init() {
        Category rootCategory = new Category();
        rootCategory.setName("root category");
        categoryRepository.save(rootCategory);

        Category category1 = new Category();
        category1.setName("category1");
        category1.setRootCategory(rootCategory);
        categoryRepository.save(category1);

        Category category2 = new Category();
        category2.setName("category2");
        category2.setRootCategory(rootCategory);
        categoryRepository.save(category2);

        System.out.println("===============================================================================");
        categoryRepository.findAll().forEach(c -> System.out.println(c));
        System.out.println("===============================================================================");
    }

    public static void main(String[] args) {
        ApiContextInitializer.init();
        SpringApplication.run(BusinessMonitorApplication.class, args);
    }

}
