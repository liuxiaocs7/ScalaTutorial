package chapter07

import scala.collection.mutable

object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    // 1. 创建Set 默认得到的是不可变的集合，因此定义时需要加上包名
    val set1 = mutable.Set[Int](13, 23, 53, 12, 13, 23, 78)
    println(set1)

    println("=" * 50)

    // 2. 添加元素
    // 2.1 使用+返回另一个set
    val set2 = set1 + 11
    println(set2)

    // 2.2 使用+=
    set1 += 11
    println(set1)

    // 2.3 使用add()方法，推荐使用
    // 第一次添加10这个元素的时候返回true
    val flag1 = set1.add(10)
    println(flag1)
    println(set1)

    val flag2 = set1.add(10)
    // 第二次再次添加时由于集合中已经有这个元素了因此会添加失败，返回false
    println(flag2)
    println(set1)

    // 3. 删除元素
    // 3.1 使用 -= 方法
    set1 -= 11
    println(set1)

    // 3.2 使用remove()方法，如果集合中存在这个元素则可以删除成功，返回true，否则返回alse
    val flag3 = set1.remove(10)
    println(flag3)
    println(set1)

    val flag4 = set1.remove(10)
    println(flag4)
    println(set1)

    println("=" * 50)

    // 4. 合并两个Set
    val set3 = mutable.Set[Int](13, 12, 13, 27, 98, 29)
    val set4 = set1 ++ set3
    println(set1)
    println(set3)
    println(set4)

    // 直接在set1上做操作
    set1 ++= set3
    println(set1)
  }
}
