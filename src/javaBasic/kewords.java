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