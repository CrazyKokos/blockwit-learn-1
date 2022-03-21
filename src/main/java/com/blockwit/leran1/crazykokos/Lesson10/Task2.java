/*2. Записать 100000 элементов в массив java.util.ArrayList.
        Вывести на экран эти 100000 элементов. Замерить время на запись и чтение.*/

package com.blockwit.leran1.crazykokos.Lesson10;

import java.util.ArrayList;


public class Task2 {

    public static void main(String[] args) {
        ArrayList element = new ArrayList();
        long startTimeStamp = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            element.add(i);
        }
        long endTimeStamp = System.currentTimeMillis();
        System.out.println("Время на запись : " + (endTimeStamp - startTimeStamp));
        long startTimeStamp2 = System.currentTimeMillis();
        for (int i = 0; i < element.size() ; i++) {
            System.out.println(element.get(i));

        }
        System.out.println("Время на чтение : " + (endTimeStamp - startTimeStamp));
    }
}
