package chapter05

object Test12_MyWhile {
  def main(args: Array[String]): Unit = {
    var n = 10
    // 1. 常规的while循环
    while (n >= 1) {
      println(n)
      n -= 1
    }

    println("=" * 40)

    // 传条件和需要执行的代码
    // 2. 用闭包实现一个函数，将代码块作为参数传入，递归调用
    // condition: =>Boolean 是作为条件的代码块
    // 传入一个代码块，其返回值是Boolean，因为n的值随着循环会发生变化
    // (=>Unit)=>Unit 是返回值的类型，即内层函数作为返回值返回
    def myWhile(condition: =>Boolean): (=>Unit)=>Unit = {
      // 内层函数需要递归调用，参数就是循环体
      // 参数是循环体代码块
      def doLoop(op: =>Unit): Unit = {
        if(condition) {
          op
          myWhile(condition)(op)
        }
      }
      doLoop _
    }

    n = 10
    // 小括号可以省略
    // myWhile(n >= 1)({})
    myWhile(n >= 1) {
      println(n)
      n -= 1
    }

    println("=" * 40)

    // 3. 用匿名函数实现(直接返回里面的匿名函数)
    def myWhile2(condition: =>Boolean): (=>Unit)=>Unit = {
      op => {
        if(condition) {
          op
          myWhile2(condition)(op)
        }
      }
    }

    n = 10
    myWhile2(n >= 1) {
      println(n)
      n -= 1
    }

    println("=" * 40)

    // 4. 用柯里化实现(这两个参数都是传名参数，即需要两段代码作为参数)
    // 最后的返回类型就是内层函数的返回值类型 Unit
    def myWhile3(condition: =>Boolean)(op: =>Unit): Unit = {
      if(condition) {
        op
        myWhile3(condition)(op)
      }
    }

    n = 10
    myWhile3(n >= 1) {
      println(n)
      n -= 1
    }
  }
}
