package code2.FactorPattern.MethodFactory;

import code2.FactorPattern.MailSender;
import code2.FactorPattern.Sender;
import code2.FactorPattern.SmsSender;

/**
 * @标题: Intereview .
 * @包名 code2 .
 * @描述: .
 * @作者: nerson .
 * @日期: 2019 2019/3/7  .
 * @公司: 上海悦商科技 .
 */
public class SendFactory {
    /**
     * 普通工厂 ，如果传递的字符串出错，则不能正确创建对象
     * @param type
     * @return
     */
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }


    /**
     * 多个工厂方法模式 是提供多个工厂方法，分别创建对象。
     * @return
     */
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }

    /***
     * 静态工厂方法模式 将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可
     */
    public static Sender staticProduceMail(){
        return new MailSender();
    }

    public static Sender staticProduceSms(){
        return new SmsSender();
    }
}
