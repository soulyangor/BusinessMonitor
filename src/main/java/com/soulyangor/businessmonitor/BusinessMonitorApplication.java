package com.soulyangor.businessmonitor;

import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@EnableTransactionManagement
public class BusinessMonitorApplication {

    @PostConstruct
    @Transactional
    public void init() {
        
    }

    public static void main(String[] args) {
        SpringApplication.run(BusinessMonitorApplication.class, args);
    }

}
