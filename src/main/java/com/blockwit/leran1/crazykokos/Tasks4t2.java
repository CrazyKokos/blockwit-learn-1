package com.blockwit.leran1.crazykokos;
/*s4t2
        Написать программу, которая спрашивает у пользователя 5 имен.
        А затем выводит все эти имена.*/

import java.util.Scanner;

public class Tasks4t2 {
    public static void main(String[] args) {
        System.out.println(" Назовите пять ваших имен.");
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();
        System.out.println(name);
        String name2 = n.nextLine();
        System.out.println(name2);
        String name3 = n.nextLine();
        System.out.println(name3);
        String name4 = n.nextLine();
        System.out.println(name4);
        String name5 = n.nextLine();
        System.out.println(name5);
        System.out.println(name + " " + name2 + " " + name3 + " " + " " + name4 + " " + name5);
        n.close();

    }
}
