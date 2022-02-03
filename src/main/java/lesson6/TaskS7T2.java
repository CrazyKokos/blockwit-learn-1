/* TaskS7T2
Есть два массива. Первый 6,3,8,9 и второй 0,3,1,5. Вывести их на экран.
А затем создать такой массив, который вмещал бы первые два.
 И скопировть в новый массив элементы первых двух массивов.
 При этом элементы из первого и второго массивов должны чередоваться в новом массиве.*/

package lesson6;

public class TaskS7T2 {
    public static void main(String[] args) {
        HelperClass taskS7T2 = new HelperClass();
        int[] a = {6, 3, 8, 9};
        int[] b = {0, 3, 1, 5};
        System.out.print(" Первый массив ");
        taskS7T2.printArray(a);
        System.out.print(" Второй массив ");
        taskS7T2.printArray(b);
        System.out.println(" ");
        int[] array = new int[a.length * 2];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (count < array.length) {
                array[count++] = a[i];
                array[count++] = b[i];
            }
        }
        System.out.println(" Объединенный массив ");
        taskS7T2.printArray(array);
    }
}


