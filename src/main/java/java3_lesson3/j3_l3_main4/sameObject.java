package java3_lesson3.j3_l3_main4;

import java.io.Serializable;

public class sameObject implements Serializable {
    String name;
    int param;
    String hello = "Ну здорова";

    public sameObject(String name, int param) {
        this.name = name;
        this.param = param;
    }

    public void info () {
        System.out.println(this.name + " / " + this.param + " / " + this.hello);
    }
}
