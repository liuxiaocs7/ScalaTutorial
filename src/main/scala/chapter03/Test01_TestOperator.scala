package chapter03

object Test01_TestOperator {
  def main(args: Array[String]): Unit = {
    // 1. 算数运算符
    val result1 = 10 / 3
    println(result1)

    val result2: Double = 10 / 3
    println(result2)

    val result3: Double = 10.0 / 3
    // 保留两位小数，前面不足5位的用空格空出来
    println(result3.formatted("%5.2f"))

    val result4: Int = 10 % 3
    println(result4)

    // 2. 比较运算符
    val s1: String = "hello"
    val s2: String = new String("hello")

    // true  == 判断类似Java中调用equals()方法，判断的是内容
    // 自定义类中只有重写了equals()方法才能使用 == 进行判断
    println(s1 == s2)
    println(s1.equals(s2))
    // false    判断s1和s2的引用地址是否相等
    println(s1.eq(s2))

    println("=" * 20)

    // 3. 逻辑运算符
    def m(n: Int): Int = {
      println("m被调用")
      return n
    }
    var n = 1
    // 短路，前面的位false后面的就不进行计算了
    println((4 > 5) && (m(n) > 0))

    // 判断一个字符串是否为空
    def isNotEmpty(str: String): Boolean = {
      return str != null && !("".equals(str.trim))
    }
    println(isNotEmpty(null))
    println(isNotEmpty("   "))

    // 4. 赋值运算符
    var b: Byte = 10
    var i: Int = 12
    // Byte不能这样直接+
    // b += 1
    // 没有++，--，使用+=, -=来替代
    i += 1
    println(i)

    // 60: 0011 1100
    // 13: 0000 1101
    // 5. 位运算符
    val a: Byte = 60
    // 0000 0001 1110 0000
    // 结果自动转化为Int类型
    println(a << 3)
    println(a >> 2)

    // 0000 1101
    // 1111 0011
    val bb: Short = -13
    // 1100 1100 -> 0011 0100 -> -52 = -13 * 4
    println(bb << 2)
    // 这里与直接的整数除法是不同的
    // 1111 1100 -> 0000 0100 -> -4 = -13 / 4
    println(bb >> 2)
    // 无符号右移  -> 1073741820
    // 左边补的不是符号位，而是0
    println(bb >>> 2)

    // 6. 运算符的本质：对象的方法调用(一切皆对象)
    // Int类型的对象
    val n1: Int = 12
    val n2: Int = 37
    println(n1 + n2)
    // 调用+方法，传入参数n2
    println(n1.+(n2))
    // 省略.做方法调用，这里的空格表示省略的方法调用的.的结果；只有一个参数可以省略小括号
    println(n1 + n2)

    println(1.34.*(25))
    println(1.34 * 25)

    // 省略. 用一个空格来表示
    // 调用7.5 的toInt方法
    println(7.5 toInt)
  }
}
