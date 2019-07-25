package simplefactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author 黄豪强
 * @create 2019/7/24 14:25
 */
public class StarTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
         StarPerson starPerson=StartFactory.getStart("James");
         starPerson.userName();
    }
}
