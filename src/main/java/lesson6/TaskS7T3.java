/*  TaskS7T3
Есть два массива. Первый 7,4,2,8,6,7 и второй 6,2,9. Вывести их на экран.
А затем создать такой массив, который вмещал бы первые два. И скопировать в новый массив элементы первых двух массивов.
При этом элементы из первого и второго массивов должны чередоваться в новом массиве.
 Если в какой-то момент из-за нехватки элементов в одном из массивов чередовать будет нельзя,
  то копировать элементы из оставшегося массива.*/

package lesson6;

public class TaskS7T3 {
    public static void main(String[] args) {
        HelperClass taskS7T3 = new HelperClass();
        int[] a = {7, 4, 2, 8, 6, 7};
        int[] b = {6, 2, 9};
        taskS7T3.printArray(a);
        System.out.print("\n");
        taskS7T3.printArray(b);
        System.out.print("\n");

        int num[] = new int[a.length + b.length];
        for (int i = 0; i < (num.length - b.length); i++) {
            if ((i + 1) % 2 == 0) {
                num[i] = a[i / 2];
            } else {
                num[i] = b[i / 2];
            }
        }
        for (int j = b.length; j < a.length; j++) {
            num[j + b.length] = a[j];
        }
        taskS7T3.printArray(num);
    }
}

