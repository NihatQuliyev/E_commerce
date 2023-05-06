package com.company.springbootcrudproject2.entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "cart")

public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    Long count ;
    Double totalAmount;
    @OneToOne(cascade = CascadeType.PERSIST)
    User user;

    @OneToOne(cascade = CascadeType.PERSIST)
    Product product;


}
