package chapter02

import chapter01.Student

object Test07_DataType {
  def main(args: Array[String]): Unit = {
    // 1. 整数类型
    val a1: Byte = 127
    // 这个定义是错误的，越界了
    // val a2: Byte = 128
    val a2: Byte = -128

    // 整数默认类型为Int
    val a3 = 12
    // 超过Int的范围直接报错(integer number too large)
    // val a4 = 1324135436436
    // 这样写也是不对的
    // val a4: Long = 1324135436436
    // 长整型数值定义
    val a4 = 1324135436436L

    val b1: Byte = 10
    // 下面的定义在IDEA中有警告，但是实际上是没有问题的
    // val b2: Byte = 10 + 20
    // 这个编译的时候就是真的通不过了
    // 因为这个必须运行时才能确定，将b1的值拿过来+20计算看结果是否在Byte范围内
    // val b3: Byte = (b1 + 20)

    // 强制类型转化
    val b3: Byte = (b1 + 20).toByte
    println(b3)

    // 2. 浮点类型(默认类型时Double)
    // 在结尾添加f表示这是一个Float类型
    val f1: Float = 1.2345f
    val d1 = 34.2245

    // 3. 字符类型
    val c1: Char = 'a'
    println(c1)

    val c2: Char = '9'
    println(c2)

    // 特殊字符的表示
    // 制表符
    val c3: Char = '\t'
    // 换行符
    val c4: Char = '\n'
    println("abc" + c3 + "def")
    println("abc" + c4 + "def")

    // 转义字符
    // 表示\自身
    val c5 = '\\'
    // 表示"
    val c6 = '\"'
    println("abc" + c5 + "def")
    println("abc" + c6 + "def")

    // 字符变量底层保存的是对应的ASCII码
    // 将字符直接转化成Int类型的
    val i1: Int = c1
    println("i1: " + i1)
    val i2: Int = c2
    println("i2: " + i2)

    val c7: Char = (i1 + 1).toChar
    println(c7)
    // '9'的下一个字符
    val c8: Char = (i2 + 1).toChar
    println(c8)

    // 4. 布尔类型
    val isTrue: Boolean = true
    println(isTrue)

    // 5. 空类型
    // 5.1 空值Unit
    // BoxedUnit类的静态对象(单例设计模式)，重写了toString()方法
    def m1(): Unit = {
      println("m1被调用执行")
    }
    val a: Unit = m1()
    // ()
    println(a)
    // 5.2 空引用Null
    // Int类型无法接受一个空引用null作为它的值
    // val n: Int = null
    var student: Student = new Student("alice", 20)
    student = null
    println(student)
    // 5.3 Nothing
    // 没有正常返回值的方法的返回类型 (由于Nothing是所有的子类，完全兼容)
    def m2(n: Int): Int = {
      if(n == 0)
        throw new NullPointerException
      else
        return n
    }
    val b: Int = m2(2)
    println("b: " + b)
  }
}
