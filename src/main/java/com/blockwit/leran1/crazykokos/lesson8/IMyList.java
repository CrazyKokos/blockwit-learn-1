/*1. Написать интерфейс для списка MyArrayList (который реализовали в 8-ой задаче).
В интерфейсе должны быть методы: size, get, add.*/

package com.blockwit.leran1.crazykokos.lesson8;

public interface IMyList {
    public int size();

    public int add(int newNumber);

    public int get(int i);
}


