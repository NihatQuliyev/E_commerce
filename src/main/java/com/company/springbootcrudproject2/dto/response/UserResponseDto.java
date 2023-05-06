package com.company.springbootcrudproject2.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponseDto {
    String name ;
    String surname ;
    LocalDate birthday ;
    String email ;
    String address;
}
