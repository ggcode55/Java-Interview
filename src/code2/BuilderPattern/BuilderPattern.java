package code2.BuilderPattern;

import code2.FactorPattern.MailSender;
import code2.FactorPattern.Sender;
import code2.FactorPattern.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description : 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，
 * 所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的 Test 结合起来得到的。
 * @Autoor: rocco
 * @date: 2019/3/7
 */
public class BuilderPattern {
    private List<Sender> list=new ArrayList<>();

    public void produceMailSender(int count){
        for (int i = 0; i <count ; i++) {
            list.add(new MailSender() );
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0; i <count ; i++) {
            list.add(new SmsSender());
        }
    }
}
