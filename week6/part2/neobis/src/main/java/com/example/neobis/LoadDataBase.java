package com.example.neobis;


import com.example.neobis.Entity.Product;
import com.example.neobis.Repositories.ProductRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ProductRepo repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Product("Cake", "sweet heaven")));
            log.info("Preloading " + repository.save(new Product("Pie", "Apple taste")));
        };
    }
}