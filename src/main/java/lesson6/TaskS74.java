/*   TaskS7T4
Написать класс ProtoList1 в котором будет поле array типа массив целых чисел.
 Написать метод create который принимает размер и создает и присваивает полю array пустой массив целых чисел указанного размера.
  Написать метод getSize который возращает длину массива в поле array.
Написать метод get, который принимает индекс и возращает элемент из массива array по указанному индексу.*/

package lesson6;

public class TaskS74 {
    public static void main(String[] args) {
        ProtoList1 array1 = new ProtoList1();
        ProtoList1 array2 = new ProtoList1();
        int[] a1 = array1.create(7);
        int[] a2 = array2.create(3);
        System.out.println(array1.getSize(a1));
        System.out.println(array2.getSize(a2));
        System.out.println(array1.getIndex(a1, 4));
        System.out.println(array2.getIndex(a2, 1));
    }
}
