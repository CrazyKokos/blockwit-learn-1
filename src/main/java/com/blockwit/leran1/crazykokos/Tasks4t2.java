package com.blockwit.leran1.crazykokos;
/*s4t2
        Написать программу, которая спрашивает у пользователя 5 имен.
        А затем выводит все эти имена.*/

import java.util.Scanner;

public class Tasks4t2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] name = new String[5];
        for (int i = 0; i < name.length; i++) {
            System.out.println(" Введите " + (i + 1) + " имя ");
            name[i] = in.nextLine();
        }
        System.out.println(" Вы ввели имена: ");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        in.close();

    }
}
