/*4. Написать класс Book.
        В классе должны быть поля: name - название книги и ISBN - уникальный идентификатор книги.
        Создать 6 книг и записать их в HashMap.
        Где, ключ - ISBN, а значение - сама книга.*/

package com.blockwit.leran1.crazykokos.Lesson10;

public class Book implements IBook {
    String name;
    int ISBN;

    public Book(String name, int ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public int getISBN() {
        return ISBN;
    }
}



