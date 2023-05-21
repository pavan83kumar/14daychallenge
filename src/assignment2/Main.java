package assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> listOfBooks = new ArrayList<>(Arrays.asList(
                new Book("Camel in Action", "Claus Ibsen",2022),
                new Book ("Clean Code", "Rober C. Martin",2022),
                new Book ("Modern Java in Action","Alan Mycrofy", 2020)));

        listOfBooks.stream().forEach(System.out::println);

    }
}
