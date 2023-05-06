package com.company.springbootcrudproject2.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;


@Getter
@RequiredArgsConstructor
public enum ExceptionEnum {

    PRODUCT_NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND,"Product not found!"),
    CART_NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND,"Cart not found!"),

    ILLEGAL_NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND,"Illegal Argument not found!");

    private final HttpStatus status;
    private final String message;
}
