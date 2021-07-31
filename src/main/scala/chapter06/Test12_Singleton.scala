package chapter06

object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    // 因为构造器私有了，只能通过getInstance()或者实例
    val student1 = Student12.getInstance()
    student1.printInfo()
    println(student1)

    val student2 = Student12.getInstance()
    student2.printInfo()
    println(student2)
  }
}

class Student12 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student: name = ${name}, age = ${age}, school = ${Student11.school}")
  }
}

// 饿汉式
//object Student12 {
//  private val student: Student12 = new Student12("alice", 18)
//  def getInstance(): Student12 = student
//}

// 懒汉式
object Student12 {
  // 因为后续会更改，这里需要写var而不是val
  private var student: Student12 = _
  def getInstance(): Student12 = {
    if (student == null) {
      // 如果没有对象实例的话，就创建一个
      student = new Student12("alice", 12)
    }
    student
  }
}