package com.company.springbootcrudproject2.service;

import com.company.springbootcrudproject2.dto.request.ProductRequestDto;
import com.company.springbootcrudproject2.dto.response.ProductResponseDto;
import com.company.springbootcrudproject2.dto.response.ResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    ResponseEntity<ResponseDto> insert(ProductRequestDto cartRequestDto);
    ResponseEntity<ResponseDto> update(ProductRequestDto cartRequestDto);
    ResponseEntity<ResponseDto> delete(Long id );
    List<ProductResponseDto> findAll();
    ProductResponseDto findById(Long id);
}
