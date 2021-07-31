package chapter05

object Test09_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    // 1. 考虑固定一个加数的场景
    def addByFour(b: Int): Int = {
      4 + b
    }

    // 2. 扩展固定加数改变的情况
    def addByFive(b: Int): Int = {
      5 + b
    }

    // 3. 将固定加数作为另一个参数传入，但是是作为第一层参数传入
    def addByFour1(): Int => Int = {
      val a = 4
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    // 内层函数中用到了外层函数中的局部变量或参数 --> 闭包
    // 将外层的局部变量和内层的函数打包在一起存放在堆内存中
    def addByA(a: Int): Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }
    println(addByA(35)(24))

    // 指定第一个加数是4，返回一个函数，相当于配钥匙，这把钥匙可以开很多门
    val addByFour2 = addByA(4)
    // 指定第一个加数是5，返回一个函数
    val addByFive2 = addByA(5)

    // 4 + 13
    println(addByFour2(13))
    // 5 + 25
    println(addByFive2(25))

    // 4. Lambda表达式简写
    def addByA1(a: Int): Int => Int = {
      (b: Int) => {
        a + b
      }
    }

    // 进一步简化
    def addByA2(a: Int): Int => Int = {
      b => a + b
    }

    // 参数只在后面出现一次
    def addByA3(a: Int): Int => Int = a + _

    val addByFour3 = addByA3(4)
    val addByFive3 = addByA3(5)

    // 4 + 13
    println(addByFour3(13))
    // 5 + 25
    println(addByFive3(25))

    // 5. 柯里化，底层一定是一个闭包
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }

    println(addCurrying(35)(24))

  }
}
