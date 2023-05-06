package com.company.springbootcrudproject2.controller;//package com.company.springbootcrudproject2.controller;

import com.company.springbootcrudproject2.dto.request.ProductRequestDto;
import com.company.springbootcrudproject2.dto.response.ProductResponseDto;
import com.company.springbootcrudproject2.dto.response.ResponseDto;
import com.company.springbootcrudproject2.service.ProductService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cart/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductResponseDto> productFindAll (){
        log.info("Get - /cart/product -> request none");
        var response = productService.findAll();
        log.info("Get - /cart/product - response -> {}",response);
        return productService.findAll();
    }


    @GetMapping("/{id}")
    public ProductResponseDto productFindById(@PathVariable Long id ) {
        log.info("Get - /cart/product/{} -> request ",id);
        var response = productService.findAll();
        log.info("Get - /cart/product/{} - response -> {}",id,response);
        return productService.findById(id);
    }

    @PostMapping
    public ResponseDto insert(@RequestBody ProductRequestDto productRequestDto){
        return productService.insert(productRequestDto).getBody();
    }

    @PutMapping
    public ResponseDto update(@RequestBody ProductRequestDto productRequestDto) {
        return productService.update(productRequestDto).getBody();

    }
    @DeleteMapping("/{id}")
    public ResponseDto delete(@PathVariable Long id) {
        return productService.delete(id).getBody();
    }


}
