package chapter05

import scala.annotation.tailrec

object Test10_Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
    println(tailFact(5))
  }

  // 递归实现计算阶乘
  def fact(n: Int): Int = {
    // if (n == 1) n else n * fact(n - 1)
     if(n == 0) return 1;
     n * fact(n - 1)
  }

  // 尾递归实现(所需空间小)
  def tailFact(n: Int): Int = {
    // currRes 保存之前计算结果
    // @tailrec 尾递归注解
    @tailrec
    def loop(n: Int, currRes: Int): Int = {
      if(n == 0) return currRes
      // 尾递归调用，每次调用时不需要保存上一层的信息，栈帧里面直接覆盖
      loop(n - 1, currRes * n)
    }
    loop(n, 1)
  }
}
