package Interfacefactory;

import simplefactory.Jodren;

/**
 * @author 黄豪强
 * @create 2019/7/25 10:12
 */
public class JodrenFactory implements  Factory {
    public void getStar() {
        new Jodren().userName();
    }
}
