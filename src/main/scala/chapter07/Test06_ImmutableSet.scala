package chapter07

object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    // 1. 创建set，使用伴生对象的 apply() 方法
    val set1 = Set[Int](13, 23, 53, 12, 13, 23, 78)
    println(set1)

    println("=" * 40)

    // 2. 添加元素 +
    // set1的值不变，返回一个新的集合，只能写成 set1 + 129，因为调用的是集合的 .+() 方法
    val set2 = set1 + 129
    // val set2 = set1.+(20)
    println(set1)
    println(set2)

    println("=" * 40)

    // 3. 合并set
    // 将结果赋值给另外的一个集合
    val set3 = Set(19, 13, 23, 53, 67, 99)
    // 不能两个set直接相加，即不能+集合，只能+元素
    // val set4 = set2 + set3
    // 集合 集合 使用 ++ 来合并这两个集合
    val set4 = set2 ++ set3
    println(set2)
    println(set3)
    println(set4)

    println("=" * 40)

    // 4. 删除元素
    // 删除使用减法-
    val set5 = set3 - 13
    println(set3)
    println(set5)
  }
}
