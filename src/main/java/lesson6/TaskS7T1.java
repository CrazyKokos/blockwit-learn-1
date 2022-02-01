/*TaskS7T1
        Есть два массива чисел. Первый - 9,1,5,6,8. И второй 7,3,1.
        Вывести их на экран. Затем создать такой массив, который бы умещал первые два.
        И скопировать туда элементы первых двух массивов. Вывести получный массив на экран.*/

package lesson6;

public class TaskS7T1 {
    public static void main(String[] args) {

        HelperClass way = new HelperClass();
        int[] massivA = {9, 1, 5, 6, 8};
        int[] massivB = {7, 3, 1};
        way.printArray(massivA);
        System.out.println(" Массив А ");
        System.out.println(" \n ");
        way.printArray(massivB);
        System.out.println(" Массив В ");
        System.out.println(" \n ");

        int[] num = new int[8];
        for (int j = 0; j < num.length; j++) {
            if (j < massivA.length) {
                num[j] = massivA[j];

            } else {
                num[j] = massivB[j - 5];
            }
        }
        way.printArray(num);
    }
}


