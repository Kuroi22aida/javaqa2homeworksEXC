package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Smartphone extends Product {
    protected String manufacturer;

    protected Smartphone(int id, String productTitle, int cost, String manufacturer) {
        super(id, productTitle, cost);
        this.manufacturer = manufacturer;
    }
}
