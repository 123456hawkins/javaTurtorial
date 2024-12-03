package javaBasic;

/**
 * Java的48个关键字及2个保留字
 */

// abstract
abstract class Animal {
    abstract void makeSound();

    public void sleep() {
        System.out.println("this animal is sleeping");// ""用于表示字符串，''用于表示单个字符
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("THE DOG BARKS");
    }

}

public class Keyords {
    // boolean
    boolean isStudent = true;

    // byte
    // 用于表示一个 8 位（1 字节）有符号整数。它的值范围是 -128（-2^7）到 127（2^7 - 1）。
    // 由于 byte 类型占用的空间较小，它通常用于处理大量的数据，如文件读写、网络传输等场景，以节省内存空间。
    byte maxBytes = 127;
    byte minBytes = -128;
    float f1 = 3.14f; // 注意要在数字后面加上 f 表示这是一个 float 类型
    float f2 = 1.23e-4f; // 科学计数法表示小数

    // case
    void testCase(int testnum) {
        switch (testnum) {
            case 1:

                break;

            default:
                break;
        }
    }

    // catch
    void testCatch() {
        try {
            System.out.println("123");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    // char
    // 表示单个Unicode字符
    char c = 'A';

    // do
    void testDo() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    // break continue
    void testBreak() {
        for (int i = 0; i < 5; i++) {
            if (i == 5) {
                break;
            }
            if (i == 4) {
                // 跳过当前循环
                continue;
            }
        }
    }

    void testDouble() {
        double a = 3.1415;
        double c = a + 1.2;
        System.out.println(a + c);
    }

    public enum PlayerType {
        TENNIS,
        FOOTBALL,
        BASKETBALL
    }

    void testExtends() {
        SuperMan s = new SuperMan("hawkins", 23, true);
        s.sayHello();
        s.showPower();
    }

    void testTry() {
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("发生异常" + e.getMessage());
        } finally {
            System.out.println("执行finally");
        }
    }

    void testInstanceOf() {
        Keyords k = new Keyords();
        System.out.println(k instanceof Keyords);
    }

    public static void main(String[] args) {
        // 要想在访问方法 1.将该方法设为static静态 2.实例化
        // 静态方法 (static
        // 方法)：静态方法是属于类本身的，而不是类的实例（对象）。这意味着静态方法在类加载时就已经存在，并且可以通过类名直接调用。静态方法不依赖于类的实例，因此在调用时不需要创建对象。
        Keyords k = new Keyords();
        k.testDo();
        k.testDouble();
        k.testExtends();
        k.testTry();
        k.testInstanceOf();
    }

}

// class
class Person {
    // private表示该变量或者函数只对当前类可见
    private String name;
    private int age;
    public int count;
    // 一个访问权限修饰符，表示方法或变量对同一包内的类和所有子类可见。
    protected int protectValue;
    final private long x = 1000000L;
    // short占用 2 个字节（16 位）的内存空间。取值范围为2的-15次方-1到2的15次方-1
    public short s1 = 255;
    // final 变量：表示一个常量，一旦被赋值，其值就不能再被修改。这在声明不可变的值时非常有用。
    // final 方法表示一个不能被子类重写的方法。这在设计类时，确保某个方法的实现不会被子类修改时非常有用。
    final double PI = 3.1415926;

    // 等价于其他语言的const
    private static final String hi = "srgerg";
    public static int st1 = 123;

    public static void getClassHelp() {
        System.out.println("help");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("hello");
    }

    // 同步代码
    public synchronized void increment() {
        count++;
    }

    public void doSomething() {
        synchronized (this) {
            // 同步代码
        }
    }

    // throws和throw
    public void doOther(int num) throws Exception{
        if (num<0) {
            throw new Exception("num must be bigger than0")
        }
    }

}

class SuperMan extends Person {
    private boolean canFly;

    public SuperMan(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
        // 报错，无法修改父类final
        // this.PI = 3.265;
    }

    // getter
    public boolean isCanFly() {
        return canFly;
    }

    // setter
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("i am a superman");
    }

    public void showPower() {
        if (canFly) {
            System.out.println("fly on the sky");
        }
    }

    public void printProtect() {
        System.out.println(this.protectValue);
    }

    public void printStatic() {
        System.out.println(Person.st1);
        Person.getClassHelp();
    }

}

final class TestClass {
    void say() {
        System.out.println("hahahaha");
    }
}

// 报错，无法继承final类
// class TC2 extends TestClass {

// }

// interface
// 用于声明接口。会定义一组方法的签名（即方法名、参数列表和返回值类型），但没有方法体。其他类可以实现接口，并提供方法的具体实现。
interface TestInterface {
    void sayHello();

    int f1(String msg, String msg2);
}

// implements
// 实现接口
class A implements TestInterface {
    @Override
    public int f1(String msg, String msg2) {
        if (msg == msg2) {
            return 0;
        }
        return 1;
    }

    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}