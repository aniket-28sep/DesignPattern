/**
 * define a class that has only one instance and provides a global point of
 * access to it
 */

class Singleton {

    static private Singleton obj;
    // private constructor
    private Singleton() {

    }
    synchronized static Singleton getInstance() {
        if (obj == null)
            obj = new Singleton();
        return obj;
    }
}

public class SingletonDriver {
    public static void main(String[] args) {
        Singleton inst = Singleton.getInstance();
        Singleton inst2 = Singleton.getInstance();
        if (inst == inst2)
            System.out.println("They are Same");
    }
}
