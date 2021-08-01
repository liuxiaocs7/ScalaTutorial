package chapter07

object Test04_List {
  def main(args: Array[String]): Unit = {
    // 1. 创建一个List
    // 只能使用伴生对象的apply方法来创建
    // sealed 关键字表示密封类，所有子类只能定义在这个文件里面
    val list1 = List(23, 65, 87)
    println(list1)

    // 2. 访问和遍历元素
    // 也可以直接通过下标获取
    println(list1(1))
    // 不能通过索引更改值
    // list1(1) = 12

    // 循环遍历输出
    list1.foreach(println)

    // 3. 添加元素，冒号结尾的调用顺序是从右到左
    // val list2 = list1.+:(10)
    val list2 = 10 +: list1
    // val list3 = list1:+(23)
    val list3 = list1 :+ 23
    println(list1)
    println(list2)
    println(list3)

    println("=" * 50)

    // 调用一个特殊的方法，无返回值，使用另一个变量接收
    // 将这个新的值添加到列表的开头
    val list4 = list2.::(51)
    println(list4)

    // 基于Nil创建一个新的列表
    val list5 = Nil.::(13)
    println(list5)

    val list6 = 73 :: 13 :: Nil
    val list7 = 17 :: 28 :: 59 :: 16 :: Nil
    println(list6)
    println(list7)

    val list8 = list6 :: list7
    // list7 调用函数，将list6【List(73,13)】添加到头部
    // List(List(13), 17, 28, 59, 16)
    println(list8)

    // ::: 表示将所有的元素都拆开然后放到一个列表里面 [扁平化]
    // list7 调用函数，将list6【List(73,13)】添加到头部
    // List(73, 13, 17, 28, 59, 16)
    val list9 = list6 ::: list7
    println(list9)
    println(list7.:::(list6))

    // 等价于上面的 :::
    val list10 = list6 ++ list7
    println(list10)
  }
}
