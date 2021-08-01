package chapter06

object Test17_Extends {
  def main(args: Array[String]): Unit = {
    // 1. 类型的检测和转换
    val student: Student17 = new Student17("alice", 18)
    student.study()
    student.sayHi()
    // 子类对象赋值给父类引用
    val person: Person17 = new Student17("bob", 20)
    // 多态，调用子类方法
    person.sayHi()

    println("student is Student17: " + student.isInstanceOf[Student17])
    println("student is Person17: " + student.isInstanceOf[Person17])
    // person实际上也是一个Student17
    println("person is Student17: " + person.isInstanceOf[Student17])
    println("person is Person17: " + person.isInstanceOf[Person17])

    val person2: Person17 = new Person17("cary", 35)
    println("person2 is Student17: " + person2.isInstanceOf[Student17])
    println("person2 is Person17: " + person2.isInstanceOf[Person17])

    // 类型转换
    if(person.isInstanceOf[Student17]) {
      val newStudent = person.asInstanceOf[Student17]
      newStudent.study()
    }

    // 所属类定义
    println(classOf[Student17])

    // 2. 测试枚举类
    println(WorkDay.MONDAY)
    println(WorkDay.TUESDAY)
  }
}

class Person17(val name: String, val age: Int) {
  def sayHi(): Unit = {
    println("hi from person " + name)
  }
}

class Student17(name: String,age: Int) extends Person17(name, age) {
  override def sayHi(): Unit = {
    println("hi from student " + name)
  }

  def study(): Unit = {
    println("student study")
  }
}

// 定义枚举类对象
object WorkDay extends Enumeration {
  // 枚举对象中的数字和名称
  val MONDAY = Value(1, "Monday")
  val TUESDAY = Value(2, "Tuesday")
}

// 定义应用类对象
object TestApp extends App {
  println("app start")

  // 使用type定义别名
  type MyString = String
  val a: MyString = "abc"
  println(a)
}