package ru.yajaneya.SpringFM1GeekbrainsDz4.data;

public class Product {
    private Long id;
    private String title;
    private Integer cost;

    public Product() {
    }

    public Product(Long id, String title, Integer cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
