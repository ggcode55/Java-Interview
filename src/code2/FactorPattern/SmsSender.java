package code2.FactorPattern;

/**
 * @标题: Intereview .
 * @包名 code2 .
 * @描述: .
 * @作者: nerson .
 * @日期: 2019 2019/3/7  .
 * @公司: 上海悦商科技 .
 */
public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
