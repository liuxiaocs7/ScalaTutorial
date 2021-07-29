package chapter04

import scala.util.control.Breaks
import scala.util.control.Breaks._

object Test06_Break {
  def main(args: Array[String]): Unit = {
    // 1. 采用抛出异常的方式，退出循环
    try {
      for (i <- 0 until 5) {
        if (i == 3) {
          throw new RuntimeException()
        }
        println(i)
      }
    } catch {
      // 模式匹配
      case e: Exception => // 什么都不做，只是退出循环
    }
    println("这是循环外的代码")

    // 2. 使用Scala中的Breaks类的break方法，实现异常的抛出和捕捉
    // 表示接下来的代码是可中断的(本质上还是使用了抛出异常的方法解决了循环中途退出的功能)
    Breaks.breakable(
      for (i <- 0 until 5) {
        if (i == 3) {
          Breaks.break()
        }
        println(i)
      }
    )

    // 进一步简化，因为已经引入了所有的方法
    breakable(
      for (i <- 0 until 5) {
        if (i == 3) {
          break()
        }
        println(i)
      }
    )
  }
}
