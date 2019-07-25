package abstractfactory;

import simplefactory.StarPerson;

/**
 * @author 黄豪强
 * @create 2019/7/25 13:40
 */
public abstract class AbstractFactory {

          public  abstract StarPerson starPerson();

          public  StarPerson getUser(String name)
          {
              if(name.equals("乔丹")) {
                 return new JodrenFactory().starPerson();
              }
              else if(name.equals("詹姆斯"))
              {
                  return new JamesFactory().starPerson();
              }
              else
              {
                  return new NoFactory().starPerson();
              }
          }
}
