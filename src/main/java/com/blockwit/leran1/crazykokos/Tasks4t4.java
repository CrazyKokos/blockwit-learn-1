package com.blockwit.leran1.crazykokos;
/*s4t2
Написать программу, которая спрашивает, сколько у Вас друзей.
 А потом спрашивает имена этих друзей. Затем выводит имена друзей в обратном порядке.*/

import java.util.Scanner;

public class Tasks4t4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countfriends;
        System.out.println(" Введите колличество ваших друзей: ");
        countfriends = in.nextInt();
        in.nextLine();

        String[] names = new String[countfriends];
        for (int i = 0; i < names.length; i++) {
            System.out.println(" Введите имя друга ");
            names[i] = in.nextLine();
        }
        for (int j = names.length - 1; j >= 0; j--) {
            System.out.println(names[j]);
            in.close();
        }
    }
}

