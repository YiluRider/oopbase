package src;

public class OopBaseDemo01 {
    public static void main(String[] args) {
        Person p1=new Person("小明",18);
        Person p2=new Person("小红",17);
//        p1.setAge(18);
//        p1.setName("小明");
//        p2.setAge(17);
//        p2.setName("小红");
        System.out.println(p1.getName()+" "+p1.getAge());
        System.out.println(p2.getName()+" "+p2.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name,int age) {
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
