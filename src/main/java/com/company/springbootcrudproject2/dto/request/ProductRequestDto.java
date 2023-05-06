package com.company.springbootcrudproject2.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductRequestDto {

    Long id;
    String productName;
    Double price;
    String description;
    Long remainCount;
    BrandRequestDto brand;
    ProductDetailRequestDto productDetail;


}
