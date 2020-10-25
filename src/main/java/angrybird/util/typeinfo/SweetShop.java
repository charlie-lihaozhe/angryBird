package angrybird.util.typeinfo;

class Candy {
    static {
        System.out.println("loading candy.");
    }
}

class Gum {
    static {
        System.out.println("loading Gum.");
    }
}

class Cookie {
    static {
        System.out.println("loading Cookie.");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main.");
        new Candy();
        System.out.println("after create candy.");
//        try {
//            Class.forName("Gum");
//        } catch (Exception e) {
//            System.out.println("can't find candy.");
//        }
        new Gum();
        try {
            Class.forName("Gum");
        } catch (Exception e) {
            System.out.println("can't find candy.");
        }
    }


}
