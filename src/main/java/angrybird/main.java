package angrybird;

import angrybird.util.string.Finding;
import java.util.Arrays;
import java.util.regex.Pattern;

public class main {
    public static String knights =
        "Then, when you have found the shrubbery|tree|herring, you must " +
            "cut down the mightiest tree in the forest... " +
            "with... a herring!";

    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 3)));
    }
}
