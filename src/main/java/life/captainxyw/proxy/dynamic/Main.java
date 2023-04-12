package life.captainxyw.proxy.dynamic;

import life.captainxyw.proxy.statik.RealSubject;
import life.captainxyw.proxy.statik.Subject;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        Subject o = (Subject) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                new Class<?>[]{Subject.class},
                new SubjectDynamicProxy(new RealSubject()));
        o.doAction();
    }
}
