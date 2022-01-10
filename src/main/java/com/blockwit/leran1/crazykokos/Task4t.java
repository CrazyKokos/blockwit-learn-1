package com.blockwit.leran1.crazykokos;



/*s4t3
Написать программу, которая спрашивает температуру за последние три дня,
 вычисляет среднюю температуру и выводит ее.*/

import java.util.Scanner;

public class Task4t {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 3;
        double sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.println(" Введите температуру: ");
            sum = sum + in.nextInt();
            in.nextLine();
        }
            System.out.println(" Средняя температура за последние " + count + " дней равна " + (sum / count));

            in.close();

        }


    }

