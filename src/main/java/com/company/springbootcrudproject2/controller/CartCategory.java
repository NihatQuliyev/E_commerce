package com.company.springbootcrudproject2.controller;

import com.company.springbootcrudproject2.dto.request.CartAndUserRequestDto;
import com.company.springbootcrudproject2.dto.response.CartResponseDto;
import com.company.springbootcrudproject2.dto.response.ResponseDto;
import com.company.springbootcrudproject2.service.CartService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cart")
public class CartCategory {

    private final CartService cartService;

    @GetMapping
    public List<CartResponseDto> cartFindAll (){
        log.info("Get - /cart -> request none");
        var response = cartService.findAll();
        log.info("Get - /cart - response -> {}",response);
        return cartService.findAll();
    }

    @GetMapping("/{id}")
    public CartResponseDto cartFindById(@PathVariable Long id ) {
        log.info("Get - /cart/{} -> request ",id);
        var response = cartService.findAll();
        log.info("Get - /cart/{} - response -> {}",id,response);
        return cartService.findById(id);
    }

    @PostMapping
    public ResponseDto insert(@RequestBody CartAndUserRequestDto cartRequestDto){
        log.info("INSERT - /cart/{} -> request ",cartRequestDto);
        log.info("INSERT - /cart/ -> response -> none");
        return cartService.insert(cartRequestDto).getBody();
    }
    @PutMapping
    public ResponseDto update(@RequestBody CartAndUserRequestDto cartAndUserRequestDto) {
        log.info("UPDATE - /cart/{} -> request ",cartAndUserRequestDto);
        log.info("UPDATE - /cart/ -> response -> none");
        return cartService.update(cartAndUserRequestDto).getBody();

    }
    @DeleteMapping("/{id}")
    public ResponseDto delete(@PathVariable Long id) {
        log.info("DELETE - /category/{} -> request ",id);
        log.info("DELETE - /category/ -> response -> none");
        return cartService.delete(id).getBody();
    }
}
