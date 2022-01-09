package com.blockwit.leran1.crazykokos;

/*Задача 9
Вы турагенство.
У вас появились горящие путевки в рай.
И у вас есть список клиентов: Lucefer, Mamona, Asmodey, Wezewolf, Leviafan, Belfegor.
Часть этих клиентов отметили что  хотели бы получать оповещения о горящих путевках в рай.
Отметки хранятся в виде boolean массива соответствующего порядку имен клиентов:
false, true, true, false, true, true
Необходимо вывести имена тех клиентов, которым нужно прислать письмо с предложением о горящей путевке в рай.*/
public class Task9 {
    public static void main(String[] args) {
        boolean[] TravelAgency = new boolean[]{false, true, true, false, true, true};
        String name[] = new String[]{"Lucefer", "Mamona", "Asmodey", "Wezewolf", "Leviafan", "Belfegor"};
        for (int i = 0; i < name.length; i++) {
            if (TravelAgency[i] == true) {
                System.out.println(name[i]);

            }
        }

    }
}