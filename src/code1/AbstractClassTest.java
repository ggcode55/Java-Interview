package code1;

/**
 * @Description :
 *
 *
 * 1.抽象类不能被实例化。
 *
 * 2.抽象类可以有构造函数，如果是有参构造，被继承时子类必须继承父类一个构造方法，抽象方法不能被声明为静态。
 *
 * 如果抽象类中包含无参构造  可以不必继承构造方法
 *
 * 3.抽象方法只需申明，而无需实现，抽象类中可以允许普通方法有主体
 *
 * 4.含有抽象方法的类必须申明为抽象类
 *
 * 5.抽象的子类必须实现抽象类中所有抽象方法，否则这个子类也是抽象类。
 *
 * @Autoor: rocco
 * @date: 2019/3/8
 */
public abstract class AbstractClassTest {
    private  String name;
    private Integer age;



    public AbstractClassTest(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public AbstractClassTest(String name) {
        this.name = name;
    }

    public abstract void say();
    public  void say1(){
        System.out.println("aaa");
    };

    public static void main(String[] args) {
        System.out.println("aa");
    }
}
