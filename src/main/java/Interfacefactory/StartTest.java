package Interfacefactory;

import Interfacefactory.StarFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author 黄豪强
 * @create 2019/7/25 10:14
 */
public class StartTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

            Factory factory= StarFactory.factory("乔丹");
            factory.getStar();
    }
}
