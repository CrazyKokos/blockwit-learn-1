package com.blockwit.leran1.crazykokos;

/*s4t5
        Написать программу, которая спрашивает у пользователя четыре числа.
        А затем меняет местами первое и последнее число и выводит все числа.*/

import java.util.Scanner;

public class Task4t5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 4;
        int[] namber = new int[count];                            // спрашивает у пользователя четыре числа
        for (int i = 0; i < 4; i++) {
            System.out.println(" Введите число ");
            namber[i] = in.nextInt();
        }
        int a = namber[0];                                      //затем меняет местами первое и последнее число и выводит все числа
        namber[0] = namber[3];
        namber[3] = a;
        for (int i = 0; i < 4; i++) {
            System.out.println(namber[i]);
        }
        in.close();

    }

}

