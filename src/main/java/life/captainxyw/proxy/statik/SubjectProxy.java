package life.captainxyw.proxy.statik;

public class SubjectProxy implements Subject {

    private Subject subject;

    public SubjectProxy() {
        this.subject = new RealSubject();
    }

    @Override
    public void doAction() {
        System.out.println("before doAction...");
        subject.doAction();
        System.out.println("after doAction...");
    }

    public static void main(String[] args) {
        SubjectProxy subjectProxy = new SubjectProxy();
        subjectProxy.doAction();
    }
}
