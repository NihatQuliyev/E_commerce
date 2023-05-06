package com.company.springbootcrudproject2.service.impl;

import com.company.springbootcrudproject2.dto.request.ProductRequestDto;
import com.company.springbootcrudproject2.dto.response.ProductResponseDto;
import com.company.springbootcrudproject2.dto.response.ResponseDto;
import com.company.springbootcrudproject2.entity.Product;
import com.company.springbootcrudproject2.exception.CartNotFoundException;
import com.company.springbootcrudproject2.exception.ProductNotFoundException;
import com.company.springbootcrudproject2.repository.ProductRepository;
import com.company.springbootcrudproject2.service.ProductService;

import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class IProductService implements ProductService {

    private final ProductRepository productRepository;

    private final ModelMapper modelMapper;

    @Override
    public ResponseEntity<ResponseDto> insert(ProductRequestDto productDtoRequest) {

        Product product = modelMapper.map(productDtoRequest, Product.class);
        productRepository.save(product);
        return ResponseEntity.ok(new ResponseDto("Register Successfully"));
    }

    @Override
    public ResponseEntity<ResponseDto> update(ProductRequestDto productDtoRequest) {
        Product product = modelMapper.map(productDtoRequest, Product.class);
        productRepository.save(product);
        return ResponseEntity.ok(new ResponseDto("Update Successfully"));
    }

    @Override
    public ResponseEntity<ResponseDto> delete(Long id) {
        productRepository.delete(
                productRepository.findById(id)
                        .orElseThrow(CartNotFoundException::new)
        );
        return ResponseEntity.ok(new ResponseDto("Delete Successfully"));
    }

    @Override
    public List<ProductResponseDto> findAll() {
        return productRepository.findAll().stream()
                .map(product -> modelMapper.map(product, ProductResponseDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProductResponseDto findById(Long id) {
        return modelMapper.map(
                productRepository.findById(id).orElseThrow(ProductNotFoundException::new),ProductResponseDto.class);
    }
}
