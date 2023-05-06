package com.company.springbootcrudproject2.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class CartResponseDto {

    Long count ;
    Double totalAmount;
    UserResponseDto userRequestDto;

    ProductResponseDto product;
}
