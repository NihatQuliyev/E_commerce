package com.company.springbootcrudproject2.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartRequestDto {
    Long id ;
    Long count ;
    Double totalAmount;

    UserRequestDto userRequestDto;

    ProductRequestDto product;
}
