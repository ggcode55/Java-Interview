package code2.FactorPattern.AbstractFactory;

import code2.FactorPattern.MailSender;
import code2.FactorPattern.Sender;


public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
