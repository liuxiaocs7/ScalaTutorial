package chapter05

object Test13_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(13, 47)

    println("1. 函数调用")
    // 只有在第一次出现result应用时才调用函数进行计算(相当于一个传名参数)
    println("2. result = " + result)
    // result的值已经算出来了，不需要再次计算了
    println("4. result = " + result)
  }

  def sum(a: Int, b: Int): Int = {
    println("3. sum调用")
    a + b
  }
}
