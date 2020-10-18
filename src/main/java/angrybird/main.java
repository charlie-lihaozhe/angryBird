package angrybird;

import angrybird.util.string.Finding;

public class main {
    public static String knights =
        "Then, when you have found the shrubbery|tree|herring, you must " +
            "cut down the mightiest tree in the forest... " +
            "with... a herring!";

    public static void main(String[] args) {
        Finding finding = new Finding();
        finding.finding();
//        System.out.println(knights.replaceFirst("f\\w+", "located"));
//        System.out.println(knights.replaceAll("shrubbery\\|tree\\|herring", "located"));
    }
}
