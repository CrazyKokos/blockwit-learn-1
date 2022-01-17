package com.blockwit.leran1.crazykokos;

/*s4t6
Написать программу, которая спрашивает у пользователя четыре числа.
        А затем меняет местами первое и последнее число только если последнее больше первого. Затем выводит числа.*/

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Task4t6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 4;
        int[] namber = new int[count];
        for (int i = 0; i < 4; i++) {
            System.out.println(" Введите число ");
            namber[i] = in.nextInt();
        }
        if (namber[3] > namber[0]) {
            int a = namber[0];
            namber[0] = namber[3];
            namber[3] = a;
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(namber[i]);

            in.close();
        }
    }
}
