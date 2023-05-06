package com.company.springbootcrudproject2.service;

import com.company.springbootcrudproject2.dto.request.CartAndUserRequestDto;
import com.company.springbootcrudproject2.dto.request.CartRequestDto;
import com.company.springbootcrudproject2.dto.response.CartResponseDto;
import com.company.springbootcrudproject2.dto.response.ResponseDto;
import com.company.springbootcrudproject2.repository.CartRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CartService {

    ResponseEntity<ResponseDto> insert(CartAndUserRequestDto cartRequestDto);
    ResponseEntity<ResponseDto> update(CartAndUserRequestDto cartRequestDto);
    ResponseEntity<ResponseDto> delete(Long id );
    List<CartResponseDto> findAll();
    CartResponseDto findById(Long id);
}
