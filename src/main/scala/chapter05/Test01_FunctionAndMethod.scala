package chapter05

object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {
    // 定义函数
    def sayHi(name: String): Unit = {
      println("hi, " + name)
    }

    // 调用函数，优先调用里面的函数
    sayHi("alice")

    // 调用对象方法(基于对象调用)
    Test01_FunctionAndMethod.sayHi("bob")

    // 获取方法返回值
    val result = Test01_FunctionAndMethod.sayHello("cary")
    print(result)
  }

  // 定义对象的方法，作用域不一样
  def sayHi(name: String): Unit = {
    println("Hi, " + name)
  }

  def sayHello(name: String): String = {
    println("Hello, " + name)
    return "Hello"
  }
}
