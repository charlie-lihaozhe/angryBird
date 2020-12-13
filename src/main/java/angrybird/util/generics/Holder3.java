package angrybird.util.generics;

public class Holder3<T> {
    private T a;
    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
//        Holder3<automobile>
    }



}
