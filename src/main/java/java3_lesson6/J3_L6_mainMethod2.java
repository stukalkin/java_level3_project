package java3_lesson6;

public class J3_L6_mainMethod2 {

    public static void main(String[] args) {

//        int[] TestArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
//        int[] TestArray2 = {2, 4, 4, 2, 3, 7};
//        int[] TestArray3 = {1, 2, 1, 7};
//        int[] TestArray4 = {2, 7};
//        System.out.println(find1or4InArray(TestArray));
//        System.out.println(find1or4InArray(TestArray2));
//        System.out.println(find1or4InArray(TestArray3));
//        System.out.println(find1or4InArray(TestArray4));

    }

    public boolean find1or4InArray(int[] array) {
        boolean has1inArray = false;
        boolean has4inArray = false;
        boolean isArrayNice = false;

        for (int value : array) {
            if (value == 4) {
                has4inArray = true;
            }
            if (value == 1) {
                has1inArray = true;
            }
        }

        if (has1inArray && has4inArray) isArrayNice = true;
        return isArrayNice;
    }
}
