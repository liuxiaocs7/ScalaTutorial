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

    // 外层函数调用时返回f1对象地址直接退出了，内层函数无法拿到外层的变量i
    // 第一种办法是将外层参数继续传递到内层中，保存到下一层中，但是层层传递，大量耗费内存资源
    // 闭包：为内层函数依赖的对象保存下来，保证到时候调用的时候能够找到，通过打一个包的方式来进行保存
    // 延长了外部局部变量的生命周期，使得内层函数调用时还可以访问到外部变量
    // func(0)("")('0') 最先调用func，再调用f1，最后调用f2，等到f2压栈进来时，func和f1的局部变量都没有了
    // func底层也是一个对象实例，放在堆内存中，调用一个函数时相当于创建了一个它的对象实例，放到了堆内存中，
    // 在这个对象实例中，把相关的它所依赖的外部的环境和局部变量打包保存到这个对象实例中
    // heap中保存的内容不会因为方法执行的退出而消失，清除依赖于GC机制，栈里面虽然没有内容了，但是闭包里面还是有的

  }
}
