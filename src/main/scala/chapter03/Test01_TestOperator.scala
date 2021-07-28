package chapter03

object Test01_TestOperator {
  def main(args: Array[String]): Unit = {
    // 1. 算数运算符
    val result1 = 10 / 3
    println(result1)

    val result2: Double = 10 / 3
    println(result2)

    val result3: Double = 10.0 / 3
    // 保留两位小数，前面不足5位的用空格空出来
    println(result3.formatted("%5.2f"))

    val result4: Int = 10 % 3
    println(result4)
  }
}
