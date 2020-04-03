package java3_lesson1;

public class ArrayType <T> {
    private T [] x;

    public ArrayType(T... x) {
        this.x = x;
    }

    public T[] getArr() {
        return x;
    }

    public void setArr(T[] x) {
        this.x = x;
    }
}
