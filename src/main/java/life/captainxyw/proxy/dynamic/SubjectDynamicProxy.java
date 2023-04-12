package life.captainxyw.proxy.dynamic;

import life.captainxyw.proxy.statik.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectDynamicProxy implements InvocationHandler {

    private Subject s;

    public SubjectDynamicProxy(Subject s) {
        this.s = s;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoking...");
        Object result = method.invoke(s, args);
        System.out.println("after invoking...");
        return result;
    }
}
