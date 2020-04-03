package java3_lesson1.BoxesAndFruits;

import java.util.ArrayList;

public class BoxesAndFruitsMain {

    public static void main(String[] args) {

        Box<Orange> boxOr1 = new Box<>(new ArrayList<>());
        Box<Orange> boxOr2 = new Box<>(new ArrayList<>());
        Box<Apple> boxAp1 = new Box<>(new ArrayList<>());
        Box<Apple> boxAp2 = new Box<>(new ArrayList<>());

        boxOr1.toArrayListAdd(3, new Orange());
        boxOr2.toArrayListAdd(2, new Orange());
        boxAp1.toArrayListAdd(3, new Apple());
        boxAp2.toArrayListAdd(1, new Apple());

        System.out.println("Сравниваем коробки");
        System.out.println(boxAp1.compare(boxOr2));
        System.out.println(boxOr1.compare(boxAp2));

        System.out.println("\nПопытка 1 перекладывания фруктов");
        boxAp1.shiftingFruits(boxOr1);

        System.out.println("\nПопытка 2 перекладывания фруктов");
        boxAp2.shiftingFruits(boxAp1);
    }
}
