/*TaskS8T4 Найти как получить время в формате миллисекунд (unix timestamp).
        Написать класс ListsEvaluation , который содержит метод evalMyList.
        Который принимает на вход пустой список из задачи 1.
        Затем наполняет список миллионом произвольных элементов и замеряет время за которое он это сделать.
        Затем выводит это время.*/

package com.blockwit.leran1.crazykokos.lesson8;

import java.util.Random;

public class ListsEvaluation {

    public void evalMyList(MyIntArrayList myIntArrayList) {
        long startTimeStamp = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {                 // в метод add вместо +1, добавил +100
            myIntArrayList.add(random.nextInt());
        }
        long endTimeStamp = System.currentTimeMillis();
        long spentTime = endTimeStamp - startTimeStamp;
        System.out.println(spentTime);
    }

}
