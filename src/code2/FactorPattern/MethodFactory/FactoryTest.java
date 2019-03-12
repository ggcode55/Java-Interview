package code2.FactorPattern.MethodFactory;

import code2.FactorPattern.MethodFactory.SendFactory;
import code2.FactorPattern.Sender;

/**
 * @标题: Intereview .
 * @包名 code2 .
 * @描述: .
 * @作者: nerson .
 * @日期: 2019 2019/3/7  .
 * @公司: 上海悦商科技 .
 */
public class FactoryTest {
    public static void main(String[] args) {
        //普通工厂 ，如果传递的字符串出错，则不能正确创建对象
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("mail");


        //多个工厂方法模式是提供多个工厂方法，分别创建对象。
        SendFactory factory1 = new SendFactory();
        Sender sender1 =  factory1.produceMail();
        Sender sender2 =  factory1.produceSms();

        //静态工厂方法模式 将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可
        Sender sender3 =SendFactory.staticProduceMail();
        sender1.send();
    }

}
