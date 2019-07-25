package abstractfactory;

import simplefactory.James;
import simplefactory.StarPerson;

/**
 * @author 黄豪强
 * @create 2019/7/25 13:45
 */
public class JamesFactory extends  AbstractFactory {
    public StarPerson starPerson() {
        return new James();
    }
}
