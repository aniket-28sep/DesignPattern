/**
 * A Factory Pattern or Factory Method Pattern says that just define an
 * interface or abstract class for creating an object but let the subclasses
 * decide which class to instantiate
 */

interface Brick {
    public int area();

    public int perimeter();
}

class SquareBrick implements Brick {
    int side;

    SquareBrick(int s) {
        side = s;
    }

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class CircularBrick implements Brick {
    int radius;

    CircularBrick(int r) {
        radius = r;
    }

    public int area() {
        return (22 * radius * radius) / 7;
    }

    public int perimeter() {
        return (44 * radius) / 7;
    }
}

class BrickFactory {
    public Brick factoryMethod(String type, int size) {
        if (type.equals("Square"))
            return new SquareBrick(size);
        else if (type.equals("Circle"))
            return new CircularBrick(size);
        return null;
    }
}

class FactoryMethodDriver {
    public static void main(String args[]) {
        BrickFactory fact1 = new BrickFactory();
        Brick current = fact1.factoryMethod("Square", 14);
        System.out.println(current.area());
        System.out.println(current.perimeter());
    }
}