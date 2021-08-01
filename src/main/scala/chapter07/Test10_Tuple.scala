package chapter07

object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    // 1. 创建元组  [字符串，整数，字符，布尔类型]
    // 元组的类型就是元组中每个元素的类型
    val tuple: (String, Int, Char, Boolean) = ("hello", 100, 'a', true)
    println(tuple)

    // 2. 访问数据
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)
  }
}
