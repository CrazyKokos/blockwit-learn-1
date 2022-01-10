package com.blockwit.leran1.crazykokos;
/*s4t2
Написать программу, которая спрашивает имена и года рождения 4 людей.
После этого выводит имена и кол-во лет.*/

import java.util.Scanner;

public class Tasks4t3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 4;
        String[] names = new String[count];
        int[] birthdays = new int[count];
        for (int i = 0; i < names.length; i++) {
            System.out.println(" Введите имя: ");
            names[i] = in.nextLine();
            System.out.println(" Введите год рождения: ");
            birthdays[i] = in.nextInt();
            in.nextLine();
        }
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i] + " , Вам лет " + (2022 - birthdays[i]));

        in.close();
    }
}

