package chapter04

/**
 * 输出九九乘法表
 */
object Test03_Practice_MulTable {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(s"$j * $i = ${i * j}\t")
      }
      println()
    }

    // 简写
    for (i <- 1 to 9; j <- 1 to i) {
      print(s"$j * $i = ${i * j}\t")
      // j == i的时候才换行，即执行外层循环里面的内容
      if (j == i) println()
    }
  }
}
