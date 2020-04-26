package java3_lesson7;

import java.lang.reflect.Method;

public class mainReflection {

    public static void main(String[] args) {
        start(new testClass("Test1", 28, 1991));
    }


    static void start (Object x) {
        Class a = x.class();
        testClass tC = new testClass("Test2", 29, 1992);
        Method[] methods = a.getDeclaredMethods();
        for (Method o : methods) {
            if (o.isAnnotationPresent(@BeforeSuite.class)) {

            }
        }
    }
}