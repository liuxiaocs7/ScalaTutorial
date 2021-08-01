package chapter07

object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    // 1. 创建数组  Int表示数组中每个元素的类型，10表示数组的长度，默认值是0
    // arr指向对象的地址不能被修改，数组的大小不能被修改，但是可以修改某个位置上的值
    val arr: Array[Int] = new Array[Int](5)

    // 另一种创建方式(有一个伴生对象，类似工厂方法) 最常使用apply()方法，写的时候可以省略apply()
    var arr2 = Array(12, 37, 42, 58, 97)

    // 2. 访问元素
    println(arr(0))
    println(arr(1))
    println(arr(4))
    // java.lang.ArrayIndexOutOfBoundsException
    // println(arr(5))

    // 修改元素
    arr(0) = 12
    arr(4) = 57
    println(arr(0))
    println(arr(1))
    println(arr(4))

    println("=" * 50)

    // 3. 数组的遍历
    // 1) 普通for循环
    for (i <- 0 until arr.length) {
      println(arr(i))
    }

    // indices 表示所有的索引，arr.indices可以直接获取数组的所有索引
    for (i <- arr.indices) println(arr(i))

    println("=" * 50)

    // 2) 直接遍历所有元素，增强for循环
    for (elem <- arr2) println(elem)

    println("=" * 50)

    // 3) Iterator迭代器遍历
    val iter = arr2.iterator
    while (iter.hasNext)
      println(iter.next())

    println("=" * 50)

    // 4) 调用foreach方法，传入一个函数，对当前集合中的每个元素都执行这个函数操作
    arr2.foreach((elem: Int) => println(elem))
    arr.foreach(println)

    // 所有的数据转化为String连接在一起，传入连字符
    // 将所有元素使用--连接在一起
    println(arr2.mkString("--"))

    println("=" * 50)

    // 4. 添加元素，数组本身是不可变的，得到一个新的数组并返回
    // 在数组arr2后面添加元素73，然后返回一个新的数组
    val newArr = arr2.:+(73)
    println(arr2.mkString("--"))
    println(newArr.mkString("--"))

    // 将传入的元素添加到最前面
    val newArr2 = newArr.+:(30)
    println(newArr2.mkString("--"))

    // 为了避免弄混，省略.号，直接改为空格
    // 在 newArr2 的后面添加元素15
    val newArr3 = newArr2 :+ 15
    // 如果省略之后方法以:结尾，那么右边是对象，左边是参数
    // 在 newArr3 的前面添加29
    val newArr4 = 29 +: newArr3
    // 连续追加多个数据
    val newArr44 = 19 +: 29 +: newArr3 :+ 26 :+ 73
    println(newArr44.mkString(", "))
  }
}
