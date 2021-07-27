package chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {
    // (1) 字符串，通过+号连接
    var name: String = "alice"
    val age: Int = 10
    println(age + "岁的" + name + "在学校学习")

    // * 用于将一个字符串复制多次并拼接
    println(name * 3)

    // (2) printf用法: 字符串，通过%传值(%相当于占位符)
    printf("%d岁的%s在学校学习\n", age, name)

    // (3) 字符串模板(插值字符串)，通过$获取变量值
    println(s"${age}岁的${name}在学校学习")

    // 浮点数默认是Double，如果想要定义Float的需要转化
    val num: Double = 2.3456
    // val num: Float = 2.3456f
    println(s"The num is ${num}")
    // 格式化模板字符串，整个数的长度是2，.2表示当前浮点数保留两位小数
    println(f"The num is ${num}%2.2f")
    // 原始字符串，只填入变量其他的都按照原始的样子进行输出
    println(raw"The num si ${num}%2.2f")

    // 三引号表示字符串，保持多行字符串的原格式输出 stripMargin表示忽略边界并且不输出竖线
    val sql =
      s"""
         |select *
         |from
         |  student
         |where
         |  name = ${name}
         |and
         |  age > ${age}
         |""".stripMargin
    println(sql)
  }
}
