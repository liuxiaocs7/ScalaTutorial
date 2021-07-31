package chapter06

// 匿名子类一般都是针对抽象类或接口来使用的
object Test10_AnnoymousClass {
  def main(args: Array[String]): Unit = {
    // 必须要将抽象属性和方法都实现出来
    val person: Person10 = new Person10 {
      override var name: String = "alice"

      override def eat(): Unit = println("person eat")
    }
    println(person.name)
    person.eat()
  }
}

// 定义抽象类
abstract class Person10 {
  var name: String
  def eat(): Unit
}
