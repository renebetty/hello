import cncaioop.Person;

public class Main {

    public static void main(String[] args) {
        //1:通过类创建一个对象
        Person caixi01 = new Person();
        //2:给对象的属性赋值
        caixi01.setName("蔡茜");
        caixi01.setAge(29);

        Person caixi02 = new Person();
        caixi02.setName("lisi");
        caixi02.setAge(-28);
        caixi01.show();
        caixi02.show();
        Person.demo("sahgnsan");

    }
}
