package com.company.springbootcrudproject2.repository;

import com.company.springbootcrudproject2.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class CartRepositoryTest {

    @Autowired
    CartRepository cartRepository;



    @Test
    public void saveCart(){

        Cart cart =
                Cart.builder()
                        .count(1L)
                        .totalAmount(1.2)
                        .user(User.builder()
                                .name("ssad")
                                .surname("sss")
                                .birthday(LocalDate.of(2000,10,1))
                                .email("assdsa@gmail.com")
                                .address("dsds")
                                .build())
                        .product(Product.builder()
                                        .productName("asdsad")
                                        .price(445.1)
                                        .description("assad")
                                        .remainCount(44L)
                                        .brand(Brand.builder()
                                                .name("sasds")
                                                .description("assa")
                                                .category(Category.builder()
                                                        .name("sasad")
                                                        .description("asasd")
                                                        .build())
                                                .build())
                                        .productDetail(ProductDetail.builder()
                                                .color("sdds")
                                                .size("ssd")
                                                .build())
                                .build())

                        .build();

        cartRepository.save(cart);





    }

}