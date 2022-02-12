
/*TaskS8T1 1. Написать класс MyIntArrayList. Этот класс будет представлять собой список.
Этот класс должен иметь методы:
        add - добавляет элемент в конец списка. Возвращает индекс, по которому элемент добавлен.
        get - получает индекс и возвращает соответствующий индексу элемент.
        size - возращает длину списка.
        clear - очищает список*/

package com.blockwit.leran1.crazykokos.lesson7;


public class MyIntArrayList {
    int[] num;
    int count;

    public MyIntArrayList() {               // конструктор класса
        num = new int[0];
        count = 0;

    }


    public int add(int newNumber) {                 //Метод add, который добавляет элемент в конец списка. Возвращает индекс, по которому элемент добавлен.
        if (count == num.length) {
            int[] newNum = new int[num.length + 1];
            for (int i = 0; i < num.length; i++) {
                newNum[i] = num[i];
            }
            newNum[newNum.length - 1] = newNumber;
            num = newNum;
        } else {
            num[count] = newNumber;
        }
        count = count + 1;
        return count - 1;
    }

    public int get(int i) {                     //получает индекс и возвращает соответствующий индексу элемент
        return num[i];
    }

    public int size() {                          // возращает длину списка.
        return count;
    }

                                                // очищает список
    public int clear(int i) {
        return count;
    }


}