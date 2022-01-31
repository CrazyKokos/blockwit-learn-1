/*tu1
        Написать класс Utils. Внутри него метод sort. Метод sort должен принимать на вход массив чисел.
        Метод сортирует числа внутри массива в порядке возрастания.*/

package lesson6;

public class Utils {
    public static void sort(int[] a) {
        int count;
        do {
            count = 0;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);
    }
}
