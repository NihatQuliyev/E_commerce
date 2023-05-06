package com.company.springbootcrudproject2.exception;

import com.company.springbootcrudproject2.enums.ExceptionEnum;

public class CartNotFoundException extends RuntimeException{
    public CartNotFoundException() {
        super(ExceptionEnum.CART_NOT_FOUND_EXCEPTION.getMessage());
    }
}