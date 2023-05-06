package com.company.springbootcrudproject2.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductResponseDto {

    String productName;
    Double price;
    String description;
    Long remainCount;
    BrandResponseDto brand;

    ProductDetailResponseDto productDetail;


}
