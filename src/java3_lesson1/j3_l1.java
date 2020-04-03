package java3_lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class j3_l1 {

    public static void main(String[] args) {
        ArrayType<String> arr0 = new ArrayType<>("abc", "def", "sdf", "sadas");
        changePlace(arr0);
        toArrayList(arr0);
    }

    //метод смены мест элементов массива, вводить можно одномерные массивы любого размера
    private static void changePlace (ArrayType<?> arr) {
        Object[] arrx = new Object[arr.getArr().length];
        for (int i =0; i < arr.getArr().length; i++) {
            arrx[(arr.getArr().length-1)-i] = arr.getArr()[i];
        }
        System.out.println("Массив был " + Arrays.toString(arr.getArr()));
        System.out.println("Масcив стал" + Arrays.toString(arrx) + "\n");
    }

    //метод преобразования в arrayList
    private static void toArrayList(ArrayType<?> arr) {
        ArrayList<Object> arrayList = new ArrayList<>(Arrays.asList(arr.getArr()));
        System.out.println("Теперь это уже ArrayList " + arrayList);
    }
}