/*3. Записать 100000 элементов в массив java.util.LinkedList.
Вывести на экран эти 100000 элементов.
Замерить время на запись и чтение.*/

package com.blockwit.leran1.crazykokos.Lesson10;

import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        LinkedList element2 = new LinkedList();
        long startTimeStamp = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            element2.add(i);
    }
        long endTimeStamp = System.currentTimeMillis();
        System.out.println("Время на запись : " + (endTimeStamp - startTimeStamp));
        long startTimeStamp2 = System.currentTimeMillis();
        for (int i = 0; i < element2.size(); i++) {
            System.out.println(element2.get(i));
        }
        System.out.println("Время на чтение : " + (endTimeStamp - startTimeStamp));
    }
}
