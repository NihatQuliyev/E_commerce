package com.company.springbootcrudproject2.dto.response;

import com.company.springbootcrudproject2.entity.Category;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BrandResponseDto {

    String name;
    String description;
    Category category;
}
