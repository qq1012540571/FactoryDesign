package simplefactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author 黄豪强
 * @create 2019/7/24 14:21
 */
public class StartFactory {


    public static StarPerson getStart(String name) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        RealObject realObject = new RealObjectImpl();
        StarProxy starProxy = new StarProxy();
        StarPerson object = (StarPerson) realObject.select(name);
        return starProxy.newInstance(object);
    }
}
