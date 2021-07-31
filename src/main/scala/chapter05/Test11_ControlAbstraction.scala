package chapter05

object Test11_ControlAbstraction {
  def main(args: Array[String]): Unit = {
    // 1. 传值参数
    def f0(a: Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }
    f0(23)

    def f1(): Int = {
      println("f1调用")
      12
    }
    f0(f1())

    print("=" * 40)

    // 2. 传名参数
    // 将一段可执行的代码传递给了某个变量
    // =>Int 表示一段代码块，代码块的返回值是Int，没有参数类型【类似匿名函数的定义方式】
    // 传递的不再是具体的值，而是代码块
    def f2(a: =>Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }

    // f1的执行次数是由f2确定的
    // 将f2中的a都替换成f1()，即f1函数的调用
    f2(f1())
    f2({23})
    // 只有一个参数{}可以省略
    f2(23)

    // 将这个代码块替换给a做一个控制抽象
    f2({
      println("这是一个代码块")
      29
    })
  }
}
