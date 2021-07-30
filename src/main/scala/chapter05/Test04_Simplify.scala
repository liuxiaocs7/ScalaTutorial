package chapter05

/**
 * 函数至简原则
 */
object Test04_Simplify {
  def main(args: Array[String]): Unit = {

    def f0(name: String): String = {
      return name
    }
    println(f0("liuxiaocs"))

    println("=" * 40)

    // (1) return可以省略，Scala会使用函数体的最后一行代码作为返回值
    def f1(name: String): String = {
      name
    }
    println(f1("liuxiaocs"))

    println("=" * 40)

    // (2) 如果函数体只有一行代码，可以省略花括号
    def f2(name: String): String = name

    println(f2("liuxiaocs"))

    println("=" * 40)

    // (3) 返回值类型如果能够推断出来，郡么可以省略(:和返回値类型一起省略)
    def f3(name: String) = name

    println(f3("liuxiaocs"))

    println("=" * 40)

    // (4) 如果有return，则不能省略返回值类型，必须指定
    // 下面这种写法是错误的
    /*def f4(name: String) = {
      return name
    }*/
    def f4(name: String): String = {
      return name
    }
    println(f4("liuxiaocs"))

    println("=" * 40)

    // (5) 如果函数明确声明unit，那么即使函数体中使用return关键字也不起作用
    def f5(name: String): Unit = {
      // 函数中的return不起作用
      return name
    }
    println(f5("liuxiaocs"))

    println("=" * 40)

    // (6) Scala如果期望是无返回值类型，可以省略等号
    // 是一个过程，没有返回值(映射关系)
    def f6(name: String) {
      println(name)
    }
    println(f6("liuxiaocs"))

    println("=" * 40)

    // (7) 如果函数无参，但是声明了参数列表(有一个空括号)，那么调用时，小括号，可加可不加
    def f7(): Unit = {
      println("liuxiaocs")
    }
    f7()
    // 不写小括号也可以调用
    f7

    println("=" * 40)

    // (8) 如果函数没有参数列表，那么小括号可以省路，调用时小括号必须省略
    // 声明方法时没有参数列表
    def f8: Unit = {
      println("liuxiaocs")
    }
    // 只能通过不写小括号的方式调用
    f8

    println("=" * 40)

    // (9) 如果不关心名称，只关心逻辑处理，那么函数名(def)可以省略
    // 这个函数没有名称，只有参数和函数体(匿名函数/lambda表达式)
    (name: String) => { println(name) }

    println("=" * 40)
  }
}
