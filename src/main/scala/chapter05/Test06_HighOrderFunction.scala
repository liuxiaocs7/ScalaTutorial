package chapter05

object Test06_HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f调用")
      n + 1
    }

    def fun(): Int = {
      println("fun调用")
      1
    }

    val result: Int = f(123)
    println(result)

    // 调用fun函数
    fun()
    fun

    // 1. 函数作为值进行传递
    // val f1 = f(_)
    // 表示f是一个函数
    // f1是一个函数类型，参数是Int，返回值也是Int
    val f1: Int => Int = f
    // f2 要的是f的函数体，函数类型会推断出来
    val f2 = f _

    println("=" * 40)

    println(f1)
    println(f1(12))
    println(f2)
    println(f2(35))

    println("=" * 40)

    // 参数为空，返回值为Int
    val f3: () => Int = fun
    val f4 = fun _

    println(f3)
    println(f4)

    println("=" * 40)

    // 2. 函数作为参数进行传递
    // 定义二元运算函数
    // 当前的操作是一个函数，这个函数有两个Int类型的参数，返回值也是Int
    // a, b是对应的操作数
    def dualEval(op: (Int, Int)=>Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 12, 35))
    println(dualEval((a, b) => a + b, 12, 35))
    println(dualEval(_ + _, 12, 35))

    println("=" * 40)

    // 3. 函数作为函数的返回值返回
    // Int => Unit是内层函数f6()的类型
    def f5(): Int => Unit = {
      def f6(a: Int): Unit = {
        println("f6调用 " + a)
      }
      f6  // 将函数直接返回
    }

    // 得到一个函数f6的引用
    val f6 = f5()
    println(f6)
    // 函数f6的返回值是Unit，因此最后的打印结果中是()
    println(f6(25))

    // 得到同样的结果
    println(f5()(25))
  }
}
