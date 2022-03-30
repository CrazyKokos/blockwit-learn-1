/*4. Написать класс Book.
        В классе должны быть поля: name - название книги и ISBN - уникальный идентификатор книги.
        Создать 6 книг и записать их в HashMap.
        Где, ключ - ISBN, а значение - сама книга.*/

package com.blockwit.leran1.crazykokos.Lesson10;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {
        Map<Integer, IBook> books = new HashMap();
        Book book1 = new Book(" Мастер и Маргарита ", 20008);
        Book book2 = new Book(" Мертвые души ", 20022);
        Book book3 = new Book(" Кому на Руси жить хорошо ", 20001);
        Book book4 = new Book(" Капитанская дочка ", 19888);
        Book book5 = new Book(" Отцы и дети ", 19899);
        Book book6 = new Book(" Идиот ", 20010);


        books.put(book1.getISBN(), book1);
        books.put(book2.getISBN(), book2);
        books.put(book3.getISBN(), book3);
        books.put(book4.getISBN(), book4);
        books.put(book5.getISBN(), book5);
        books.put(book6.getISBN(), book6);


        System.out.println(book2.getName());

    }
}
