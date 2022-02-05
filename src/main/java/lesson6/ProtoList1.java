/*   TaskS7T4
Написать класс ProtoList1 в котором будет поле array типа массив целых чисел.
 Написать метод create который принимает размер и создает и присваивает полю array пустой массив целых чисел указанного размера.
  Написать метод getSize который возращает длину массива в поле array.
Написать метод get, который принимает индекс и возращает элемент из массива array по указанному индексу.*/

package lesson6;

public class ProtoList1 {
    int[] array;

    public int[] create(int size) {
        int[] array = new int[size];
        return array;
    }

    public int getSize(int[] array) {
        return array.length;
    }

    public int getIndex(int[] array, int index) {
        return array[index];
    }
}
