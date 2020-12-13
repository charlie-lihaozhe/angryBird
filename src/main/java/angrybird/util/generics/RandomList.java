package angrybird.util.generics;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();

    private Random rand = new Random(47);

    public void add(T t) {
        storage.add(t);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList randomList = new RandomList();
        for (String s : ("The quick broud is jump for the lazy dog").split(" ")) {
            randomList.add(s);
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(randomList.select());
        }
    }
}
