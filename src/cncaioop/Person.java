package cncaioop;
//现有类后又对象
public class Person {
    //类中有属性和方法
    //类的属性一般没有值
    private String name;
    private int age;
    //static类方法，不用创建对象
    public static void demo(String name){
        System.out.println("name:shi"+name);
    }

    //属性可以生成set,get方法
    //get返回属性的值
    public String getName() {
        return name;
    }
    //set有参无返，给属性赋值
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    //判断输入的属性是否正确
    public void setAge(int age) {

        if (age<0){
            this.age = 0;
        }else{
            this.age = age;
        }

    }

    public void show() {
        //打印属性
        System.out.println("姓名是：" + this.name + "    "+"年龄是：" + this.age);
    }

}