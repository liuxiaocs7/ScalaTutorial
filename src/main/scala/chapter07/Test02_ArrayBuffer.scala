package chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    // 1. 创建可变数组 (默认大小是16)
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    // 使用伴生对象创建
    var arr2 = ArrayBuffer(23, 57, 92)

    println(arr1)
    // ArrayBuffer已经自己重写了toString()方法，得到的结果：ArrayBuffer(23, 57, 92)
    println(arr2)

    // 2. 访问元素
    // 越界错误
    // println(arr1(0))
    println(arr2(1))
    arr2(1) = 39
    println(arr2(1))

    println("=" * 40)

    // 3. 添加元素
    // 后面添加 :+ 主要是针对不可变集合的
    val newArr1 = arr1 :+ 15
    println(arr1)
    println(newArr1)
    println(arr1 == newArr1)

    // 在可变数组后面添加元素
    // 在arr1后面附加元素15，然后将这个数组赋值给arr1，arr1的值就发生改变了
    val newArr2 = arr1 += 19
    println(arr1)
    println(newArr2)
    // 两者指向同一个引用
    println(arr1 == newArr2)
    newArr2 += 13
    println(arr1)

    // 在可变数据前面添加元素
    77 +=: arr1
    println(arr1)
    println(newArr2)

    // 对于不可变的推荐使用 +: :=
    // 对于可变的则推荐使用调用方法
    // append()表示在后面添加，prepend()表示在前面添加，均可以添加多个
    arr1.append(36)
    arr1.prepend(11, 76)
    println(arr1)
    // 在索引为1的位置添加多个元素
    arr1.insert(1, 13, 59)
    println(arr1)

    // 在某一个位置直接插入一个数组
    arr1.insertAll(1, newArr1)
    println(arr1)
    arr1.appendAll(newArr1)
    arr1.prependAll(newArr1)
    println(arr1)

    // 4. 删除元素
    // 删除索引为3的元素
    arr1.remove(3)
    println(arr1)

    // 删除从索引0开始的后面5个元素
    arr1.remove(0, 5)
    println(arr1)

    // 按照元素的值来删除
    // 如果找到了就删除，如果没找到就什么都不做
    arr1 -= 13
    println(arr1)
    arr1 -= 14
    println(arr1)

    // 5. 将可变数据转换为不可变数组
    val arr: ArrayBuffer[Int] = ArrayBuffer(23, 56, 98)
    val newArr: Array[Int] = arr.toArray
    println(newArr.mkString("--"))
    println(arr)

    // 6. 不可变数组转换为可变数组
    val buffer: mutable.Buffer[Int] = newArr.toBuffer
    println(buffer)
    println(newArr.mkString("--"))
  }
}
