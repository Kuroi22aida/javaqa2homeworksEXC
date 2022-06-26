package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    Book book1 = new Book(1, "The Lord of the Rings", 50, "J.R.R.Tolkien");
    Smartphone smartphone1 = new Smartphone(2, "3310", 15, "Nokia");
    Smartphone smartphone2 = new Smartphone(3, "Iphone 13", 1, "Apple");
    Book book2 = new Book(4, "1984", 20, "George Orwell");

    @Test
    public void shouldFIndQuery() {

        ProductManager manager = new ProductManager(repository);

        manager.add(book1);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(book2);

        Product[] actual = manager.searchBy("3");
        Product[] expected = {smartphone1, smartphone2};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddProduct() {

        ProductManager manager = new ProductManager(repository);

        manager.add(book1);
        manager.add(smartphone1);

        Product[] actual = repository.findAll();
        Product[] expected = {book1, smartphone1};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFIndQuery2() {

        ProductManager manager = new ProductManager(repository);

        manager.add(book1);


        Product[] actual = manager.searchBy("Lord");
        Product[] expected = {book1};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFIndQuery3() {

        ProductManager manager = new ProductManager(repository);


        Product[] actual = manager.searchBy("hone");
        Product[] expected = {};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFIndQuery4() {

        ProductManager manager = new ProductManager(repository);

        manager.add(book1);


        Product[] actual = manager.searchBy("phone");
        Product[] expected = {};

        assertArrayEquals(expected, actual);

    }

}
