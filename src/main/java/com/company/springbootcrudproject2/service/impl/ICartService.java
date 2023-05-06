package com.company.springbootcrudproject2.service.impl;

import com.company.springbootcrudproject2.dto.request.CartAndUserRequestDto;
import com.company.springbootcrudproject2.dto.response.CartResponseDto;
import com.company.springbootcrudproject2.dto.response.ResponseDto;
import com.company.springbootcrudproject2.entity.Cart;
import com.company.springbootcrudproject2.exception.CartNotFoundException;
import com.company.springbootcrudproject2.exception.ProductNotFoundException;
import com.company.springbootcrudproject2.repository.CartRepository;
import com.company.springbootcrudproject2.repository.ProductRepository;
import com.company.springbootcrudproject2.service.CartService;

import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ICartService implements CartService {

    private final CartRepository cartRepository;
    private final ProductRepository productRepository;


    private final ModelMapper modelMapper;

    @Override
    public ResponseEntity<ResponseDto> insert(CartAndUserRequestDto cartRequestDto) {
        Cart cart = modelMapper.map(cartRequestDto, Cart.class);
        cart.setProduct(productRepository.findById(cartRequestDto.getProduct_id()).orElseThrow(ProductNotFoundException::new));
        cartRepository.save(cart);

        return ResponseEntity.ok(new ResponseDto("Successfully"));

    }

    @Override
    public ResponseEntity<ResponseDto> update(CartAndUserRequestDto cartRequestDto) {
        Cart cart = modelMapper.map(cartRequestDto ,Cart.class);
        cartRepository.updateCategoryNameById(cart.getCount(),cart.getId());

        return ResponseEntity.ok(new ResponseDto("Successfully"));
    }

    @Override
    public ResponseEntity<ResponseDto> delete(Long id) {

        cartRepository.delete(
                cartRepository.findById(id)
                        .orElseThrow(CartNotFoundException::new)
        );
        return ResponseEntity.ok(new ResponseDto("Successfully"));
    }

    @Override
    public List<CartResponseDto> findAll() {
                return cartRepository.findAll().stream()
                .map(cart -> modelMapper.map(cart,CartResponseDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public CartResponseDto findById(Long id) {
                return modelMapper.map(
                cartRepository.findById(id).orElseThrow(CartNotFoundException::new),CartResponseDto.class);
    }
}
