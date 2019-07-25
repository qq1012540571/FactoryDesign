package abstractfactory;

import simplefactory.NoStar;
import simplefactory.StarPerson;

/**
 * @author 黄豪强
 * @create 2019/7/25 13:51
 */
public class NoFactory extends  AbstractFactory {
    public StarPerson starPerson() {
        return new NoStar();
    }
}
