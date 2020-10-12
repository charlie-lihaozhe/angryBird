package angrybird.util.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
    public void statistic() {
        // 这里只是指定种子数，真正随机数的范围要使用nextint来指定
        Random rand = new Random(20);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < 1000; i++) {
            int r = rand.nextInt(20);
            Integer freq = map.get(r);
            // 更优雅的getNum == null的写法
            map.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
    }

}
