package chapter05

object Test05_Lambda {
  def main(args: Array[String]): Unit = {
    // 以String作为参数，Unit作为返回值的函数类型(String => Unit)
    val stringToUnit: String => Unit = (name: String) => {
      println(name)
    }
    // fun是一个函数类型，也是当前匿名函数的名字
    // 将匿名函数作为一个值赋值给一个变量
    val fun = stringToUnit
    fun("liuxiaocs")

    println("=" * 40)

    // 将匿名函数作为参数传递给另外一个函数
    // 定义一个函数，以函数作为参数输入(参数中的函数的类型是String => Unit)
    // 将操作作为一个参数传递进来
    def f(func: String => Unit): Unit = {
      // 调用函数(以String作为参数)
      // 使用函数func对数据进行一定的操作
      func("liuxiaocs")
    }

    f(fun)
    // 直接传递一个匿名函数
    f((name: String) => {
      println(name)
    })

    println("=" * 40)

    // 匿名函数的简化原则
    // (1) 参数的类型可以省略，会根据形参进行自动的推导
    // def f(func: String => Unit) 函数形参中已经定义好了
    f((name) => {
      println(name)
    })

    // (2) 类型省略之后，发现只有一个参数，则圆括号可以省略；其他情况：没有参数和参数超过1的永远不能省略圆括号。
    // 只是只有一个参数的时候可以省略
    f(name => {
      println(name)
    })

    // (3) 匿名函数如果只有一行，则大括号也可以省略
    f( name => println(name) )

    // (4) 如果参数只出现一次，则参数省略且后面参数可以用_代替
    // 参数名称没关系，_相当于上面的name
    f( println(_) )

    // (5) 如果可以推断出，当前传入的println是一个函数体，而不是调用语句，可以直接省略下划线
    // println直接作为一个函数传递进去
    f(println)
  }
}
