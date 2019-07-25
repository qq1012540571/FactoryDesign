package abstractfactory;

import simplefactory.Jodren;
import simplefactory.StarPerson;

/**
 * @author 黄豪强
 * @create 2019/7/25 13:46
 */
public class JodrenFactory extends AbstractFactory {
    public StarPerson starPerson() {
        return new Jodren();
    }
}
