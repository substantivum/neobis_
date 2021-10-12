package com.example.neobis.controller;

import com.example.neobis.POJO.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {
    private static Map<Integer, Product> productRepo = new HashMap<>();
    static {
        Product donut = new Product();
        donut.setId(1);
        donut.setName("Donut");
        donut.setDescription("Good sweet thing");
        productRepo.put(donut.getId(), donut);

        Product pie = new Product();
        pie.setId(2);
        pie.setName("Pie");
        pie.setDescription("Baked goodness");
        productRepo.put(pie.getId(), pie);
    }

    @RequestMapping("/products")
    public ResponseEntity<Object> getProducts() {
        return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer id) {
        productRepo.remove(id);
        return new ResponseEntity<>("Product is deleted", HttpStatus.OK);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") Integer id, @RequestBody Product p) {
        productRepo.remove(id);
        p.setId(id);
        productRepo.put(id, p);
        return new ResponseEntity<>("Product is updated", HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity<Object> add(@RequestBody Product p) {
        productRepo.put(p.getId(), p);
        return new ResponseEntity<>("Product is added", HttpStatus.CREATED);
    }
}
