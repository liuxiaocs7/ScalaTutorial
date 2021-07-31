public class TestDynamicBind {
    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println(worker.name);
        worker.hello();
        worker.hi();

        System.out.println("==================================");

        // 测试多态：将子类的对象传递给父类的引用
        Person person = new Worker();
        // 静态绑定属性：person
        System.out.println(person.name);
        // 动态绑定方法：hello worker
        person.hello();
        // person.hi();  // error Person中没有hi()方法
    }
}

class Person {
    String name = "person";
    public void hello() {
        System.out.println("hello person");
    }
}

class Worker extends Person {
    String name = "worker";

    @Override
    public void hello() {
        System.out.println("hello worker");
    }

    public void hi() {
        System.out.println("hi worker");
    }
}
