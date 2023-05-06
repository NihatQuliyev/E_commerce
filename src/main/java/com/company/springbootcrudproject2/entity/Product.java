package com.company.springbootcrudproject2.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String productName;
    Double price;
    String description;
    Long remainCount;
    @ManyToOne(cascade = CascadeType.PERSIST)
    //@JoinColumn(name = "category_id", referencedColumnName = "id")
    Brand brand;

    @Embedded
    ProductDetail productDetail;


}
