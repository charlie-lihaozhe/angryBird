package angrybird.util.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finding {
    public void finding() {
        Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnets's wings");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();

        int i = 0;
        while (m.find(i)) {
            System.out.print(m.group() + " ");
            i++;
        }
    }

}
