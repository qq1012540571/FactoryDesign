package simplefactory;

import com.google.common.base.Enums;

import java.lang.reflect.InvocationTargetException;


/**
 * @author 黄豪强
 * @create 2019/7/24 16:11
 */
public class RealObjectImpl implements RealObject {
    public Object select(String name) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        StarEmue aa = Enums.getIfPresent(StarEmue.class, name).or(StarEmue.NoStar);
        String a = aa.getS();
        Class star = Class.forName(a);
        return star.newInstance();
    }
}
