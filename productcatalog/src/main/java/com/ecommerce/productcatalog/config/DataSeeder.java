package com.ecommerce.productcatalog.config;

import com.ecommerce.productcatalog.model.Category;
import com.ecommerce.productcatalog.model.Product;
import com.ecommerce.productcatalog.repository.CategoryRepository;
import com.ecommerce.productcatalog.repository.ProductRepository;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    public DataSeeder(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        //create categories
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        Category  electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home & kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, home));


        //create pruducts
        Product phone =  new Product();
        phone.setName("SmartPhone");
        phone.setDescription("World's best smartphone");
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setPrice(39.99);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("World's best Laptop");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(69.99);
        laptop.setCategory(electronics);

        Product jacket = new Product();
        jacket.setName("Jacket");
        jacket.setDescription("World's best jacket");
        jacket.setImageUrl("https://placehold.co/600x400");
        jacket.setPrice(49.99);
        jacket.setCategory(clothing);

        Product blender = new Product();
        blender.setName("worlds best Blender");
        blender.setDescription("World's best Blender");
        blender.setImageUrl("https://placehold.co/600x400");
        blender.setPrice(59.99);
        blender.setCategory(electronics);

        productRepository.saveAll(Arrays.asList(phone, laptop, jacket, blender));




    }
}
