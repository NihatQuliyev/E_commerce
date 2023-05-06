package com.company.springbootcrudproject2.dto.request;

import com.company.springbootcrudproject2.entity.Category;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BrandRequestDto {

    Long id;
    String name;
    String description;
    Category category;
}
