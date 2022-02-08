/*   TaskS7T4
Написать класс ProtoList1 в котором будет поле array типа массив целых чисел.
 Написать метод create который принимает размер и создает и присваивает полю array пустой массив целых чисел указанного размера.
  Написать метод getSize который возращает длину массива в поле array.
Написать метод get, который принимает индекс и возращает элемент из массива array по указанному индексу.*/

package lesson6;

public class ProtoList1 {
    int[] array;            //поле под названием array типа массив целых чисел

    public void create(int size) {
        int[] array = new int[size];            // метод create который принимает размер и создает и присваивает// полю array пустой массив целых чисел указанного размера
        this.array = array;

    }


    public int getSize(int[] array) {           //метод getSize который возращает длину массива в поле array

        return array.length;
    }

    public int getIndex(int[] array, int index) {      // метод get, который принимает индекс и возращает элемент из массива array по указанному индексу
        return array[index];
    }
}
