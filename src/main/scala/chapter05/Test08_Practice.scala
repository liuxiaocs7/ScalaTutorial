package chapter05

object Test08_Practice {
  def main(args: Array[String]): Unit = {
    // 1. 练习1
    val fun1 = (i: Int, s: String, c: Char) => { if (i == 0 && s == "" && c == '0') false else true}
    val fun = (i: Int, s: String, c: Char) => { !(i == 0 && s == "" && c == '0') }

    println(fun(0, "", '0'))
    println(fun(0, "", '1'))
    println(fun(23, "", '0'))
    println(fun(0, "hello", '0'))

    println("=" * 40)

    // 2. 练习2
    // 将练习1分成了三个步骤
    // f2的类型就是f1的返回值类型
    // f1的类型就是func的返回值类型  String作为输出，返回值是(Char => Boolean)
    def func(i: Int): String => (Char => Boolean) = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0') false else true
        }
        f2
      }
      f1
    }
    println(func(0)("")('0'))
    println(func(0)("")('1'))
    println(func(23)("")('0'))
    println(func(0)("hello")('0'))

    println("=" * 40)

    // 匿名函数简写
    // func1函数的大括号里面只有一个匿名函数就表示返回了
    // 匿名函数不需要写函数的返回值
    def func1(i: Int): String => (Char => Boolean) = {
      (s: String) => {
        (c: Char) => {
          if (i == 0 && s == "" && c == '0') false else true
        }
      }
    }

    println(func1(0)("")('0'))
    println(func1(0)("")('1'))
    println(func1(23)("")('0'))
    println(func1(0)("hello")('0'))

    println("=" * 40)

    // 因为外层已经定义好了返回值类型，因此内层是确定的
    def func2(i: Int): String => (Char => Boolean) = {
      s => c => if (i == 0 && s == "" && c == '0') false else true
    }

    println(func2(0)("")('0'))
    println(func2(0)("")('1'))
    println(func2(23)("")('0'))
    println(func2(0)("hello")('0'))

    println("=" * 40)

    // 柯里化
    def func3(i: Int)(s: String)(c: Char): Boolean = {
      if (i == 0 && s == "" && c == '0') false else true
    }

    println(func3(0)("")('0'))
    println(func3(0)("")('1'))
    println(func3(23)("")('0'))
    println(func3(0)("hello")('0'))

  }
}
