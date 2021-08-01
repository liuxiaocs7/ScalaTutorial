package chapter07

import scala.collection.mutable.ListBuffer

object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    // 1. 创建可变列表
    val list1: ListBuffer[Int] = new ListBuffer[Int]()
    // 使用伴生对象(推荐)
    val list2 = ListBuffer(12, 53, 75)

    println(list1)
    println(list2)

    println("=" * 50)

    // 2. 添加元素(使用英文名称的方法)
    list1.append(15, 62)
    list2.prepend(20)

    // 在下标为1的位置插入 (19, 22)
    list1.insert(1, 19, 22)

    println(list1)
    println(list2)

    println("=" * 50)

    // 冒号结尾的方法的结合顺序是从右到左
    31 +=: 96 +=: list1 += 25 += 11
    println(list1)

    println("=" * 50)

    // 3. 合并list
    // ++ 是创建一个新的，++= 是在调用者的基础上修改
    val list3 = list1 ++ list2
    println(list1)
    println(list2)
    println(list3)

    println("=" * 50)

    // list1 ++= list2
    // list2 调用 ++= 方法，最后得到的效果是list2改变，而list1不改变
    list1 ++=: list2
    println(list1)
    println(list2)

    println("=" * 50)

    // 4. 修改元素
    list2(3) = 40
    list2.update(0, 89)
    println(list2)

    // 5. 删除元素
    // 删除索引为2的元素
    list2.remove(2)
    list2 -= 25
    println(list2)
  }
}
