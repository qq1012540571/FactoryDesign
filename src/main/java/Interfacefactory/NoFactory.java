package Interfacefactory;

import simplefactory.NoStar;

/**
 * @author 黄豪强
 * @create 2019/7/25 11:09
 */
public class NoFactory implements Factory {
    public void getStar() {
        new NoStar().userName();
    }
}
