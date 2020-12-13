package angrybird.util.containers;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SpringDetector {
    public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception{
        Constructor<T> ghog = type.getConstructor(int.class);
        Map<Groundhog, Prediction> map = new HashMap<Groundhog, Prediction>();
        for (int i = 0; i < 10; i++) {
            map.put(ghog.newInstance(i), new Prediction());
        }
        for (Entry<Groundhog, Prediction> entry : map.entrySet()) {
            System.out.println("Entry key " + entry.getKey() + " hashcode is " + entry.getKey().hashCode());
        }
        System.out.println("map = " + map);
        Groundhog ghog3 = ghog.newInstance(3);
        System.out.println("Looking up prediction for " + ghog3);
        System.out.println("ghog3 hash code is " + ghog3.hashCode());
        if (map.containsKey(ghog3)) {
            System.out.println(map.get(ghog3));
        } else {
            System.out.println("Key not found " + ghog3);
        }
    }

    public static void main(String[] args) throws Exception {
        detectSpring(Groundhog.class);
    }

}
