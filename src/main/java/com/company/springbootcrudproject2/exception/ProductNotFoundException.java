package com.company.springbootcrudproject2.exception;

import com.company.springbootcrudproject2.enums.ExceptionEnum;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException() {
        super(ExceptionEnum.PRODUCT_NOT_FOUND_EXCEPTION.getMessage());
    }
}
