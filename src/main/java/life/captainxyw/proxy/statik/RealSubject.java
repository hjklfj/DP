package life.captainxyw.proxy.statik;

public class RealSubject implements Subject {

    @Override
    public void doAction() {
        System.out.println("do real action");
    }
}
