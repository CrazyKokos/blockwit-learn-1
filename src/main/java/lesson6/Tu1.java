/*tu1

Сделать класс Helper. Внутри него метод printIntArray, который принимает массив чисел и распечатывает их.
Переписать предыдущую задачу, так чтобы она использовала метод printIntArray. */


package lesson6;

public class Tu1 {
    public static void main(String[] args) {
        HelperClass hp = new HelperClass();
        Utils sorting = new Utils();
        int[] a = new int[]{12, 7, 89, -4, 8, 9};
        hp.printArray(a);
        System.out.print("\n");
        sorting.sort(a);
        hp.printArray(a);
    }
}
