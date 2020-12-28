package com.javan.pricecomparator.service.impl;

import com.javan.pricecomparator.dto.ComparisonDTO;
import com.javan.pricecomparator.dto.ProductDTO;
import com.javan.pricecomparator.service.PriceService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PriceServiceImpl implements PriceService {

    @Override
    public ComparisonDTO comparePrices(ProductDTO productDTO) {
        if (productDTO.getType().equals("URL")){
            return comparePricesByURL(productDTO.getProductInfo());
        }
        return null;
    }
    public ComparisonDTO comparePricesByURL(String url){
        Document doc = null;
        try {
            doc = Jsoup.connect("http://example.com").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        doc.select("h1").forEach(System.out::println);
        return null;
    }
}
