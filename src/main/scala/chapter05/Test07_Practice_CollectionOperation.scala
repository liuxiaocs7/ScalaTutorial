package chapter05

object Test07_Practice_CollectionOperation {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(12, 45, 75, 98)
    // 对数组进行处理，将操作抽象出来，处理完毕之后的结果返回一个新的数组
    // 对每个数做操作
    def arrayOperation(array: Array[Int], op: Int => Int): Array[Int] = {
      // for循环的返回值是一个新的数组
      // 提取元素遍历集合，yield生成一个新的数组
      for (elem <- array) yield op(elem)
    }

    // 定义一个加一操作
    def addOne(elem: Int): Int = {
      elem + 1
    }

    // 调用函数
    val newArray: Array[Int] = arrayOperation(arr, addOne)
    // 将当前数组中的每个元素按照逗号，分开输出
    println(newArray.mkString(","))

    // 传入匿名函数，实现元素翻倍
    val newArray2 = arrayOperation(arr, _ * 2)
    println(newArray2.mkString(","))
  }
}
