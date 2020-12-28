package com.javan.pricecomparator.service;

import com.javan.pricecomparator.dto.ComparisonDTO;
import com.javan.pricecomparator.dto.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface PriceService {
    ComparisonDTO comparePrices(ProductDTO productDTO);
}
