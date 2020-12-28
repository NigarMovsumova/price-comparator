package com.javan.pricecomparator.dto;

import java.math.BigDecimal;

public class PriceDTO {
    private BigDecimal price;
    private String site;
    private String url;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "PriceDTO{" +
                "price=" + price +
                ", site='" + site + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
