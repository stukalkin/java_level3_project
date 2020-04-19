package java3_lesson5;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MainRace {

    public static final CyclicBarrier cb = new CyclicBarrier(5);
    public static final int CARS_COUNT = 4;
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        final Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        final Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), cb);
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
        cb.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        cb.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        System.out.println(race.getStages().get((race.getStages().size())-1).finished.get(0) + " - WINNER!!");
    }
}