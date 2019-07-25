package abstractfactory;

import simplefactory.StarPerson;

/**
 * @author 黄豪强
 * @create 2019/7/25 13:52
 */
public class StartTest {

    public static void main(String[] args) {
        AbstractFactory abstractFactory=new NoActionFactory();
        StarPerson starPerson=abstractFactory.getUser("达大厦");
        starPerson.userName();
    }
}
