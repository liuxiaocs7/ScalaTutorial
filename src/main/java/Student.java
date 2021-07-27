public class Student {
    private String name;
    private Integer age;
    public static String school = "School";

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        // school 属性没有通过对象进行访问，而是直接通过类来访问
        System.out.println(this.name + " " + this.age + " " + Student.school);
    }

    public static void main(String[] args) {
        Student alice = new Student("alice", 20);
        Student bob = new Student("bob", 23);
        alice.printInfo();
        bob.printInfo();
    }
}
