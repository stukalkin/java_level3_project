package java3_lesson5;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public abstract class Stage {
    public ArrayList <String> finished = new ArrayList<String>();
    protected int length;
    Semaphore semaphore = new Semaphore(2);
    protected String description;
    public abstract void go(Car c);
}
