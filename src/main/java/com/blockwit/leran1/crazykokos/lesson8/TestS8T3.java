
/*TaskS8T2 2. Добавить в PrintHelper метод printInList, который бы распечатывал все числа списка из задачи 1.


 👉TaskS9T3 Найти как генерировать произвольное целое число.
  Сгенерированные числа добавить в список созданный на основе класса из первой задачи. Распечатать с помощью метода из задачи 2.*/

        package com.blockwit.leran1.crazykokos.lesson8;

import java.util.Random;

import lesson7.HelperClass;

public class TestS8T3 {
    public static void main(String[] args) {
        MyIntArrayList oldList = new MyIntArrayList();  // Экземпляр класса
        Random count = new Random();                  // для генерации случайных чисел, создание объекта класса Random
        HelperClass oldHelper = new HelperClass();
        for (int i = 0; i < 5; i++) {
            oldList.add(i);
        }
        oldHelper.printInList(oldList.num);
        for (int j = 0; j < 20; j++) {
            int randomcount = count.nextInt(20); // генерация случайных чисел, мак. значение чисел 19
            System.out.println(randomcount);
            oldList.add(randomcount);
        }
        HelperClass.printArray(oldList.num);  //распечатать весь список
        System.out.print(" 16 число по порядку " +  oldList.get(15) + " . " );
        System.out.print ( " длина списка    "   +   oldList.size());
        oldList.clear();
    }
}



