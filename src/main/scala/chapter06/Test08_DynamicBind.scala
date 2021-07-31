package chapter06

/**
 * Scala中属性和方法都是动态绑定的
 */
object Test08_DynamicBind {
  def main(args: Array[String]): Unit = {
    val student: Person8 = new Student8

    // 输出的全部都是student
    println(student.name)
    student.hello()
  }
}

class Person8 {
  val name: String = "person"

  def hello(): Unit = {
    println("hello person")
  }
}

class Student8 extends Person8 {
  // 如果子类和父类中的属性和方法同名一定要加 override 关键字，表示重写
  override val name: String = "student"

  override def hello(): Unit = {
    println("hello student")
  }
}
