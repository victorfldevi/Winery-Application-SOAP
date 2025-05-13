package br.com.fiap.winery;

import java.math.BigDecimal;

public class Vinho {
    private Long id;
    private String name;
    private BigDecimal price;
    private String typeGrape;

    public Vinho(Long id, String name, BigDecimal price, String typeGrape) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.typeGrape = typeGrape;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeGrape() {
        return typeGrape;
    }

    public void setTypeGrape(String typeGrape) {
        this.typeGrape = typeGrape;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
