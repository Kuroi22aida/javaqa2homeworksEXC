package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {
    ProductRepository repository = new ProductRepository();
    Book book1 = new Book(1, "The Lord of the Rings", 50, "J.R.R.Tolkien");
    Smartphone smartphone1 = new Smartphone(2, "3310", 15, "Nokia");
    Smartphone smartphone2 = new Smartphone(3, "Iphone 13", 1, "Apple");
    Book book2 = new Book(4, "1984", 20, "George Orwell");

    @Test
    public void shouldSaveProducts() {

        ProductRepository repo = new ProductRepository();

        repo.save(book1);
        repo.save(smartphone1);
        repo.save(smartphone2);
        repo.save(book2);


        Product[] actual = repo.findAll();
        Product[] expected = {book1, smartphone1, smartphone2, book2};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldRemoveByID() {

        ProductManager manager = new ProductManager(repository);

        manager.add(book1);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(book2);

        repository.removeById(2);

        Product[] actual = repository.findAll();
        Product[] expected = {book1, smartphone2, book2};

        assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldRemoveByID2() {

        ProductManager manager = new ProductManager(repository);

        manager.add(book1);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(book2);

        repository.removeById(5);

        Product[] actual = repository.findAll();
        Product[] expected = {book1, smartphone1, smartphone2, book2};

        assertArrayEquals(expected, actual);

    }
}
