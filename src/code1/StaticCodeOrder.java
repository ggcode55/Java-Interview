package code1;

/**
 * @Description :
 * @Autoor: rocco
 * @date: 2019/3/10
 */
public class StaticCodeOrder {
        public static void main(String[] args) {
            new Leaf();
           new Leaf().say();
    }
}
class Root{
    private  static String name="张三";
    public Root(){
        System.out.println("Root的无参构造函数。");
    }

    static {
        System.out.println("Root的静态初始化块。");
    }
    {
        System.out.println("Root的普通初始化块。"+name);
    }

}

class Mid extends Root{
    static {
        System.out.println("Mid的静态初始化块。");
    }
    {
        System.out.println("Mid的普通初始化块。");
    }
    public Mid() {
        System.out.println("Mid的无参构造函数。");
    }
    public Mid(String msg) {
        System.out.println("Mid的有参数构造函数，参数值为:" + msg);
    }
    public  void say(){
        System.out.println("aaa");
    }
}

class Leaf extends Mid{
    static {
        System.out.println("Leaf的静态初始化块。"+"\n");
    }
    {
        System.out.println("Leaf的普通初始化块。");
    }
    public Leaf() {
        super("Leaf传给Mid");
        System.out.println("Leaf的无参构造函数。"+"\n");
    }

    public  void say(){
        System.out.println("bb");
    }
}


