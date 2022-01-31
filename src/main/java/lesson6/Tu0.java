/*tu0
        Задан массив чисел 12,7,89,-4,8,9. Необходимо:
        1. Распечатать его.
        2. Отсортировать его в порядке возрастания.
        3. Распечатать еще раз.*/


package lesson6;

public class Tu0 {
    public static void main(String[] args) {
        int[] a = new int[]{12, 7, 89, -4, 8, 9};
        for (int num : a) {
            System.out.println(num + " , ");
        }
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
        for (int num : a) {
            System.out.print(num + " . ");
        }
    }
}