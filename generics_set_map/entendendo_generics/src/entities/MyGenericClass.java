package entities;

public class MyGenericClass<T> {
    T x;

    public MyGenericClass(T x) {
        this.x = x;
    }

    public T getValue() {
        return x;
    }
}
