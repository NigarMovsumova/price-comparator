package com.javan.pricecomparator.controller;

import com.javan.pricecomparator.dto.ComparisonDTO;
import com.javan.pricecomparator.dto.ProductDTO;
import com.javan.pricecomparator.service.PriceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @PostMapping
    public ResponseEntity<ComparisonDTO> comparePrices(ProductDTO productDTO){
        priceService.comparePrices(productDTO);
        return ResponseEntity.ok().build();
    }
}
