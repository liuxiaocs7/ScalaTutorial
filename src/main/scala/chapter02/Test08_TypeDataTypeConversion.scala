package chapter02

object Test08_TypeDataTypeConversion {
  def main(args: Array[String]): Unit = {
    // (1) 自动提升原则：有多种类型的数据混合运算时，系统首先自动将所有数据转换成精度大的那种数据类型
    val a1: Byte = 10
    val b1: Long = 2353L
    val result1: Long = a1 + b1
    val result11: Int = (a1 + b1).toInt


    // (2) 把精度大的数据类型赋值给精度小的数据类型时，就会报错，反之就会进行自动类型转换
    val a2: Byte = 10
    val b2: Int = a2
    // 不能大赋值小
    // val c2: Byte = b2
    val c2: Byte = b2.toByte

    // (3) (byte, short)和char之间不会相互自动转换。
    val a3: Byte = 10
    val b3: Char = 'b'
    // required: Byte  found   : Char
    // val c3: Byte = b3
    // 如果c3是一个int就可以转换过来了
    val c3: Int = b3

    // (4) byte, short, char他们三者可以计算，在计算时首先转换为Int类型
    val a4: Byte = 12
    val b4: Short = 25
    val c4: Char = 'c'
    // 运算时先转化为Int
    val result4: Int = a4 + b4
    println(result4)
    val result44 = a4 + b4 + c4
    println(result44)

    // 2. 强制类型转换
    // (1) 将数据由高精度转换为低精度，就需要使用强制转换
    // 取整数部分
    val n1: Int = 2.9.toInt
    println(n1)
    val n11: Int = -2.9.toInt
    println(n11)
    // (2) 强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
    val n2: Int = 2.6.toInt + 3.7.toInt
    val n3: Int = (2.6 + 3.7).toInt
    println("n2: " + n2)
    println("n3: " + n3)

    // 3. 数值类型和String类型的转换
    // (1) 数值转String
    val n: Int = 27
    // val s: String = n.toString
    val s: String = n + ""
    println(s)

    // (2) String转数值
    val m: Int = "12".toInt
    val f: Float = "12.3".toFloat
    // "12.3"无法被解析成Int
    // val f2: Int = "12.3".toInt
    val f2: Int = "12.3".toDouble.toInt
    println(f2)
  }
}
