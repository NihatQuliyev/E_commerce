package com.company.springbootcrudproject2.exception;

import com.company.springbootcrudproject2.enums.ExceptionEnum;

public class IllegalArgument  extends RuntimeException{
    public IllegalArgument() {
        super(ExceptionEnum.ILLEGAL_NOT_FOUND_EXCEPTION.getMessage());
    }
}
