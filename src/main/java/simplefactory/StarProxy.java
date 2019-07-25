package simplefactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 黄豪强
 * @create 2019/7/24 15:57
 */
public class StarProxy implements InvocationHandler {

    StarPerson starPerson;

    public StarPerson newInstance(StarPerson object) {
           this.starPerson=object;
        return (StarPerson)Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始选拔全明星");
        method.invoke(starPerson,args);
        System.out.println("结束选拔全明星");
        return null;
    }
}
