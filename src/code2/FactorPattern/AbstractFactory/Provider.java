package code2.FactorPattern.AbstractFactory;

import code2.FactorPattern.Sender;

/**
 * @标题: Intereview .
 * @包名 code2.FactorPattern .
 * @描述: .
 * @作者: nerson .
 * @日期: 2019 2019/3/7  .
 * @公司: 上海悦商科技 .
 */
public interface Provider {
    public Sender produce();
}
