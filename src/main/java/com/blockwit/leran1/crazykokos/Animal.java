/* Написать класс животного. У него должны быть: дата рождения, цвет, название.
Также написать метод, который возвращает сколько животному лет..*/

package com.blockwit.leran1.crazykokos;

public class Animal {
    int dateOfBirth = 2010;
    String colour = " Blac ";
    String title = " Dog ";

    public void printDateOfBirth() {
        System.out.println(dateOfBirth);
    }

    public int getAge() {
        int age = 2022 - dateOfBirth;
        return age;
    }


}




