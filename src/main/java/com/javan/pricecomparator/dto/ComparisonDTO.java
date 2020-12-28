package com.javan.pricecomparator.dto;

import java.util.List;

public class ComparisonDTO {

    private List<ProductDTO> priceList;

    public List<ProductDTO> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<ProductDTO> priceList) {
        this.priceList = priceList;
    }

    @Override
    public String toString() {
        return "ComparisonDTO{" +
                "priceList=" + priceList +
                '}';
    }
}
