/*tu1.Сделать класс Helper. Внутри него метод printIntArray, который принимает массив чисел и распечатывает их.
        Переписать предыдущую задачу, так чтобы она использовала метод printIntArray.*/

package lesson7;

import com.blockwit.leran1.crazykokos.Lesson10.Book;

import java.util.Map;
import java.util.*;
public class HelperClass {
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " , ");
    }

    public static void printInList(int[] num) {
        for (int i = 0; i < num.length; i++)
            System.out.println(num[i] + " , ");
    }



    public Book getBook(Map<Integer, Book> books, int ISBN) {
        return books.get(ISBN);

    }
}



