package chapter06

/**
 * 先调用主构造方法，再调用辅助构造方法
 */
object Test05_Constructor {
  def main(args: Array[String]): Unit = {
    // 调用主构造器
    val student1 = new Student1()
    student1.Student1()

    println("*" * 40)

    val student2 = new Student1("alice")

    println("*" * 40)

    val student3 = new Student1("bob", 25)
  }
}

// 定义一个类
// 之前定义的类都是空参，而在Scala中没有参数的时候可以省略这个括号()
class Student1() {
  // 定义属性
  // 定义属性的过程就是当前在主构造器中进行的操作，就是主构造器的方法体
  // name取默认值null
  var name: String = _
  // age取默认值0
  var age: Int = _

  println("1. 主构造方法被调用")

  // 声明辅助构造方法
  def this(name: String) {
    // 直接调用主构造器
    this()
    println("2. 辅助构造方法一被调用")
    this.name = name
    println(s"name: $name age: $age")
  }

  def this(name: String, age: Int) {
    // 调用辅助构造器，间接调用辅助构造器
    this(name)
    println("3. 辅助构造方法二被调用")
    this.age = age
    println(s"name: $name age: $age")
  }

  // 定义和类名一样的方法就是一个普通方法
  def Student1(): Unit = {
    println("一般方法被调用")
  }
}
