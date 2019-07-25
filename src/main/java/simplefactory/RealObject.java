package simplefactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author 黄豪强
 * @create 2019/7/24 16:10
 */
public interface RealObject {
    public Object select(String name) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException;
}
