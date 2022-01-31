/*tu1.Сделать класс Helper. Внутри него метод printIntArray, который принимает массив чисел и распечатывает их.
        Переписать предыдущую задачу, так чтобы она использовала метод printIntArray.*/

package lesson6;

public class HelperClass {
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a [i] +  " , " );
    }

}