package com.company.springbootcrudproject2.handler;


import com.company.springbootcrudproject2.dto.response.ExceptionResponse;
import com.company.springbootcrudproject2.enums.ExceptionEnum;
import com.company.springbootcrudproject2.exception.CartNotFoundException;
import com.company.springbootcrudproject2.exception.IllegalArgument;
import com.company.springbootcrudproject2.exception.ProductNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({CartNotFoundException.class, ProductNotFoundException.class, IllegalArgument.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse handle() {
        return ExceptionResponse.builder()
                .localDateTime(LocalDateTime.now())
                .message(ExceptionEnum.CART_NOT_FOUND_EXCEPTION.getMessage())
                .message(ExceptionEnum.PRODUCT_NOT_FOUND_EXCEPTION.getMessage())
                .message(ExceptionEnum.ILLEGAL_NOT_FOUND_EXCEPTION.getMessage())
                .build();
    }

}
