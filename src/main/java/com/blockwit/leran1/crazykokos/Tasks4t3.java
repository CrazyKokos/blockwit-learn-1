package com.blockwit.leran1.crazykokos;
/*s4t2
Написать программу, которая спрашивает имена и года рождения 4 людей.
После этого выводит имена и кол-во лет.*/

import java.util.Scanner;

public class Tasks4t3 {
    public static void main(String[] args) {
        System.out.println("Ваш год рождения? " + " Ваше имя?");
        Scanner in = new Scanner(System.in);
        int birtYear = in.nextInt();
        System.out.println(birtYear);
        Scanner in2 = new Scanner(System.in);
        String name = in2.nextLine();
        System.out.println(name);

        int years = 2022 - birtYear;
        System.out.println(name + " вам " + years + " лет ");
        in.close();
    }

}
