package com.javan.pricecomparator.dto;

import java.util.List;

public class ProductDTO {
    private String type;
    private String productInfo;
    private List<String> sites;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public List<String> getSites() {
        return sites;
    }

    public void setSites(List<String> sites) {
        this.sites = sites;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "type='" + type + '\'' +
                ", productInfo='" + productInfo + '\'' +
                ", sites=" + sites +
                '}';
    }
}
