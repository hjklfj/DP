package life.captainxyw.singleton;

/**
 * 工厂模式：Spring的getBean()
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}

class SingletonHungry {
    private static SingletonHungry instance = null;

    private SingletonHungry() {
    }

    public static SingletonHungry getInstace() {
        if (instance == null) {
            synchronized (instance) {
                if(instance == null) {
                    instance = new SingletonHungry();
                }
            }
        }
        return instance;
    }
}