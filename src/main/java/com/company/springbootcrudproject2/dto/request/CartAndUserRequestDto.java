package com.company.springbootcrudproject2.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartAndUserRequestDto {
    Long count ;
    Double totalAmount;

    UserRequestDto userRequestDto;

    Long product_id;



}
