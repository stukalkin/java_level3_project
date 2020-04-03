package java3_lesson1.BoxesAndFruits;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    ArrayList<T> listOfFruits;

    public Box(ArrayList<T> listOfFruits) {
        this.listOfFruits = listOfFruits;
    }

    public void info () {
        System.out.println("Количество фруктов:" + this.listOfFruits.size() +
                ". Вес фруктов:" + this.getWeight());
    }

    public float getWeight () {
        float sum = 0;
        for (T i: this.listOfFruits) {
            sum += i.Weight;
        }
        System.out.println("Количество фруктов: " + this.listOfFruits.size() + ". Вес коробки равен: " + sum);
        return sum;
    }

    public boolean compare (Box<?> x) {
        return this.getWeight() == x.getWeight();
    }

    public void toArrayListAdd (int a, T fruit) {
        for (int i = 0; i < a; i++) {
            this.listOfFruits.add(fruit);
        }
    }

    public void shiftingFruits (Box w) {
        System.out.println("\nКоробки до");
        this.info();
        w.info();
        if (this.listOfFruits.get(0).getClass() == w.listOfFruits.get(0).getClass()) {
            this.listOfFruits.addAll(w.listOfFruits);
            w.listOfFruits.clear();
            System.out.println("\nКоробки после");
            this.info();
            w.info();
        } else System.out.println("Попытка добавления фруктов не того типа");
    }

}
