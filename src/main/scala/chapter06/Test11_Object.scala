package chapter06

object Test11_Object {
  def main(args: Array[String]): Unit = {
    // 使用new生成对象
    // val student11 = new Student11("alice", 18)
    // 使用工厂方法
    val student1 = Student11.newStudent("alice", 18)
    student1.printInfo()

    val student2 = Student11.apply("bob", 19)
    student2.printInfo()

    // 调用apply()方法时可以省略，实际上调用的时伴生对象的apply()方法，在apply()方法中创建了一个Student11类型的对象
    val student3 = Student11("mary", 20)
    student3.printInfo()
  }
}

// 定义类(主构造器私有化)
class Student11 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    // 调用伴生对象中声明的属性：Student11.school
    println(s"student: name = ${name}, age = ${age}, school = ${Student11.school}")
  }
}

// 定义伴生对象
object Student11 {
  // 可以将这个属性看作静态属性
  val school: String = "sch"

  // 定义一个类的对象实例的创建方法(工厂方法)
  // 伴生对象中可以直接访问伴生类的私有成员和方法
  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}
