package abstractfactory;

import simplefactory.StarPerson;

/**
 * @author 黄豪强
 * @create 2019/7/25 14:12
 */
public class NoActionFactory extends  AbstractFactory {
    public StarPerson starPerson() {
        return null;
    }
}
