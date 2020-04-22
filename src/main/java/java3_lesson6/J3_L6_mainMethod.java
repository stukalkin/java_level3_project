package java3_lesson6;

import java.util.Arrays;

public class J3_L6_mainMethod {

    public static void main(String[] args) {
//        int [] TestArray = {1, 2, 4, 4, 2, 3, 4, 1, 7 };
//        int [] TestArray2 = {1, 2, 4, 4, 2, 3, 1, 7 };
//        int [] TestArray3 = {1, 2, 1, 7 };
//        int [] TestArray4 = {4, 1, 2, 1, 7 };
//        findArrayAfter4(TestArray);
//        findArrayAfter4(TestArray2);
//        findArrayAfter4(TestArray3);
//        findArrayAfter4(TestArray4);
    }

    public int[] findArrayAfter4 (int [] array) {
        int coordination = -1; //будет координатой последней четверки

        for (int i = 0; i < array.length; i++) { //находим координату последней четверки
            if (array[i] == 4) {
                coordination = i;
            }
        }

        if (coordination == -1) throw new RuntimeException("Нет четверок в исходном массиве");

        int [] result = new int[array.length-(coordination+1)]; //создаем новый массив нужной размерности


        if (array.length - 1 - coordination >= 0)
            System.arraycopy(array, coordination + 1, result, 0, array.length - 1 - coordination);

        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Полученный массив: " + Arrays.toString(result) + "\n");

        return result;
    }
}
