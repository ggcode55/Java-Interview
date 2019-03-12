package code2.FactorPattern.AbstractFactory;

import code2.FactorPattern.Sender;
import code2.FactorPattern.SmsSender;

/**
 * @标题: Intereview .
 * @包名 code2.FactorPattern.AbstractFactory .
 * @描述: .
 * @作者: nerson .
 * @日期: 2019 2019/3/7  .
 * @公司: 上海悦商科技 .
 */
public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
