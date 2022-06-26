package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Book extends Product {
    protected String author;

    protected Book(int id, String productTitle, int cost, String author) {
        super(id, productTitle, cost);
        this.author = author;
    }
}
