package angrybird.util.typeinfo;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() {
        System.out.println("I will draw: " + this);
    }
    abstract public String toString();
}

class circle extends Shape {
    public String toString() {
        return "this is circle";
    }
}

class square extends Shape {
    public String toString() {
        return "this is square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "this is Triangle";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new circle(), new square(), new Triangle());

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}