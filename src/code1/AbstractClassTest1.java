package code1;

/**
 * @Description :
 * @Autoor: rocco
 * @date: 2019/3/8
 */
public class AbstractClassTest1 extends  AbstractClassTest {


    public AbstractClassTest1(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("aa");
    }
}
