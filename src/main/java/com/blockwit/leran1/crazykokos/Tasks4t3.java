package com.blockwit.leran1.crazykokos;
/*s4t2
Написать программу, которая спрашивает имена и года рождения 4 людей.
После этого выводит имена и кол-во лет.*/

import java.util.Scanner;

public class Tasks4t3 {
    public static void main(String[] args) {
        System.out.println("Ваше имя? " + " Ваш год рождения?");
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        String name = in2.nextLine();
        System.out.println(name);
        int birtYear = in.nextInt();
        System.out.println(birtYear);
        int years = 2022 - birtYear;
        String name2 = in2.nextLine();
        System.out.println(name2);
        int birtYear2 = in.nextInt();
        System.out.println(birtYear2);
        int years2 = 2022 - birtYear2;
        String name3 = in2.nextLine();
        System.out.println(name3);
        int birtYear3 = in.nextInt();
        System.out.println(birtYear3);
        int years3 = 2022 - birtYear3;
        String name4 = in2.nextLine();
        System.out.println(name4);
        int birtYear4 = in.nextInt();
        System.out.println(birtYear);
        int years4 = 2022 - birtYear4;
        System.out.println(name + " вам " + years + " лет " + name2 + " вам " + years + " лет" + name3 + " вам " + years + " лет " + name4 + " вам " + years + " лет ");
        in.close();
    }

}
