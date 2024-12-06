package javaBasic;

/**
 * 多行注释
 * 
 * @author hawkins
 * 
 */
public class Note {
    // 单行注释
    public int a = 123;

    /**
     * 年龄
     */
    public int age;
    /**
     * 姓名
     */
    public String name;

    public enum SexType {
        /**
         * 男性
         */
        Male,
        /**
         * 女性
         */
        Female
    }

    /**
     * 性别
     */
    public SexType sex;

    public Note(int age, String name, SexType sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
