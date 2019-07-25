package Interfacefactory;

/**
 * @author 黄豪强
 * @create 2019/7/25 10:13
 */
public class StarFactory {

        public static Factory factory(String name)
        {
            if(name.equals("乔丹")) {
                return new JodrenFactory();
            }
            else if(name.equals("詹姆斯"))
            {
                 return new JamesFactory();
            }
            else
            {
                return new NoFactory();
            }
        }
}
